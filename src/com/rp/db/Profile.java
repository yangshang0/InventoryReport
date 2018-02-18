package com.rp.db;

import java.util.Date;

public class Profile {
	/** User Account Profile 
	 * user - name of the user
	 * password - for the user to set
	 * accountType - Admin access / regular access
	 * createDate - date of account creation
	*/
	private long id;
	private String users;
	private String password;
	private String accountType;
	private Date createDate;
	private boolean valid;

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}


	@Override
	public String toString() {
		return "Profile [id=" + id + "\nusers=" + users + "\npassword="
				+ password + "\naccountType=" + accountType + "\ncreateDate="
				+ createDate + "\nvalid=" + valid + "]";
	}
	
}
