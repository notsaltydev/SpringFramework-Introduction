package info.notsalty.springtutorial.implementation;

import java.util.Date;

import info.notsalty.springtutorial.api.Logger;

public class LoggerImpl implements Logger {

	public void log(String message) {
		System.out.println(new Date() + ": " + message);
	}

}
