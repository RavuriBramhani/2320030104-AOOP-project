package com.bank;

public class Operations {
	
	private double balance = 1000.0; 

    public void viewBalance() {
        User session = User.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Current Balance for user " + session.getLoggedInUser() + ": $" + balance);
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    public void deposit(double amount) {
        User session = User.getInstance();
        if (session.isLoggedIn()) {
            balance += amount;
            System.out.println("Deposited $" + amount + " successfully. New Balance: $" + balance);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        User session = User.getInstance();
        if (session.isLoggedIn()) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + " successfully. New Balance: $" + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }

}
