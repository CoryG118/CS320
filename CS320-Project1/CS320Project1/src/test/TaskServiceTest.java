package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import main.TaskService;




class TaskServiceTest {
	
	

	@Test
	void AddTaskTest() {
		TaskService task = new TaskService();
		task.addTask("A001", "Clean Room", "This is a task");
		Assertions.assertNotNull(task.getTask("A001").getTaskId());	
	}
	
	
	@Test
	void DeleteTaskTest() {
		TaskService task = new TaskService();
		task.addTask("A002", "Clean Kitchen", "This is a task");
		task.deleteTask("A002");
	
		Assertions.assertNull(task.getTask("A002").getTaskId());
	}
	
	
	@Test
	void UpdateNameTest() {
		TaskService task = new TaskService();
		task.addTask("A003", "Clean Kitchen", "Yay!");
		task.changeName("Clean Garage", "A003");
		assertEquals("Clean Garage", task.getTask("A003").getName());
		
	}
	
	@Test
	void UpdateDescription() {
		TaskService task = new TaskService();
		task.changeDescription("No", "A001");
		assertEquals("No", task.getTask("A001").getDescription());
	}
	

	

}
