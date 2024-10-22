package main;

public class Task {

	private final String taskId;
	private String name;
	private String description;

	
	public Task(String taskId, String name, String description) {
		
		if ((taskId == null) || (taskId.length() > 10)) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		if ((name == null) || (name.length() > 20)) {
			throw new IllegalArgumentException("Invalid Name");
		}
		
		if ((description == null) || (description.length() > 50)) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		this.taskId = taskId;
		this.name = name;
		this.description = description;
		
	}
	
	public Task() {
		this.taskId = null;
		this.name = null;
		this.description = null;
		}
	
	
	
	//getters
	public String getTaskId() {
		return taskId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}



/*
 * Task Class Requirements

The task object shall have a required unique task ID String that cannot be longer than 10 characters. 
The task ID shall not be null and shall not be updatable.

The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.

The task object shall have a required description String field that cannot be longer than 50 characters.
 The description field shall not be null.
 * 
 * */


