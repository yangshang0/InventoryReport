package com.rp.system.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.rp.db.ConnectionManager;
import com.rp.db.ProfileDaoImpl;

public class Access extends HttpServlet {

	private static final long serialVersionUID = 8516201274516594801L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		String name="";
		String values="";
		try {
	    Object users = req.getSession().getAttribute("username");
	    name = users.toString();
	    values = req.getParameter("getTable");
	    System.out.println("value-table:"+values);
	    if(users == null) 
			{resp.sendRedirect(req.getContextPath() + "/login.jsp");}
		} catch (IOException e) {
			e.printStackTrace();
	    }
		
		
		if(name.equalsIgnoreCase("admin") && values.equalsIgnoreCase("Refresh Account")) {
			String table = getAllUser();
			req.setAttribute("table", table);
			req.getRequestDispatcher("tableList.jsp").forward(req, resp);
		}
		
		if(name.equalsIgnoreCase("admin") && values.equalsIgnoreCase("Enable Account")) {
			req.removeAttribute("table");
			String[] val = req.getParameterValues("access");
			String table = setEnableAcct(val);
			ProfileDaoImpl profDao = new ProfileDaoImpl();
			System.out.println(table);
			req.setAttribute("table", table);
			req.getRequestDispatcher("tableList.jsp").forward(req, resp);
		}
		
		if(name.equalsIgnoreCase("admin") && values.equalsIgnoreCase("Disable Account")) {
			req.removeAttribute("table");
			String[] val = req.getParameterValues("access");
			String table = setDisableAcct(val);
			System.out.println(table);
			req.setAttribute("table", table);
			req.getRequestDispatcher("tableList.jsp").forward(req, resp);
		}
		
		if(name.equalsIgnoreCase("admin") && values.isEmpty()) {
			req.setAttribute("table", "Please refresh to continue");
			RequestDispatcher dispatcher 
			= this.getServletContext().getRequestDispatcher("tableList.jsp");
			dispatcher.forward(req, resp);
		} 

		if(!name.equalsIgnoreCase("admin")){ 
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
		    requestDispatcher.forward(req, resp);
		    return;
		}
	}

	private String setDisableAcct(String[] val) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String getAcc = "UPDATE ACCOUNTMT SET ENABLED = 'N' WHERE USER_NAME in ( ";
		try {
	         //connect to DB
			 String accts = "";
	         con = ConnectionManager.getConnection();
	         for(int i=0; i< val.length; i++) {
	        	 if(!"Admin".equalsIgnoreCase(val[i])) {
	        		 accts = accts+"'"+val[i]+"'";
	        	 }
	         }
	         
	         if(!accts.isEmpty()) {
	        	 getAcc=getAcc+accts;
	         }
	         getAcc = getAcc+")";
	         System.out.println(getAcc);
	         ps = con.prepareStatement(getAcc);
	         rs = ps.executeQuery();
	         
	         while(rs.next()) {
	        	return "Updated Successfully! Refresh Table to view";
	         }
		    
	       } catch (Exception e){
	    	  e.printStackTrace();
	       } finally {
	    	    try { rs.close(); } catch (Exception e) { /* ignored */ }
	    	    try { ps.close(); } catch (Exception e) { /* ignored */ }
	    	    try { con.close(); } catch (Exception e) { /* ignored */ }
	       }
		return "Failed to Update!";
	}

	private String setEnableAcct(String[] val) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String getAcc = "UPDATE ACCOUNTMT SET ENABLED = 'Y' WHERE USER_NAME in ('Admin' ";
		try {
	         //connect to DB
			 String accts = "";
	         con = ConnectionManager.getConnection();
	         for(int i=0; i< val.length; i++) {
	        	 accts = accts+",'"+val[i]+"'";
	         }
	         
	         if(!accts.isEmpty()) {
	        	 getAcc=getAcc+accts;
	         }
	         getAcc = getAcc+")";
	         System.out.println(getAcc);
	         ps = con.prepareStatement(getAcc);
	         rs = ps.executeQuery();
	         
	         while(rs.next()) {
	        	return "Updated Successfully! Refresh Table to view";
	         }
		    
	       } catch (Exception e){
	    	  e.printStackTrace();
	       } finally {
	    	    try { rs.close(); } catch (Exception e) { /* ignored */ }
	    	    try { ps.close(); } catch (Exception e) { /* ignored */ }
	    	    try { con.close(); } catch (Exception e) { /* ignored */ }
	       }
		return "Failed to Update!";
	}

	private String getAllUser() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuilder table = new StringBuilder();
		String getAcc = "SELECT USER_NAME, ENABLED FROM ACCOUNTMT";
		try {
	         //connect to DB 
	         con = ConnectionManager.getConnection();
	 
	         ps = con.prepareStatement(getAcc);
	         rs = ps.executeQuery();
	         
	         table.append("<tr>");
        	 table.append("<th>USER NAME </th>");
        	 table.append("<th>ENABLED   </th>");
         	 table.append("</tr>");
         	
	         while(rs.next()) {
	        	table.append("<tr>");
	        	table.append("<td> "+rs.getString("USER_NAME")+ " </td>");
	        	table.append("<td> "+rs.getString("ENABLED")+ "</td>");
	        	table.append("<td> <input type=\"checkbox\" name=\"access\" value=\""+rs.getString("USER_NAME")+"\" /> </td>");
	        	table.append("</tr>");
	         }
		    
	       } catch (Exception e){
	    	  e.printStackTrace();
	       } finally {
	    	    try { rs.close(); } catch (Exception e) { /* ignored */ }
	    	    try { ps.close(); } catch (Exception e) { /* ignored */ }
	    	    try { con.close(); } catch (Exception e) { /* ignored */ }
	       }
		return table.toString();
	}
	
}
