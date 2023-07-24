package day06.practice;

import java.util.ArrayList;

class addTask {

	private int taskId;
	String taskName;
	private String description;

	// Constructor
	public addTask(int taskId, String taskName, String description) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.description = description;
	}


	@Override
	public String toString() {
		return "taskID: " + taskId + ", taskName: " + taskName + ", description: " + description;
	}

}

public class Task {

	public boolean findTaskByName(String name, ArrayList<addTask> taskList) {
		boolean check = false;

		for (addTask value : taskList) {
			if (value.taskName.equals(name)) {
				check = true;
				break;
			}

		}
		return check;
	}

	public static void main(String[] args) {

		ArrayList<addTask> taskList = new ArrayList<>();

		taskList.add(new addTask(1, "Finish report", "Complete the quarterly sales report."));
		taskList.add(new addTask(2, "Buy groceries", "Purchase items for the week."));
		taskList.add(new addTask(3, "Study for assessment", "Prepare for the upcoming Java exam."));

		for (addTask task : taskList) {
			System.out.println(task);
		}

		Task one = new Task();

		boolean result = one.findTaskByName("Finish report", taskList);
		System.out.println("Your given task present is " + result);
	}
}