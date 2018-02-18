package com.rp.system.content;

import javax.servlet.http.HttpServletRequest;

public class PrintFile {

	public String print(String type, HttpServletRequest request) {
		
		if(type.equalsIgnoreCase("inv"))
			return inv(request);
		
		if(type.equalsIgnoreCase("prod"))
			return prod(request);
		
		
		if(type.equalsIgnoreCase("cust"))
			return cust(request);
		
		
		if(type.equalsIgnoreCase("rp"))
			return rp(request);
		
		return "";
	}
	
	
	public String inv(HttpServletRequest request) {

		return 
				//Account
				space(request.getParameter("scardail"),6)+
				space(request.getParameter("scardarsc"),6)+
				space(request.getParameter("scardarsc2"),6)+
				space(request.getParameter("scardarsc3"),6)+
				space(request.getParameter("scardadpd"),6)+
				space(request.getParameter("scardapb"),6)+
				space(request.getParameter("scatldbil"),6)+
				space(request.getParameter("scatldbrsc"),6)+
				space(request.getParameter("scatldbrsc2"),6)+
				space(request.getParameter("scatldbrsc3"),6)+
				space(request.getParameter("scatldbpd"),6)+
				space(request.getParameter("scatldbpb"),6)+
	
				space(request.getParameter("scdaop"),6)+
			    space(request.getParameter("scdaos"),6)+
			    space(request.getParameter("scdaoco"),6)+
			    space(request.getParameter("scdaog"),6)+
			    space(request.getParameter("scdcob"),6)+
		
	
				space(request.getParameter("sbo"),6)+
				space(request.getParameter("sbrs"),6)+
				space(request.getParameter("sbrs2"),6)+
				space(request.getParameter("sbrs3"),6)+
				space(request.getParameter("sbrs4"),6)+
				space(request.getParameter("sbrs5"),6)+
				space(request.getParameter("sbrs6"),6)+
				space(request.getParameter("sbrs7"),6)+
				space(request.getParameter("sbbg"),6)+
				space(request.getParameter("sbac"),6)+
				space(request.getParameter("sbdd"),6)+
				space(request.getParameter("sbup"),6)+
		

				space(request.getParameter("sbrsc"),6)+
				space(request.getParameter("sbrsc2"),6)+
				space(request.getParameter("sbrsc3"),6)+
				space(request.getParameter("sbrsc4"),6)+
				space(request.getParameter("sbcob"),6)+
				space(request.getParameter("sbciic"),6)+
				space(request.getParameter("sb2rsc"),6)+
				space(request.getParameter("sb2rsc2"),6)+
				space(request.getParameter("sb2rsc3"),6)+
				space(request.getParameter("sb2rsc4"),6)+
				space(request.getParameter("sb2cob"),6)+
				space(request.getParameter("sb2d"),6)+
				space(request.getParameter("sb2ciic"),6)+
		
	
				space(request.getParameter("srbbo"),6)+
				space(request.getParameter("srbbrs"),6)+
				space(request.getParameter("srbbbg"),6)+
				space(request.getParameter("srbbac"),6)+
				space(request.getParameter("srbbdd"),6)+
				space(request.getParameter("srbbolp"),6)+
				space(request.getParameter("srbbola"),6)+
				space(request.getParameter("srbbup"),6)+
		

				space(request.getParameter("ilcc1pd1dd"),2)+
				space(request.getParameter("ilcc1pd1ocs"),3)+
				space(request.getParameter("ilcc1pd1obs"),3)+
				space(request.getParameter("ilcc1pd2dd"),2)+
				space(request.getParameter("ilcc1pd2ocs"),3)+
				space(request.getParameter("ilcc1pd2obs"),3)+
				space(request.getParameter("ilcchrd1dd"),2)+
				space(request.getParameter("ilcchrd1pc"),2)+
				space(request.getParameter("ilcchrd1pc2"),2)+
				space(request.getParameter("ilcchrd1pc3"),2)+
				space(request.getParameter("ilcchrd1pc4"),2)+
				space(request.getParameter("ilcchrd1pc5"),2)+
				space(request.getParameter("ilcchrd1cc"),2)+
				space(request.getParameter("ilcchrd1cc2"),2)+
				space(request.getParameter("ilcchrd1cc3"),2)+
				space(request.getParameter("ilcchrd1bs"),3)+
				space(request.getParameter("ilcchrd2dd"),2)+
				space(request.getParameter("ilcchrd2t1dd"),2)+
				space(request.getParameter("ilcchrd2t3dd"),2)+
				space(request.getParameter("ilcchrd2t6dd"),2)+
				space(request.getParameter("ilcchrd2ubs"),3)+
				space(request.getParameter("ilcchrd2pc"),2)+
				space(request.getParameter("ilcchrd2pc2"),2)+
				space(request.getParameter("ilcchrd2pc3"),2)+
				space(request.getParameter("ilcchrd2pc4"),2)+
				space(request.getParameter("ilcchrd2pc5"),2)+
				space(request.getParameter("ilcchrd2cc"),2)+
				space(request.getParameter("ilcchrd2cc2"),2)+
				space(request.getParameter("ilcchrd2cc3"),2)+
				space(request.getParameter("ilcchrd2d"),3)+
				space(request.getParameter("ilcchrd2ocs"),3)+
				space(request.getParameter("ilcchrd2obs"),3)+
				space(request.getParameter("ilcchrd2bs"),3)+
				space(request.getParameter("ilccmrddd"),2)+
				space(request.getParameter("ilccmrdd"),3)+
				space(request.getParameter("ilcclrddd"),2)+
				space(request.getParameter("ilcclrdubs"),3)+
				space(request.getParameter("ilcclrdd"),3)+
				space(request.getParameter("ilcclrdocs"),3)+
				space(request.getParameter("ilcclrdobs"),3)+
				space(request.getParameter("ilcclrdbs"),3)+
				space(request.getParameter("ilccdadd"),2)+
				space(request.getParameter("ilcczbaprb"),6)+
				space(request.getParameter("ilcczbapb"),6)+
				space(request.getParameter("ilcczbalado"),8)+
		
		
				space(request.getParameter("hecc1pdaifpd"),6)+
				space(request.getParameter("hecc1pddd"),6)+
				space(request.getParameter("hecc1pdspc"),6)+
				space(request.getParameter("hecc1pdspc2"),6)+
				space(request.getParameter("hecc1pdspc3"),6)+
				space(request.getParameter("hecc1pdspc4"),6)+
				space(request.getParameter("hecc1pdltv"),6)+
				space(request.getParameter("hecc1pdbs"),6)+
				space(request.getParameter("hecchrddd"),6)+
				space(request.getParameter("hecchrdt6dd"),6)+
				space(request.getParameter("hecchrdspc"),6)+
				space(request.getParameter("hecchrdspc2"),6)+
				space(request.getParameter("hecchrdspc3"),6)+
				space(request.getParameter("hecchrdspc4"),6)+
				space(request.getParameter("hecchrdltv"),6)+
				space(request.getParameter("hecchrdt3dd"),6)+
				space(request.getParameter("hecchrdbs"),6)+
				space(request.getParameter("heccoaaio"),6)+
				space(request.getParameter("heccoaola"),6)+
				space(request.getParameter("heccolpoa"),6)+
				space(request.getParameter("hecc1pd2dd"),6)+
				space(request.getParameter("hecc1pd2aifpd"),6)+
				space(request.getParameter("hecc1pd2ltv"),6)+
				space(request.getParameter("heccmrddd"),6)+
				space(request.getParameter("heccmrdspc"),6)+
				space(request.getParameter("heccmrdspc2"),6)+
				space(request.getParameter("heccmrdspc3"),6)+
				space(request.getParameter("heccmrdspc4"),6)+
				space(request.getParameter("heccmrdltv"),6)+
				space(request.getParameter("heccmrdt3dd"),6)+
				space(request.getParameter("heccmrdbs"),6)+
				space(request.getParameter("heccdadd"),6);
	}
	
