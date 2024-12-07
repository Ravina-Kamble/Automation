package com.logger;


import org.apache.logging.log4j.*;

public class LoggerDemo {

	public static void main(String[] args) {
		
		
		Logger log =LogManager.getLogger();
		
		log.fatal("This is fatal");
		log.error("This is Error code");
		log.warn("This is an Warm code");
		log.info("This is info code");
		log.debug("This is debug code");
		log.trace("This is trace code");
		
		

	}

}
