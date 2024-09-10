package com.loggingsystem;

public class Client {

	public static void main(String[] args) {
		Loghandler infoHandler = new Infohandler();
        Loghandler debugHandler = new Debughandler();
        Loghandler errorHandler = new Errorhandler();

        infoHandler.setNext(debugHandler);
        debugHandler.setNext(errorHandler);

        Command infoCommand = new Logcommand(infoHandler, Level.INFO);
        Command debugCommand = new Logcommand(infoHandler, Level.DEBUG);
        Command errorCommand = new Logcommand(infoHandler, Level.ERROR);

        Logger logger = new Logger();
        logger.addCommand(infoCommand);
        logger.addCommand(debugCommand);
        logger.addCommand(errorCommand);

        logger.processCommands();

	}

}
