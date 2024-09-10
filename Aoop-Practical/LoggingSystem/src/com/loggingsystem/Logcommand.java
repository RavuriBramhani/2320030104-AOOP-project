package com.loggingsystem;

public class Logcommand implements Command {
	
	private Loghandler handler;
    private Level level;

    public Logcommand(Loghandler handler, Level level) {
        this.handler = handler;
        this.level = level;
    }

  
    public void execute(String message) {
        handler.handleRequest(level, message);
    }

}
