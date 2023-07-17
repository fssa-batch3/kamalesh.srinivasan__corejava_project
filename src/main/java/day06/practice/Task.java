package day06.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task {
	public String taskName;
    public int priority;
	
	public Task(String taskName,int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}
	
	public String toString() {
		return "Task Name " + taskName +" Priority " + priority;
	}
	
    public boolean findTaskByName(String name,ArrayList<Task> tasks) {
	   
    }
	
	
	public static void main(String[] args) {
        ArrayList<Task> Ar = new ArrayList<>();
        Ar.add(new Task("learn java", 3));
        Ar.add(new Task("learn C++", 1));
        Ar.add(new Task("learn Php", 3));
        System.out.println(Ar);
	}
	
	

}
