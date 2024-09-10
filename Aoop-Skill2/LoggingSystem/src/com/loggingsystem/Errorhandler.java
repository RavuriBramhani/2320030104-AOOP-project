package com.loggingsystem;

public class Errorhandler extends Loghandler {
	
	protected boolean canHandle(Level level) {
        return level == Level.ERROR;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("ERROR: " + message);
    }

}
