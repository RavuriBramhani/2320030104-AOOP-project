package com.loggingsystem;



public class Infohandler extends Loghandler {
	
	@Override
    protected boolean canHandle(Level level) {
        return level == Level.INFO;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("INFO: " + message);
    }
}



