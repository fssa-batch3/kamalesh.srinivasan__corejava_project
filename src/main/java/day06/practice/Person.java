package day06.practice;

public abstract class Person {
	
	public String getFirstName() {
		return null;
	}
	
	public abstract String getLastName();

	public static void main(String[] args) {
    	
	}

	
}


class Employee extends Person {
	
	String JT ="IT";

	@Override
	public String getLastName() {
		System.out.println(JT);
		return JT;
	}			
}

