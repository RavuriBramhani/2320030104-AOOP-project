package com.chatapplication;

import java.util.ArrayList;
import java.util.List;

public class ChatApplication {
	
	class ChatSession {
        private List<User> users = new ArrayList<>();

        void join(User user) {
            users.add(user);
            System.out.println(user.getName() + " has joined the chat.");
        }

        void broadcastMessage(String message, User sender) {
            users.forEach(user -> {
                if (!user.equals(sender)) {
                    user.receiveMessage(message, sender);
                }
            });
        }
   
        void broadcastFilteredMessage(String message, User sender, MessageFilter filter) {
            users.forEach(user -> {
                if (!user.equals(sender) && filter.allowMessage(message)) {
                    user.receiveMessage(message, sender);
                }
            });
        }
    }

    interface MessageFilter {
        boolean allowMessage(String message);
    }

    class User {
        private String name;

        User(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }

        void sendMessage(ChatSession chatSession, String message) {
            System.out.println(name + " (Me): " + message);
            chatSession.broadcastMessage(message, this);
        }
        
        void sendFilteredMessage(ChatSession chatSession, String message, MessageFilter filter) {
            System.out.println(name + " (Me): " + message);
            chatSession.broadcastFilteredMessage(message, this, filter);
        }

     
        void receiveMessage(String message, User sender) {
            System.out.println(sender.getName() + ": " + message);
        }
    }
    
    

	public static void main(String[] args) {
		ChatApplication app = new ChatApplication();
        ChatSession chatSession = app.new ChatSession();

        User user1 = app.new User("Alice");
        User user2 = app.new User("Bob");

        chatSession.join(user1);
        chatSession.join(user2);

        user1.sendMessage(chatSession, "Hello, Bob!");
        
        user2.sendFilteredMessage(chatSession, "This is a filtered message", (message) -> message.contains("filtered"));
    
        user2.sendMessage(chatSession, "Hello, Alice!");
    }
		

	}


