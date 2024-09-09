package com.bank;

public class User {
	
	private static User sessionInstance;  
    private boolean isLoggedIn = false;     
    private String loggedInUser = "";     

    private User() {
        
    }

    public static User getInstance() {
        if (sessionInstance == null) {
            sessionInstance = new User();
        }
        return sessionInstance;
    }

    public boolean login(String username, String password) {
       
        if (!isLoggedIn) {
            loggedInUser = username;
            isLoggedIn = true;
            System.out.println("User " + username + " logged in successfully.");
            return true;
        } else {
            System.out.println("User " + loggedInUser + " is already logged in.");
            return false;
        }
    }

    public void logout() {
        if (isLoggedIn) {
            System.out.println("User " + loggedInUser + " logged out.");
            isLoggedIn = false;
            loggedInUser = "";
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }

}
