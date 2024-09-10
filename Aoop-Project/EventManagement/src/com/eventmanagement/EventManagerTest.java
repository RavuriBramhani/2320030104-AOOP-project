package com.eventmanagement;


class EventManagerTest {

	private EventManager eventManager;

	
    void setUp() {
        eventManager = new EventManager();
    }

   
    void testCreateEvent() {
       
        Event event = eventManager.createEvent("Java Conference", 100);

      
        System.out.println("Event created: " + event.getName());
        System.out.println("Max capacity: " + event.getMaxCapacity());
        System.out.println("Initial attendees: " + event.getAttendees().size());
    }

    
    void testBookTicket() {
     
        Event event = eventManager.createEvent("Java Conference", 2);

        
        boolean booking1 = eventManager.bookTicket(event, "John Doe");
        boolean booking2 = eventManager.bookTicket(event, "Jane Doe");

        
        System.out.println("Booking for John Doe: " + (booking1 ? "Success" : "Failed"));
        System.out.println("Booking for Jane Doe: " + (booking2 ? "Success" : "Failed"));
        System.out.println("Attendees after booking: " + event.getAttendees().size());

        
        boolean booking3 = eventManager.bookTicket(event, "Alice");

      
        System.out.println("Booking for Alice: " + (booking3 ? "Success" : "Failed"));
    }

   
    void testCancelTicket() {
       
        Event event = eventManager.createEvent("Java Conference", 2);
        eventManager.bookTicket(event, "John Doe");
        Attendee attendee = event.getAttendees().get(0);

       
        boolean cancellation = eventManager.cancelTicket(event, attendee);

       
        System.out.println("Cancellation of John Doe: " + (cancellation ? "Success" : "Failed"));
        System.out.println("Attendees after cancellation: " + event.getAttendees().size());
    }

   
    void testGetEvents() {
       
        eventManager.createEvent("Java Conference", 100);
        eventManager.createEvent("Python Conference", 50);

        
        System.out.println("Number of events managed: " + eventManager.getEvents().size());
        System.out.println("First event name: " + eventManager.getEvents().get(0).getName());
        System.out.println("First event capacity: " + eventManager.getEvents().get(0).getMaxCapacity());
        System.out.println("Second event name: " + eventManager.getEvents().get(1).getName());
        System.out.println("Second event capacity: " + eventManager.getEvents().get(1).getMaxCapacity());
    }

}
