package com.ride;

public class UserAuthentication {
	
	private static UserAuthentication instance;
	private UserAuthentication() { }
	public static UserAuthentication getInstance() {
	 
    if(instance==null){
	instance=new UserAuthentication();
	}
	  return instance;
	}
	public boolean authenticateUser(String username, String password){
	
		return true;
	
	}

}
