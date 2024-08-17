package com.eventmanagement;

import java.util.ArrayList;
import java.util.List;

public class Event {
	
	private String name;
    private int maxCapacity;
    private List<Attendee> attendees;

    public Event(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.attendees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public boolean addAttendee(Attendee attendee) {
        if (attendees.size() < maxCapacity) {
            return attendees.add(attendee);
        }
        return false;
    }

    public boolean removeAttendee(Attendee attendee) {
        return attendees.remove(attendee);
    }

}
