package com.bridgelabz.WindChill;

import org.apache.logging.log4j.Logger;



import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger Log = LogManager.getLogger(App.class);
	public static void main( String[] args )
	{
		// this section of the code will generate log file and print log message on console
		String message="Welcome ";
		Log.debug(message + " will be printed on Debug");
		Log.info(message + " Will be printed on info");
		Log.warn(message + " will be printed on warn");
		Log.error(message + " will be printed on error");
		Log.fatal(message + " will be printed on fatal");
		Log.info("Appending String: {}.", message);
		System.out.println(message);

		WindChill wc = new WindChill();
		wc.setT();
		wc.setV();
		wc.calcEffectiveTemperature();



	}
}
