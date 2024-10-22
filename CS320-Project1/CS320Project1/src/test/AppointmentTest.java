package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Appointment;


import java.util.Date;



class AppointmentTest {
	

	
	
	
	@Test
	void testAppointmentId() {
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureDate = new Date(currentDate.getTime() + 10);
		Appointment appointment = new Appointment("A001", futureDate,"Descriptions");
		assertTrue(appointment.getApptId() == "A001");
	}
	
	@Test
	void testAppointmentDate() {
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureDate = new Date(currentDate.getTime() + 10);
		Appointment appointment = new Appointment("A001", futureDate,"Descriptions");
		assertTrue(appointment.getApptDate() == futureDate);
		
	}
	
	@Test
	void testAppointmentDescription() {
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureDate = new Date(currentDate.getTime() + 10);
		Appointment appointment = new Appointment("A001", futureDate,"Descriptions");
		assertTrue(appointment.getApptDes() == "Descriptions");
	}
	
	@Test
	void testAppointmentIdTooLong() {
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureDate = new Date(currentDate.getTime() + 10);
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			 new Appointment("12345678901", futureDate,"Descriptions");
		});
	}
	
	@Test
	void testAppointmentIdNull() {
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureDate = new Date(currentDate.getTime() + 10);
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			 new Appointment(null, futureDate,"Descriptions");
		});
	}
	
	@Test
	void testAppointmentDatePast() {
		Date currentDate = new Date(System.currentTimeMillis());
		Date pastDate = new Date(currentDate.getTime() - 10);
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("A001", pastDate, "Description");
		});
	}
	
	@Test 
	void testAppointmentDateNull() {
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureDate = new Date(currentDate.getTime() + 10);
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			 new Appointment("A001", null,"Descriptions");
		});
	}
	
	@Test
	void testAppointmentDescriptionTooLong(){
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureDate = new Date(currentDate.getTime() + 10);
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			 new Appointment("A001", futureDate,"123456789012345678901234567890123456789012345678901");
		});
	}
	
	@Test
	void testAppointmentDescriptionNull() {
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureDate = new Date(currentDate.getTime() + 10);
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			 new Appointment("A001", futureDate, null);
		});
	}

	private Date Date(int i, int january, int j) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
