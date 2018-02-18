package com.rp.db;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

public class ProfileDaoImpl implements ProfileDao {

	public boolean login(Profile user){
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String name = user.getUsers();
		String pass = user.getPassword();
		String getAcc = "SELECT * FROM ACCOUNTMT WHERE UPPER(USER_NAME) = ? AND PASSWORD = ? AND ENABLED = 'Y'";
		try {
	         con = ConnectionManager.getConnection();
	 
	         ps = con.prepareStatement(getAcc);
	         name = name.toUpperCase();
	         ps.setString(1, name);
	         ps.setString(2, pass);
	         
	         rs = ps.executeQuery();
         
		    if(rs.next()) {
		       return true;
		    }
		    
	       } catch (Exception e){
	    	  e.printStackTrace();
	       } finally {
	    	    try { rs.close(); } catch (Exception e) { /* ignored */ }
	    	    try { ps.close(); } catch (Exception e) { /* ignored */ }
	    	    try { con.close(); } catch (Exception e) { /* ignored */ }
	       }
		return false;
		
	}
	
	public void setUp() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String getAcc = "SELECT * FROM ACCOUNTMT WHERE USER_NAME = 'Admin'";
		try {
	         //connect to DB 
	         con = ConnectionManager.getConnection();
	         
	         ps = con.prepareStatement(getAcc);
	         
	         rs = ps.executeQuery();
	         
		    if (!rs.isBeforeFirst()) {
		    	
		    	ps = con.prepareStatement("Insert into ACCOUNTMT (ID, USER_NAME, PASSWORD, EMAIL, CREATE_DATE, ENABLED) "
						+ "values(accountmt_seq.nextVal, 'Admin',?,'Admin', sysdate, 'Y')");
				String pass = "admin"; //default password for admin
				MessageDigest md = MessageDigest.getInstance("MD5");
		        byte[] passBytes = pass.getBytes();
		        md.reset();
		        byte[] digested = md.digest(passBytes);
		        StringBuffer sb = new StringBuffer();
		        for(int i=0;i<digested.length;i++){
		            sb.append(Integer.toHexString(0xff & digested[i]));
		        }
		        pass = sb.toString();
				ps.setString(1, pass);
				ps.executeUpdate();
		    } 

	       } catch (Exception e){
	    	  e.printStackTrace();
	       } finally {
	    	    try { rs.close(); } catch (Exception e) { /* ignored */ }
	    	    try { ps.close(); } catch (Exception e) { /* ignored */ }
	    	    try { con.close(); } catch (Exception e) { /* ignored */ }
	       }
	}
	
	@Override
	public long getId(String userName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> getUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getUserByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getUserByAccountType(String accountType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAccountTypeByUser(String user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
