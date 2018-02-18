package com.rp.system.content;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* Download Files from the server.
 * Pdf reports available upon monthly updates
 */

public class Download extends HttpServlet {

		private static final long serialVersionUID = 1L;
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			doGet(req, resp);
		}
		
		protected void doGet(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			//response.setContentType("application/zip");
			String filename = "demo.zip";
			response.setContentType("APPLICATION/OCTET-STREAM");
			response.setHeader("Content-Disposition", "attachment; filename=\""
					+ filename + "\"");
		    response.setHeader("Cache-Control", "no-cache");
		    response.setHeader("Expires", "-1");


			try {
				String path = Download.class.getResource("/").toURI().resolve("../demo.zip").getPath();
				System.out.println(path);
				OutputStream out = response.getOutputStream();
				FileInputStream in = new FileInputStream(path);
				System.out.println(in.available());
				byte[] buffer = new byte[100000];
				int length;
				while ((length = in.read(buffer)) > 0){
				    out.write(buffer, 0, length);
				}
				in.close();
				out.flush();
				out.close();
				
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		}
		
		
}
