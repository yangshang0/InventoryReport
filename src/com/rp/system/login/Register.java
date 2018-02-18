package com.rp.system.login;

import java.io.IOException;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rp.db.ConnectionManager;

public class Register extends HttpServlet {
	
	private static final long serialVersionUID = 7954701319636640867L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String errorMessage = "Account cannot be created due to the following: \n";
		String success = "Account created successfully! \n Please contact adminstrator to enable your account.";
		boolean hasError = false;
		String name = request.getParameter("username");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		
		PreparedStatement ps = null;
		Connection con = null;

		try {
			con = ConnectionManager.getConnection();
			
			ps = con
					.prepareStatement("insert into ACCOUNTMT (ID, USER_NAME, PASSWORD, EMAIL, CREATE_DATE, ENABLED) "
							+ "values(accountmt_seq.nextVal, ?,?,?, sysdate, 'N')");
			//Change the value to N when admin account is set
			ps.setString(1, name);
			
			MessageDigest md = MessageDigest.getInstance("MD5");
	        byte[] passBytes = pass.getBytes();
	        md.reset();
	        byte[] digested = md.digest(passBytes);
	        StringBuffer sb = new StringBuffer();
	        for(int i=0;i<digested.length;i++){
	            sb.append(Integer.toHexString(0xff & digested[i]));
	        }

	        pass = sb.toString();
			ps.setString(2, pass);
			ps.setString(3, email);
			
			if(name.isEmpty() || pass.isEmpty() || email.isEmpty()) {
				hasError = true;
				errorMessage = "Name, Password or Email Cannot be Blank";
			} else {
				int i = ps.executeUpdate();
				if (i > 0) { 
					request.setAttribute("successMsg", success);
					request.getRequestDispatcher("login.jsp").include(request,response);
				} else {
					errorMessage = "Failed to create account!";
					hasError = true;
				}	
			}
		} catch (SQLIntegrityConstraintViolationException err) {
			err.printStackTrace();
			errorMessage = "Account already exist!";
			hasError = true;
		} catch (Exception e) {
			e.printStackTrace();
			errorMessage = e.getMessage();
			hasError = true;
		} finally {
    	    try { ps.close(); } catch (Exception e) { /* ignored */ }
    	    try { con.close(); } catch (Exception e) { /* ignored */ }
		}
		
		if (hasError) {
			// Store information in request attribute, before forward.
			request.setAttribute("errorString", errorMessage);

			RequestDispatcher dispatcher 
			= this.getServletContext().getRequestDispatcher("error.jsp");

			dispatcher.forward(request, response);
		}

	}

} 