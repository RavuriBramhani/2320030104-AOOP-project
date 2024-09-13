package com.message;

public class EmailService implements MessageService {
	
	public void sendMessage(String message, String recipient) {
        System.out.println("Email sent to " + recipient + " with message: " + message);
    }

}
