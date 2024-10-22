package main;

import java.util.ArrayList;

public class TaskService {
	
	
	
	
	//ArrayList to store tasks
	public static ArrayList<Task> taskList = new ArrayList<>();
	
	
	
	public Task getTask(String taskId) {
		
		Task task = new Task();
		for (int i = 0; i < taskList.size(); i++) {
			if(taskList.get(i).getTaskId().contentEquals(taskId)) {
				task = taskList.get(i);
			}
		}
		
		return task;
	}
	
	
	//Add new task to the list
	public void addTask(String taskId, String name, String description) {
		
		
		Task newTask = new Task(taskId, name, description);
		
		taskList.add(newTask);
	}
	
	public ArrayList<Task> getList(){
		
		return taskList;
	}
	
	
	
	
	//Remove task
	public void deleteTask(String taskId) {
		
		for (int i = 0; i < taskList.size(); i++) {
			
			if (taskList.get(i).getTaskId() == taskId) {
				
				taskList.remove(i);
				
				break;
			}
		}
	}
	
	
	//change name
	public void changeName(String newName, String taskId) {
		
		for (int i = 0; i < taskList.size(); i++) {
		
			if (taskList.get(i).getTaskId() == taskId) {
				taskList.get(i).setName(newName);
				
				break;
			}
		}
	}
	
	
	//change description
	public void changeDescription(String newDescription, String taskId) {
		
		for (int i = 0; i < taskList.size(); i++) {
			
			if (taskList.get(i).getTaskId() == taskId) {
				taskList.get(i).setDescription(newDescription);
				
				break;
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
	}

}


/**
 * 
 *Task Service Requirements

The task service shall be able to add tasks with a unique ID.

The task service shall be able to delete tasks per task ID.

The task service shall be able to update task fields per task ID. The following fields are updatable:
Name
Description

 
 */

