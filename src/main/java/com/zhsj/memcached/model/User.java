package com.zhsj.memcached.model;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = -8821424120365081100L;
	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
