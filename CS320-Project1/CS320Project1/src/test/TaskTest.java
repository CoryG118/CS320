package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Task;

class TaskTest {

	@Test
	void TaskId() {
		Task task = new Task("A001", "Clean Room", "This is a task");
		assertTrue(task.getTaskId().equals("A001"));
		
	}
	
	@Test
	void TaskName() {
		Task task = new Task("A001", "Clean Room", "This is a task");
		assertTrue(task.getName().equals("Clean Room"));
	}
	
	@Test
	void TaskDescription() {
		Task task = new Task("A001", "Clean Room", "This is a task");
		assertTrue(task.getDescription().equals("This is a task"));
	}
	
	@Test
	void TaskIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Task( "01234567890", "Clean Room", "This is a task");
		});
	}
	
	@Test
	void TaskIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Task( null, "Clean Room", "This is a task");
		});
	}
	
	@Test
	void TaskNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Task("A001", "012345678901234567890", "This is a task");
		});
	}
	
	@Test
	void TaskNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Task("A001", null, "This is a task");
		});
	}
	
	@Test 
	void TaskDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Task("A001", "Clean Room", "012345678901234567890123456789012345678901234567890");
		});
	}
	
	@Test
	void TaskDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class,	()->{
			new Task("A001", "Clean Room",null);
		});
	}

}