package com.eventmanagement;

public class Attendee {
	
	private String name;
    private Ticket ticket;

    public Attendee(String name, Ticket ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public Ticket getTicket() {
        return ticket;
    }

}
