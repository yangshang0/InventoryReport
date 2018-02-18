package com.rp.system.login;

import java.io.IOException;
import java.security.MessageDigest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rp.db.Profile;
import com.rp.db.ProfileDaoImpl;

public class Login extends HttpServlet {

	private static final long serialVersionUID = -7927505782477375108L;

	/**
	 * Login Controller
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		boolean hasError = false;
		String errorString = null;

		String name = req.getParameter("username");
		String pass = req.getParameter("pass");
		Profile user = new Profile();

		if (name.isEmpty() || pass.isEmpty()) {
			hasError = true;
			errorString = "Username and password cannot be empty!";
		} else {
			try {
				resp.setContentType("text/html");
				

				user.setUsers(name);
				
				MessageDigest md = MessageDigest.getInstance("MD5");
		        byte[] passBytes = pass.getBytes();
		        md.reset();
		        byte[] digested = md.digest(passBytes);
		        StringBuffer sb = new StringBuffer();
		        for(int i=0;i<digested.length;i++){
		            sb.append(Integer.toHexString(0xff & digested[i]));
		        }

		        pass = sb.toString();
				user.setPassword(pass);
				
				ProfileDaoImpl profileDao = new ProfileDaoImpl();
				System.out.println("Running setup");
				profileDao.setUp(); //this will only execute once. Will move it into script once other logic are good
				
				if (profileDao.login(user)) {
					HttpSession session = req.getSession();
					session.setAttribute("username", user.getUsers());
					req.getRequestDispatcher("mainFrame.jsp")
							.include(req, resp);
				} else {
					hasError = true;
					errorString = "Login failure may due to wrong user-id or password; <br>"+
								  "User-id or password does not exist, has expired, or has been disabled.";
				}
			} catch (Exception e) {
				e.printStackTrace();
				errorString = e.getMessage();
				hasError = true;
				req.setAttribute("errorString", errorString);
			}
		}
		if (hasError) {
			user = new Profile();
			user.setUsers(name);
			user.setPassword(pass);

			// Store information in request attribute, before forward.
			req.setAttribute("errorString", errorString);
			req.setAttribute("user", user);

			RequestDispatcher dispatcher 
			= this.getServletContext().getRequestDispatcher("error.jsp");

			dispatcher.forward(req, resp);
		}

	}

}
