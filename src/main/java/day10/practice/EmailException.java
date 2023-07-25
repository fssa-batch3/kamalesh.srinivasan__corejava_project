package day10.practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailException {

	public static void main(String[] args) {
		try {
		
		String regEx = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		String Email = "kamales@gmail.com";
		Pattern pattern = Pattern.compile(regEx);
		
		Matcher matcher = pattern.matcher(Email);
		if (matcher.find()) {
			System.out.format("Valid Email Id");
		}
		else {
			throw new InvalidEmailException("Invalid Email");
		}

		
			
		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
	}
}


class InvalidEmailException extends Exception {	 
	public InvalidEmailException(String S) {
		super(S);
	}
	
}