	public String prod(HttpServletRequest request){
		return 
				space(request.getParameter("afssu"),6)+
				space(request.getParameter("afssu2"),6)+
				space(request.getParameter("afspa"),6)+
				space(request.getParameter("afsco"),6)+
				space(request.getParameter("afsco2"),6)+
				space(request.getParameter("afsco3"),6)+
				space(request.getParameter("afspg"),6)+
				space(request.getParameter("afspg2"),6)+
				space(request.getParameter("afssc"),6)+
				space(request.getParameter("afsdd"),6)+
				space(request.getParameter("afsdiv"),6)+
				space(request.getParameter("afsdiv2"),6)+
				space(request.getParameter("afsdiv3"),6)+
				space(request.getParameter("afsdiv4"),6)+
				space(request.getParameter("afsdiv5"),6)+
				space(request.getParameter("afsdiv6"),6)+
				space(request.getParameter("afsdiv7"),6)+
				space(request.getParameter("afsdiv8"),6)+
				space(request.getParameter("afsdiv9"),6)+
				space(request.getParameter("afsdiv10"),6)+
				space(request.getParameter("afsdiv11"),6)+
				space(request.getParameter("afsdiv12"),6)+
				space(request.getParameter("afsdiv13"),6)+
				space(request.getParameter("afsdiv14"),6)+
				space(request.getParameter("afsdiv15"),6)+
				space(request.getParameter("afsdiv16"),6)+
				space(request.getParameter("afsdiv17"),6)+
				space(request.getParameter("afsdiv18"),6);
	}
	
