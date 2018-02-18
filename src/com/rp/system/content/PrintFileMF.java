package com.rp.system.content;

import javax.servlet.http.HttpServletRequest;


//print file synch with main frame format
public class PrintFileMF {
	
	//layout  
	public String print(String type, HttpServletRequest request) {
		
		//Summary
		if(type.equalsIgnoreCase("maker") || type.equalsIgnoreCase("prod") || type.equalsIgnoreCase("cust")) {
			Summary decc = new Summary();
			return decc.print(type, request);
		}
			
		return "";
	}

}
