package com.rp.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MsgService {

	//Not yet implemented
	@WebMethod
	public String getServerInfo() {
		return "DM Server";
	}
	
}
