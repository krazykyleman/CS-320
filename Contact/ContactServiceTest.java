import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ContactServiceTest {
	
	
	private ContactService service;
	
	@Before
	public void setUp() { //setUp to start BEFORE every test
		
		service = new ContactService();
		
	}
	
	
	@Test
	public void testValidAddContact() { //test to see if add contact works with valid parameters
		
		Contact contact = new Contact("1234567890", "John", "Doe", "0123456789", "123 Main St"); //original contact
		
		service.addContact(contact); //added original
		
		Assert.assertEquals(1,  service.getContacts().size()); //checks to see if the contact list had a person on it (it had none before so adding would be 1)
		Assert.assertEquals(contact, service.getContacts().get(0)); //compare the original contact with the one on the list to check and make sure there are no errors
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidAddContact() { //test to see if error will throw when adding contact
		
		Contact contact1 = new Contact("0123456789", "John", "Doe", "1234567890", "123 Main St"); //has contact id as 0123456789
		Contact contact2 = new Contact("0123456789", "Jane", "Buck", "1234567890", "123 Mein St"); //also has contact id as 0123456789
	
		service.addContact(contact1); //adding this will succeed
		service.addContact(contact2); //trying to add this will throw the expected error
		
	}
	
	
	@Test
	public void testValidDeleteContact() { //test to see if can delete contact
		
		Contact contact = new Contact ("0123456789", "John", "Doe", "1234567890", "123 Main St"); //original contact
		
		service.addContact(contact); //added original
		
		service.deleteContact("0123456789"); //delete contact using contact id
		
		Assert.assertEquals(0,  service.getContacts().size()); //checks is there are any contacts on list (added original was only one).
		
	}
	
	
	@Test
	public void testValidUpdateContact() { //test to see if can update contact
		
		Contact contact = new Contact("0123456789", "John", "Doe", "1234567890", "123 Main St"); //original contact
		
		service.addContact(contact); //added original
		
		service.updateContact("0123456789", "Jane", "Doe", "1234567890", "456 Second St"); //updates original
		
		Assert.assertEquals("Jane", service.getContacts().get(0).getFirstName()); //see if first name is now equal to the changed one, Jane
		Assert.assertEquals("456 Second St", service.getContacts().get(0).getAddress()); //see if the address was updated to 456 Second St
		
		
	}
	
	
}