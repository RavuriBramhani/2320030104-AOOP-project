package com.loggingsystem;

public class Debughandler extends Loghandler {
	
	protected boolean canHandle(Level level) {
        return level == Level.DEBUG;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("DEBUG: " + message);
    }
	
}
