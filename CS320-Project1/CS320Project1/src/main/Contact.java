//Cory Graham
//CS 320
//Module 3-2
package main;

public class Contact {
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		
		//verification that each requirement is not null and is within length requirements
		if ((contactId == null) || (contactId.length() > 10)) {
			
			throw new IllegalArgumentException("Invalid ID");
		}
		if ((firstName == null) || (firstName.length() > 10)) {
			
			throw new IllegalArgumentException("Invalid First Name");
		}
		if ((lastName == null) || (lastName.length() > 10)) {
			
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if ((phoneNumber == null) || (phoneNumber.length() != 10)) {
			
			throw new IllegalArgumentException("Invalid phone number");
		}
		if ((address == null) || (address.length() > 30)){
			
			throw new IllegalArgumentException("Invalid address");
		}
		
		//After all checking the items are submitted as the variables
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public Contact(){
		
	}
	
	
	//getters
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	
	//Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}



	

/* Contact Class Requirements

The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. 
The contact ID shall not be null and shall not be updatable.

The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.

The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.

The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.

The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
*/
