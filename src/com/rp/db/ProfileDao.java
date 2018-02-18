package com.rp.db;

import java.util.Date;
import java.util.List;

public interface ProfileDao {
	
	public long getId(String userName);
	public List<String> getUser(long id);
	public List<String> getUserByDate(Date date);
	public List<String> getUserByAccountType(String accountType);
	public List<String> getAccountTypeByUser(String user);
	
	
}
