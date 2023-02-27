import java.util.ArrayList;
import java.util.List;

public class ContactService {
	
	private List<Contact> contacts; //creates the list contacts
	
	
	public ContactService() { //initializes contact service 
		
		contacts = new ArrayList<Contact>(); //creates an array list from the list contacts
		
	}
	
	
	public void addContact(Contact contact) {
		
		for (Contact c : contacts) { //for every Contact (represented by c) in contacts
			
			if(c.getContactId().equals(contact.getContactId())) { //if that Contact's ID is equal to the requested Contact's ID
				
				throw new IllegalArgumentException("Contact ID already exists"); //give error saying Contact already exists
				
			}
			
		}
		
		contacts.add(contact); //if not already a contact this adds the given contact to the contacts list
		
	}
	
	
	public void deleteContact(String contactId) { //initializes delete contact function
		
		for (Contact c : contacts) { //for every Contact (represented by c) in contacts
			
			if (c.getContactId().equals(contactId)) { //if that Contact's ID is equal to the requested Contact's ID
				
				contacts.remove(c); //will remove said contact
				
				break; //break
				
			}
			
		}
		
	}
	
	
	public void updateContact(String contactId, String firstName, String lastName, String phoneNum, String address) { //initializes update contact function
		
		for (Contact c : contacts) { //for every Contact (represented by c) in contacts
			
			if (c.getContactId().equals(contactId)) { //if that Contact's ID is equal to the requested Contact's ID
				
				//with the given parameters...
				c.setFirstName(firstName); //update the first name
				c.setLastName(lastName); //update the last name
				c.setPhoneNum(phoneNum); //update the phone number and
				c.setAddress(address); //update the address
				
				break; //break 
			}
			
		}
		
		
	}
	
	
	public List<Contact> getContacts() { //initialize get contacts function
		
		return contacts; //returns list contacts
		
	}
	
}