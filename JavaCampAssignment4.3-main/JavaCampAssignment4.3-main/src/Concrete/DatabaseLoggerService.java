package Concrete;

import Abstract.LoggerService;

public class DatabaseLoggerService implements LoggerService {

	public void Log(DatabaseLoggerService databaseLoggerService) {
		System.out.println("Logged to Database");
	}
	
	public void Log() {
		System.out.println("Logged to Database ! ");
	}
}

