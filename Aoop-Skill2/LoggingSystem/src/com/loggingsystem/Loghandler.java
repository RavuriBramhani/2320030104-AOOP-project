package com.loggingsystem;

public abstract class Loghandler {

	protected Loghandler next;

    public void setNext(Loghandler next) {
        this.next = next;
    }

    public void handleRequest(Level level, String message) {
        if (canHandle(level)) {
            writeMessage(message);
        } else if (next != null) {
            next.handleRequest(level, message);
        }
    }

    protected abstract boolean canHandle(Level level);

    protected abstract void writeMessage(String message);

}
