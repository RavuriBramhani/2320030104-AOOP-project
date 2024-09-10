package com.setsandmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactManager {
	private Set<String> contactNames; 
    private Map<String, Contact> contactMap; 

    public ContactManager() {
        contactNames = new HashSet<>();
        contactMap = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (!contactNames.contains(contact.getName())) {
            contactNames.add(contact.getName());
            contactMap.put(contact.getName(), contact);
            System.out.println("Contact added: " + contact.getName());
        } else {
            System.out.println("Contact with name " + contact.getName() + " already exists.");
        }
    }

    public void removeContact(String name) {
        if (contactNames.contains(name)) {
            contactNames.remove(name);
            contactMap.remove(name);
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact with name " + name + " does not exist.");
        }
    }

    public Contact getContact(String name) {
        return contactMap.get(name);
    }

    public void displayAllContacts() {
        if (contactMap.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (String name : contactNames) {
                System.out.println(contactMap.get(name));
            }
        }
    }

}
