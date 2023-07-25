package day11.solved;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 * @author BharathwajSoundarara
 *
 */
public class TestUserUpdatePassword {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/project";
		Connection connection = DriverManager.getConnection(url, "root", "root");

		// Input
		String userName = "Gopi";
		String password = "09876";

		// DEPOSIT
		String query = "UPDATE user SET password=? WHERE first_name=?";

		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, password);
		pst.setString(2, userName);

		int rows = pst.executeUpdate();
		System.out.println("No of rows updated" + rows);
	}

}