package com.eventmanagement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 EventManager eventManager = new EventManager();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nEvent Management System");
	            System.out.println("1. Create Event");
	            System.out.println("2. Book Ticket");
	            System.out.println("3. Cancel Ticket");
	            System.out.println("4. List Events");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter event name: ");
	                    String eventName = scanner.nextLine();
	                    System.out.print("Enter max capacity: ");
	                    int maxCapacity = scanner.nextInt();
	                    scanner.nextLine();  

	                    Event event = eventManager.createEvent(eventName, maxCapacity);
	                    System.out.println("Event created: " + event.getName() + " with max capacity " + event.getMaxCapacity());
	                    break;

	                case 2:
	                    System.out.println("Available Events:");
	                    for (int i = 0; i < eventManager.getEvents().size(); i++) {
	                        System.out.println((i + 1) + ". " + eventManager.getEvents().get(i).getName());
	                    }
	                    System.out.print("Choose an event to book a ticket: ");
	                    int eventChoice = scanner.nextInt();
	                    scanner.nextLine(); 
	                    Event selectedEvent = eventManager.getEvents().get(eventChoice - 1);
	                    System.out.print("Enter attendee name: ");
	                    String attendeeName = scanner.nextLine();

	                    if (eventManager.bookTicket(selectedEvent, attendeeName)) {
	                        System.out.println("Ticket booked for " + attendeeName);
	                    } else {
	                        System.out.println("Failed to book ticket. Event might be full.");
	                    }
	                    break;

	                case 3:
	                    System.out.println("Available Events:");
	                    for (int i = 0; i < eventManager.getEvents().size(); i++) {
	                        System.out.println((i + 1) + ". " + eventManager.getEvents().get(i).getName());
	                    }
	                    System.out.print("Choose an event to cancel a ticket: ");
	                    int cancelEventChoice = scanner.nextInt();
	                    scanner.nextLine();  

	                    Event cancelEvent = eventManager.getEvents().get(cancelEventChoice - 1);
	                    System.out.println("Event Attendees:");
	                    for (int i = 0; i < cancelEvent.getAttendees().size(); i++) {
	                        System.out.println((i + 1) + ". " + cancelEvent.getAttendees().get(i).getName());
	                    }
	                    System.out.print("Choose an attendee to cancel the ticket: ");
	                    int attendeeChoice = scanner.nextInt();
	                    scanner.nextLine(); 

	                    Attendee cancelAttendee = cancelEvent.getAttendees().get(attendeeChoice - 1);
	                    if (eventManager.cancelTicket(cancelEvent, cancelAttendee)) {
	                        System.out.println("Ticket canceled for " + cancelAttendee.getName());
	                    } else {
	                        System.out.println("Failed to cancel ticket.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("List of Events:");
	                    System.out.println("Java Conference");
	                    System.out.println("Python Conference");
	                    
	                    for (Event ev : eventManager.getEvents()) {
	                        System.out.println("Event: " + ev.getName() + ", Max Capacity: " + ev.getMaxCapacity() + ", Attendees: " + ev.getAttendees().size());
	                    }
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }

	}

}
