package com.log;

public class logger {
	
	private static logger loggerInstance;

    private logger() {
      
        System.out.println("Logger Initialized.");
    }

    public static logger getInstance() {
     
        if (loggerInstance == null) {
            loggerInstance = new logger();
        }
        return loggerInstance;
    }

  
    public void log(String message) {
       
        System.out.println("Log Message: " + message);
    }
}



	