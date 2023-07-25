package day11.practice;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import day11.solved.ConnectionUtil;

class Task {
	int id;
	String name;
	String status;
}

class TaskDAO {
	
	public void createTask(Task task) throws SQLException {
		// Write code here to get connection
		  Connection connection = ConnectionUtil.getConnection();
		// Create insert statement
	       Statement stmt = connection.createStatement();
		// Execute insert statement
	       String query ="INSERT INTO task (id, name, status) VALUES (\"task.id\",\"task.name\", \"task.status\")";
	        int rows = stmt.executeUpdate(query);
	        System.out.println("No of rows inserted :" + rows );
		// close connection
	        ConnectionUtil.close(connection, stmt, null);
	} 

}
// Create Junit Test case and test the TaskDao.createTask method