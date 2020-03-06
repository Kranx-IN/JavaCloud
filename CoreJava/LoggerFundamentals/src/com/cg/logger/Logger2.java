package com.cg.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Logger2 {
	
	private static Logger logger = Logger.getRootLogger();

	public static void main(String[] args) {
		
		BasicConfigurator.configure();                                                                                                                                               
		logger.setLevel(Level.INFO);
		
		logger.debug("Debut message");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error message");
		logger.fatal("fatal message");
	}

}
