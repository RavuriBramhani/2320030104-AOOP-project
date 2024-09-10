package com.log;

public class Application {

	public static void main(String[] args) {
		
      logger logger1 = logger.getInstance();
      
        logger1.log("Application started.");
        logger1.log("Processing data...");

        logger logger2 = logger.getInstance();
        logger2.log("Data processed successfully.");
        
        System.out.println(logger1 == logger2); 

	}

}
