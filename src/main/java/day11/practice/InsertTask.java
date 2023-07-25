package day11.practice;
import java.sql.SQLException;

public class InsertTask {

	public static void main(String[] args) throws SQLException {
		Task task = new Task();
		task.id = 10;
		task.name = "test";
		task.status = "pending";
		
		TaskDAO TD = new TaskDAO();
		TD.createTask(task);
		
	
	}

}
