package com.rp.system.login;

import java.io.IOException;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rp.db.ConnectionManager;


public class Reset extends HttpServlet{

	private static final long serialVersionUID = -1723847957673754234L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		String name="";
		try {
	    Object users = request.getSession().getAttribute("username");
	    name = users.toString();
	    if(users == null) 
			{response.sendRedirect(request.getContextPath() + "/login.jsp");}
		} catch (IOException e) {
			e.printStackTrace();
	    }
		
		String pass = request.getParameter("pass");
		
		PreparedStatement ps = null;
		Connection con = null;
		
		try {
		MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] passBytes = pass.getBytes();
        md.reset();
        byte[] digested = md.digest(passBytes);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<digested.length;i++){
            sb.append(Integer.toHexString(0xff & digested[i]));
        }

        pass = sb.toString();

		con = ConnectionManager.getConnection();

		ps = con.prepareStatement("UPDATE ACCOUNTMT "+
								  "SET PASSWORD = ? "+
								  "WHERE USER_NAME = ? ");

		ps.setString(1, pass);
		ps.setString(2, name);
			
		int i = ps.executeUpdate();
		if (i > 0) { 
				request.getRequestDispatcher("login.jsp").include(request,response);
		}
		} catch (SQLIntegrityConstraintViolationException err) {
			err.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
    	    try { ps.close(); } catch (Exception e) { /* ignored */ }
    	    try { con.close(); } catch (Exception e) { /* ignored */ }
		}
		
//		String password = randomGenerator();
//		MessageDigest md;
//		try {
//			md = MessageDigest.getInstance("MD5");
//
//        byte[] passBytes = password.getBytes();
//        md.reset();
//        byte[] digested = md.digest(passBytes);
//        StringBuffer sb = new StringBuffer();
//        for(int i=0;i<digested.length;i++){
//            sb.append(Integer.toHexString(0xff & digested[i]));
//        }
//        //String message = "Your password has been set to "+password+" please log-in and change the password.";
//        password = sb.toString();
//		} catch (NoSuchAlgorithmException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		RequestDispatcher dispatcher 
//		= this.getServletContext().getRequestDispatcher("login.jsp");
//		dispatcher.forward(request, response);
	}

//	private String randomGenerator() {
//		String condition = "abcdefghijklmnopqrstuvwxyz1234567890";
//		int max = 6;
//		Random rand = new Random();
//		String pass = "";
//		int randomNum;
//		for(int index=0; index < max; index++) {
//			randomNum = rand.nextInt((condition.length()-1 - 0) + 1) + 0;
//			pass = pass+condition.charAt(randomNum);
//		}
//		return pass;
//	}
}