	public String cust(HttpServletRequest request){
		return 
				space(request.getParameter("clsmm"),6)+
				space(request.getParameter("clsr"),6)+
				space(request.getParameter("clspa"),6)+
				space(request.getParameter("clsdd"),6)+
				space(request.getParameter("clsg1"),6)+
				space(request.getParameter("clsg2"),6);
	}
	
	public String rp(HttpServletRequest request){
		return 
	
				space(request.getParameter("tsysbba"),6)+
				space(request.getParameter("tsysdd"),6)+
				space(request.getParameter("tsysolp"),6)+
				space(request.getParameter("tsysola"),6)+
				
		
				space(request.getParameter("oacifpd"),1)+
				space(request.getParameter("oacolp"),3)+
				space(request.getParameter("oacola"),4)+
				space(request.getParameter("hrddd"),2)+
				space(request.getParameter("hrdt30dd"),2)+
				space(request.getParameter("hrdt60dd"),2)+
				space(request.getParameter("hrdt90dd"),2)+
				space(request.getParameter("hrdubs"),3)+
				space(request.getParameter("hrdbs"),3)+
				space(request.getParameter("hrdtsi"),6)+
				space(request.getParameter("hrdts"),3)+
				space(request.getParameter("lrddd"),2)+
				space(request.getParameter("o1difpd"),1)+
				space(request.getParameter("o1dolp"),3)+
				space(request.getParameter("o1dola"),4)+
				space(request.getParameter("fpdifpd"),1)+
				space(request.getParameter("fpddd"),2)+
				space(request.getParameter("mrddd"),2)+
				space(request.getParameter("mrdubs"),3)+
				space(request.getParameter("mrdbs"),3);
	}
	
	public String spaces(String s){
		int space = 45;
		String dash = "";
		if(space - s.length() > 1) {
			for(int i=0; i< space-s.length(); i++){
				dash += "-";
			}
		}
		return dash;
	}
	
	public static String space(String s, int length) {
		String space="";
		
		if(s.length() < length) {
			int diff= length-s.length();
			for(int i=0; i<diff; i++){
				space+=" ";
			}
			s=s+space;
		}
		
		return s;
	}
}
