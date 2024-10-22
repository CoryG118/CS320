package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Contact;

class ContactTest {

	@Test
	void testContactId() {
		Contact contact = new Contact("ABC123","Cory","Graham","0123456789","321 Spicy Ln.");
		assertTrue(contact.getContactId().equals("ABC123"));
		
	}
	
	@Test
	void TestContactFirstName() {
		Contact contact = new Contact("ABC123","Cory","Graham","0123456789","321 Spicy Ln.");
		assertTrue(contact.getFirstName().equals("Cory"));
		
	}
	
	@Test
	void TestContactLastName() {
		Contact contact = new Contact("ABC123","Cory","Graham","0123456789","321 Spicy Ln.");
		assertTrue(contact.getLastName().equals("Graham"));
		
	}
	
	@Test
	void TestContactPhoneNumber() {
		Contact contact = new Contact("ABC123","Cory","Graham","0123456789","321 Spicy Ln.");
		assertTrue(contact.getPhoneNumber().equals("0123456789"));
		
	}
	
	@Test
	void TestContactAddress() {
		Contact contact = new Contact("ABC123","Cory","Graham","0123456789","321 Spicy Ln.");
		assertTrue(contact.getAddress().equals("321 Spicy Ln."));
	}
	
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ABC0123456789", "Cory", "Graham", "0123456789","321 Spicy Ln.");
		});
	}
	
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null, "Cory", "Graham", "0123456789","321 Spicy Ln.");
		});
	}
	
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("ABC123", "Cory0123456789", "Graham","0123456789", "321 Spicy Ln.");
		});
	}
	
	
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("ABC123", null, "Graham","0123456789", "321 Spicy Ln.");
		});
	}
	
	
	@Test 
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("ABC123", "Cory", "Graham0123456789", "0123456789", "321 Spicy Ln.");
		});
	}
	
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("ABC123", "Cory", null, "0123456789", "321 Spicy Ln.");
		});
	}
	
	
	@Test
	void testContactPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("ABC123", "Cory", "Graham", "123", "321 Spicy Ln.");
		});
	}
	
	
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("ABC123", "Cory", "Graham", "01234567891", "321 Spicy Ln.");
		});
	}
	
	
	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("ABC123", "Cory", "Graham", null, "321 Spicy Ln.");
		});
	}
	
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("ABC123", "Cory", "Graham","0123456789", "321 Spicy Ln. Candyland Texas Where The Wild Things Are");
		});
	}
	
	
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("ABC123", "Cory", "Graham", "01234567891", null);
		});
	}

}

