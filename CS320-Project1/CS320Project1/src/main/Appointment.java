package main;

import java.util.Date;




public class Appointment {
	
	private String apptId;
	private Date apptDate;
	private String apptDes;
	
	
	public Appointment(String apptId, Date apptDate, String apptDes) {
		if ((apptId == null) || (apptId.length() > 10)) {
			throw new IllegalArgumentException("Invalid Appointment ID");
		}
		
		if ((apptDes == null) || (apptDes.length() > 50)) {
			throw new IllegalArgumentException("Invalid Appointment Description");
		}
		
		if ((apptDate == null) || (apptDate.before(new Date()))) {
			throw new IllegalArgumentException("Invalid Date");
		}
		
		this.apptId = apptId;
		this.apptDate = apptDate;
		this.apptDes = apptDes;
	}
	
	public Appointment() {
		
	}
	
	

	//getters
	public String getApptId() {
		return this.apptId;
	}
	
	public Date getApptDate() {
		return this.apptDate;
	}
	
	public String getApptDes() {
		return this.apptDes;
	}
	
	//Setters
	
	public void setDate(Date apptDate) {
		this.apptDate = apptDate;
	}
	
	public void setApptDes(String apptDes) {
		this.apptDes = apptDes;
	}
	
	
	
}


/*
 * Appointment Class Requirements

The appointment object shall have a required unique appointment 
ID string that cannot be longer than 10 characters. The appointment 
ID shall not be null and shall not be updatable.

The appointment object shall have a required appointment Date field. 
The appointment Date field cannot be in the past. The appointment Date field shall not be null.

Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the 
date is in the past.

The appointment object shall have a required description String field that cannot be longer than 
50 characters. The description field shall not be null.

 * */

