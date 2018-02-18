package com.rp.system.content;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Report extends HttpServlet{

	/**
	 * Shang Y
	 */
	private static final long serialVersionUID = 6076624361337572921L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		doGet(req, resp);
	}
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) {
		try {
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		response.setHeader("Pragma", "no-cache");
	    Object users = request.getSession().getAttribute("username");
	    if(users == null) 
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		} catch (IOException e) {
			e.printStackTrace();
	    }
		
		try {
		String name = request.getParameter("save");
		String nameMF = request.getParameter("saveMF");
        
		/* write to file */
	    if(name != null && !name.isEmpty()) {
	        String date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
			String filename = "report-"+date+"-"+name+".txt";
			response.setContentType("APPLICATION/OCTET-STREAM");
			response.setHeader("Content-Disposition", "attachment; filename=\""
					+ filename + "\"");
		    response.setHeader("Cache-Control", "no-cache");
		    response.setHeader("Expires", "-1");
			PrintFile pf = new PrintFile();
			String text = pf.print(name, request);
			OutputStream out = response.getOutputStream();
			out.write(text.getBytes());
			out.flush();
			out.close();
	    }
	    
	    if(nameMF != null && !nameMF.isEmpty()) {
	        String date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
			String filename = "report-"+date+"-"+nameMF+".txt";
			response.setContentType("APPLICATION/OCTET-STREAM");
			response.setHeader("Content-Disposition", "attachment; filename=\""
					+ filename + "\"");
		    response.setHeader("Cache-Control", "no-cache");
		    response.setHeader("Expires", "-1");
			PrintFileMF pf = new PrintFileMF();
			String text = pf.print(nameMF, request);
			OutputStream out = response.getOutputStream();
			out.write(text.getBytes());
			out.flush();
			out.close();
	    }	    

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
