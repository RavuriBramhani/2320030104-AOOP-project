package com.message;

public class Application {
	
	private MessageService messageService;

    public Application(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
   
        messageService.sendMessage(message, recipient);
    }

}
