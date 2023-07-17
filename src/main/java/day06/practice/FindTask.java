package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class FindTask {


		public String TaskName;
		
		public FindTask(String TaskName) {
			this.TaskName = TaskName;
			
		}
		public FindTask() {
			
		}
		
		public String toString() {
			return  TaskName ;
		}
		
		public boolean FindTaskByName(String name, List<FindTask> Task) {
			   for (int i = 0; i < Task.size(); i++) {
				ArrayList<FindTask> list;
				FindTask string = list.get(i);
				
				if(String.equals(name)) {
					return true;
				}
				
			}
			   
			   return false;
		}
		
		
		public static void main(String[] args) {
	        ArrayList<FindTask> Ar = new ArrayList<>();
	        Ar.add(new FindTask("learn java"));
	        Ar.add(new FindTask("learn C++"));
	        Ar.add(new FindTask("learn Php"));
	        
	         System.out.println(new FindTask().FindTaskByName("learn java", Ar));  
	        System.out.println(Ar);
		
	}

}
