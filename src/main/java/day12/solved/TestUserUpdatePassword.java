package day12.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestUserUpdatePassword {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/project";
		Connection connection = DriverManager.getConnection(url, "root", "root");

		// Input
		String userName = "Kllll";
		String email = "test";

		// DEPOSIT
		String query = "UPDATE user SET email=? WHERE username=?";

		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, email);
		pst.setString(2, userName);

		int rows = pst.executeUpdate();
		System.out.println("No of rows updated" + rows);
	}

}