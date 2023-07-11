package day02.practice;

public class Logger {
	
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	
	public static void debug (int num) {
		// TODO Complete this code
		System.out.println("DEBUG: " + num);
	}
	
	
	public static void info (String msg) {
		// TODO complete this code using the above template
		System.out.println("INFO: " + msg);
	}
	
	public static void info (int num) {
		// TODO complete this code using the above template
		System.out.println("INFO: " + num);
	}
	
	public static void error (String msg) {
		// TODO complete this code using the above template
		System.out.println("ERROR: " + msg);
	}
	
	public static void error (int num) {
		// TODO complete this code using the above template
		System.out.println("ERROR: " + num);
	}
	
	
	
	

	public static void main(String[] args) {
      
		
		Logger.debug("It is debug");
		Logger.info("This is informetion");
		Logger.error("This is error");
		Logger.debug(10);
		Logger.info(5);
		Logger.error(1);
		
		

	}

}
