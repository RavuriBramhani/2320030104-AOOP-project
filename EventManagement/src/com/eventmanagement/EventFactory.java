package com.eventmanagement;

public class EventFactory {
	
	public Event createEvent(String name, int maxCapacity) {
        return new Event(name, maxCapacity);
    }

}
