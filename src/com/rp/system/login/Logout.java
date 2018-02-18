package com.rp.system.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet  {

	private static final long serialVersionUID = -3717968483744098949L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
            response.setContentType("text/html");  
              
            request.getRequestDispatcher("login.jsp").include(request, response);  
			HttpSession session = request.getSession();
            session.invalidate(); 
            request.setAttribute("successMsg", "You have now logged out!");
            response.sendRedirect(request.getContextPath() + "/login.jsp");
    }  
} 

