package com.eventmanagement;

public class Ticket {
	
	private String id;
    private Event event;

    public Ticket(String id, Event event) {
        this.id = id;
        this.event = event;
    }

    public String getId() {
        return id;
    }

    public Event getEvent() {
        return event;
    }

}
