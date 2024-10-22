package main;

import java.util.Date;

import java.util.ArrayList;

public class AppointmentService {
	
	ArrayList<Appointment> apptList = new ArrayList<>();
	
	
	
	//Getter for specific appointments
	public Appointment getAppt(String apptId) {
		
		Appointment apptFound = new Appointment();
		
		for (int i = 0; i < apptList.size(); i++) {
			if (apptList.get(i).getApptId() == apptId) {
				apptFound = apptList.get(i);
				
				return apptFound;
			}
		}
		return apptFound;
	}
	
	
	
	//add new appointment to list.
	public void addAppt(String apptId, Date apptDate, String apptDes) {
		
		Appointment newAppt = new Appointment(apptId, apptDate, apptDes);
		
		apptList.add(newAppt);
	}
	
	
	
	//delete appointment
	public void deleteAppt(String apptId) {
		
		for (int i = 0; i < apptList.size(); i++) {
			
			if (apptList.get(i).getApptId() == apptId) {
				apptList.remove(i);
			}
		}
	}

	public ArrayList<Appointment> getList() {
		return apptList;
	}
	
	
	public static void main(String[] args) {
		
	}



	

}

/* 
 * Appointment Service Requirements

The appointment service shall be able to add appointments with a unique appointment ID.

The appointment service shall be able to delete appointments per appointment ID.
*/
