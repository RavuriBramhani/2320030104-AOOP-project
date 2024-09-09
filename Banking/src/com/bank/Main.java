package com.bank;

public class Main {

	public static void main(String[] args) {
		
		 Operations bankOps = new Operations();

	        User session = User.getInstance();

	        bankOps.viewBalance();
	        bankOps.deposit(500);
	        bankOps.withdraw(200);

	        session.login("john_doe", "password123");

	        bankOps.viewBalance();
	        bankOps.deposit(500);
	        bankOps.withdraw(200);

	        session.login("jane_doe", "password456");

	       
	        session.logout();

	        bankOps.viewBalance();

	}

}
