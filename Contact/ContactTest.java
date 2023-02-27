import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class ContactTest { // Class for the files
	
	@Test
	public void testValidContactId() { //test for valid contact id
		
		Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St"); //makes new contact with valid parameters
		
		assertEquals("1234567890", contact.getContactId()); //sees if the valid number is equal to the number in the contact. It gets this with get lol
		
	}
	
	@Test
	public void testInvalidContactId() { //test for invalid contact id
		
		assertThrows(IllegalArgumentException.class, () -> {
			
			new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
			
		});
		
	}
	
	
	@Test
	public void testValidFirstName() {
		
		Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
		
		assertEquals("John", contact.getFirstName());
		
	}
	
	@Test
	public void testInvalidFirstName() {
		
		Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
		
		assertThrows(IllegalArgumentException.class, () -> {
			
			contact.setFirstName("A first name that is longer than ten characters");
			
		});
		
	}
	
	
	@Test
	public void testValidLastName() {
		
		Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
		
		assertEquals("Doe", contact.getLastName());
	}
	
	@Test
	public void testInvalidLastName() {
		
		Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
		
		assertThrows(IllegalArgumentException.class, () -> {
			
			contact.setLastName("A last name that is longer than ten characters");
			
		});
		
	}
	
	
	@Test
	public void testValidPhoneNum() {
		
		Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
		
		assertEquals("1234567890", contact.getPhoneNum());
	}
	
	@Test
	public void testInvalidPhoneNum() {
		
		assertThrows(IllegalArgumentException.class, () -> {
		
			new Contact("1234567890", "John", "Doe", "123456789", "123 Main St");
	
		});
	}
	
	
	@Test
	public void testValidAddress() {
		
		Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
		
		assertEquals("123 Main St", contact.getAddress());
		
	}
	
	@Test
	public void testInvalidAddress() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			
			new Contact("1234567890", "John", "Doe", "1234567890", "An address that is longer than 30 characters, or I hope so at least");
			
		});
		
	}
	
}