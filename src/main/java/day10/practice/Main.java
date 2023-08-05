package day10.practice;

public class Main {

    public static void main(String[] args) {
        try {
            String email = "kamalesh@gmail.com";
            ValidateEmail.isValidEmail(email);

            ValidateUser user = new ValidateUser();
            user.register(new ValidateUser(1, "kamalesh", email));
            user.register(new ValidateUser(1, "kamalesh", email));

            System.out.println("User registered successfully.");
        } catch (InvalidEmailException | UserAlreadyExistsException e) {
            e.printStackTrace();
        }

    }
}
