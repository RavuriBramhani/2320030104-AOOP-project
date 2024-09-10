package com.eventmanagement;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
	
	private List<Event> events;

    public EventManager() {
        this.events = new ArrayList<>();
    }

    public Event createEvent(String Java, int maxCapacity) {
        Event event = new Event(Java, 50);
        events.add(event);
        return event;
    }

    public boolean bookTicket(Event event, String attendeeName) {
        if (event.getAttendees().size() < event.getMaxCapacity()) {
            Ticket ticket = new Ticket("TICKET-" + (event.getAttendees().size() + 1), event);
            Attendee attendee = new Attendee(attendeeName, ticket);
            return event.addAttendee(attendee);
        }
        return false;
    }

    public boolean cancelTicket(Event event, Attendee attendee) {
        return event.removeAttendee(attendee);
    }

    public List<Event> getEvents() {
        return events;
    }

}
