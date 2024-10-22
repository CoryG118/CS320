package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.AppointmentService;

class AppointmentServiceTest {

	@Test
	void testAddAppointment() {
		AppointmentService appointment = new AppointmentService();
		Date currentDate = new Date();
		Date futureDate = new Date(currentDate.getTime() + 10);
		appointment.addAppt("A001", futureDate, "Description");
		Assertions.assertNotNull(appointment.getAppt("A001"));
	}
	
	@Test
	void testDeleteAppointment() {
		AppointmentService appointment2 = new AppointmentService();
		Date currentDate = new Date();
		Date futureDate = new Date(currentDate.getTime() + 10);
		appointment2.addAppt("A002", futureDate, "Description");
		appointment2.deleteAppt("A002");
		assertNull(appointment2.getAppt("A002").getApptId());
	}

}
