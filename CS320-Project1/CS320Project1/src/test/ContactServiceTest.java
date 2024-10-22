package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.ContactService;

class ContactServiceTest {
	
	
	
	@Test 
	void addSingleContact() {
		ContactService contact = new ContactService();
		contact.addContact("A001", "Cory", "Graham", "0123456789", "321 Spicy Ln.");
		Assertions.assertNotNull(contact.getContact("A001"));

	}
	
	@Test
	void updateFirstName() {
		ContactService contact = new ContactService();
		contact.addContact("A001", "Cory", "Graham", "0123456789", "321 Spicy Ln.");
		ContactService.changeFirstName("Chandler", "A001");
		assertEquals("Chandler", contact.getContact("A001").getFirstName());
	}
	
	
	@Test
	void upadteLastName() {
		ContactService contact = new ContactService();
		contact.addContact("A001", "Cory", "Graham", "0123456789", "321 Spicy Ln.");
		ContactService.changeLastName("Burlingame", "A001");
		assertEquals("Burlingame", contact.getContact("A001").getLastName());
		
	}
	
	@Test
	void updatePhoneNumber() {
		ContactService contact = new ContactService();
		contact.addContact("A001",  "Cory", "Graham", "0123456789", "321 Spicy Ln.");
		ContactService.changePhoneNumber("9876543210", "A001");
		assertEquals("9876543210", contact.getContact("A001").getPhoneNumber());
	}
	
	@Test
	void updateAddress() {
		ContactService contact = new ContactService();
		contact.addContact("A001", "Cory", "Graham", "0123456789", "321 Spicy Ln.");
		ContactService.changeAddress("123 Sweetwater St.", "A001");
		assertEquals("123 Sweetwater St.", contact.getContact("A001").getAddress());
	}
	
	@Test
	void deleteContact() {
		ContactService contact = new ContactService();
		contact.addContact("A003", "Cory", "Graham", "0123456789", "321 Spicy Ln.");
		contact.deleteContact("A003");
		Assertions.assertNull(contact.getContact("A003").getContactId());
	}
	

}


/*
 * Contact Service Requirements

The contact service shall be able to add contacts with a unique ID.
The contact service shall be able to delete contacts per contact ID.
The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
firstName
lastName
Number
Address
*/
