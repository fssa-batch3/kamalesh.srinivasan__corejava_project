package day03.practice;

public class User {
	
	private String name;
	private String password;
	private String email;
	

	public static void main(String[] args) {

		User user = new User();
		User user1 = new User("Kamal","12345678","Kamal@gmail.com");

	}
	
	public User() {
		System.out.println("User");
	}
	
	public User(String name,String password,String email) {
		System.out.printf("Name ="+ name+"%nPassword ="+password+"%nEmail");
	}
	
	

}
