package day06.practice;

import java.util.ArrayList;

public class FindTask {
	public String taskName;
	public int priority;

	public FindTask(String taskName) {
		this.taskName = taskName;

	}

	public String toString() {
		return taskName;
	}

	public static void main(String[] args) {
		ArrayList<Task> Ar = new ArrayList<>();
		Ar.add(new Task("learn java"));
		Ar.add(new Task("learn C++"));
		Ar.add(new Task("learn Php"));
		System.out.println(Ar);
	}
}
