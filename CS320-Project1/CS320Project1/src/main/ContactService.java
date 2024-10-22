package main;


import java.util.ArrayList;



public class ContactService {
	
	
	//Declare array to hold all contacts
	public static ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	
	
	//Display all current contacts
	public void printArrayList() {
		
		for (int i = 0; i < contactList.size(); i++) {
			
			System.out.println("Contact ID: " + contactList.get(i).getContactId());
			System.out.println("First Name: " + contactList.get(i).getFirstName());
			System.out.println("Last Name: " + contactList.get(i).getLastName());
			System.out.println("Phone Number: " + contactList.get(i).getPhoneNumber());
			System.out.println("Address: " + contactList.get(i).getAddress());
		}
	}
	
	
	
	
	public void addContact(String contactId, String firstName, String lastName, String phoneNumber, String address) { //add contacts to the array
		
		//check if contactId is already in use.
		if (contactList.contains(contactId)) {
			
			System.out.println("Contact ID is already in use.");
		
		}
		else { // if not in use create new contact and add it to the array
			
			Contact contact = new Contact(contactId, firstName, lastName, phoneNumber, address);
			contactList.add(contact);
		}
	}
	
	
	
	public Contact getContact(String ContactId) {
		
		Contact contact = new Contact();
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactId() == ContactId) {
					contact = contactList.get(i);
					
					return contact;
			}	
		}
		
		return contact;
	}
	
	public ArrayList<Contact> getList(){
		return contactList;
	}
	
	
	
	//To delete an existing Contact
	public void deleteContact(String contactId) {
		// to see if contact id is valid
		for (int i = 0; i < contactList.size(); i++) {
				
			if (contactList.get(i).getContactId() == contactId) {
					
				contactList.remove(i);                      //removes contact
				System.out.println("Delete successful");
				break;
				}
		}
	}
	
	
	//Change first name
	public static void changeFirstName(String newFirstName, String contactId) {
		
		for(int i = 0; i < contactList.size(); i++) {
			
			if (contactList.get(i).getContactId() == contactId) {
				
				contactList.get(i).setFirstName(newFirstName);
				break;
			}
			
			if (i == contactList.size()-1) {
				System.out.println("Contact ID not found");
			}
		}
		
	}
	
	
	//Change Last name
	public static void changeLastName(String newLastName, String contactId) {
			
			for(int i = 0; i < contactList.size(); i++) {
				
				if (contactList.get(i).getContactId() == contactId) {
					
					contactList.get(i).setLastName(newLastName);
					break;
				}
				
				if (i == contactList.size()-1) {
					System.out.println("Contact ID not found");
				}
			}
			
		}
	
	
	//change phone
	public static void changePhoneNumber(String newPhoneNumber, String contactId) {
		
		for(int i = 0; i < contactList.size(); i++) {
			
			if (contactList.get(i).getContactId() == contactId) {
				
				contactList.get(i).setPhoneNumber(newPhoneNumber);
				break;
			}
			
			if (i == contactList.size()-1) {
				System.out.println("Contact ID not found");
			}
		}
		
	}
	
	
	//change address
	public static void changeAddress(String newAddress, String contactId) {
			
			for(int i = 0; i < contactList.size(); i++) {
				
				if (contactList.get(i).getContactId() == contactId) {
					
					contactList.get(i).setAddress(newAddress);
					break;
				}
				
				if (i == contactList.size()-1) {
					System.out.println("Contact ID not found");
				}
			}
			
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello");
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
