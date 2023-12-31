package day11.solved;

import java.sql.Connection;
import java.sql.Statement;

public class UserInsertQuery {

    public static void main(String[] args) throws Exception {

        // Step 01: Get connection
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);

        // Step 02: Create a Statement
        Statement stmt = connection.createStatement();

        // Step 03: Execute Insert Query
        String query = "INSERT INTO user (username, password, date_of_birth, phone, email, first_name, last_name) VALUES (\"Kamal\",\"Kamal@123\",\"2003-06-28\",\"8925603157\",\"kamal.srinivasan@fssa.freshworks.com\",\"kamal\", \"srinivasan\")";
        int rows = stmt.executeUpdate(query);
        System.out.println("No of rows inserted :" + rows);

        // Step 04: close the connection resources
        ConnectionUtil.close(connection, stmt, null);

    }

}