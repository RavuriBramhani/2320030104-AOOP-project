package com.message;

public class SMSService implements MessageService {
	
	public void sendMessage(String message, String recipient) {
        System.out.println("SMS sent to " + recipient + " with message: " + message);
    }

}
