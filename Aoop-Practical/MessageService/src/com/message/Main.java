package com.message;

public class Main {

	public static void main(String[] args) {
		 MessageService emailService = new EmailService();
	        Application emailApp = new Application(emailService);
	        emailApp.processMessage("Hello via Email!", "email@example.com");

	        MessageService smsService = new SMSService();
	        Application smsApp = new Application(smsService);
	        smsApp.processMessage("Hello via SMS!", "123-456-7890");

	}

}
