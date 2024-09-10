package com.setsandmaps;

public class Main {

	public static void main(String[] args) {
		ContactManager contactManager = new ContactManager();

        contactManager.addContact(new Contact("Alice", "123-456-7890", "alice@example.com"));
        contactManager.addContact(new Contact("Bob", "987-654-3210", "bob@example.com"));
        contactManager.addContact(new Contact("Charlie", "555-555-5555", "charlie@example.com"));

        System.out.println("\nAll Contacts:");
        contactManager.displayAllContacts();

        System.out.println("\nGetting contact details for Bob:");
        Contact bob = contactManager.getContact("Bob");
        if (bob != null) {
            System.out.println(bob);
        } else {
            System.out.println("Contact not found.");
        }

        System.out.println("\nRemoving Charlie's contact:");
        contactManager.removeContact("Charlie");

        System.out.println("\nAll Contacts after removal:");
        contactManager.displayAllContacts();
    

	}

}
