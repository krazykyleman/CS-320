import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Contact {
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	// Constructor
	// -----------
	public Contact (String contactId, String firstName, String lastName, String phoneNum, String address) {
		
		if (contactId == null) {
			
			throw new IllegalArgumentException("Contact ID cannot be null");
			
		}
		
		
		if (contactId.length() > 10) {
			
			throw new IllegalArgumentException("Contact ID cannot be more than 10 characters");
			
		}
		
		
		if (firstName == null) {
			
			throw new IllegalArgumentException("First name cannot be null");
			
		}
		
		
		if (firstName.length() > 10) {
			
			throw new IllegalArgumentException("First name cannot be more than 10 characters");
			
		}
		
		
		if (lastName == null) {
			
			throw new IllegalArgumentException("Last name cannot be null");
			
		}
		
		
		if (lastName.length() > 10) {
			
			throw new IllegalArgumentException("Last name cannot be more than 10 characters");
			
		}
		
		
		if (phoneNum == null) {
			
			throw new IllegalArgumentException("Phone number cannot be null");		
			
		}
		
		
		if (!isValidPhoneNum(phoneNum)) {
			
			throw new IllegalArgumentException("Phone number not valid, must be exactly 10 digits");
			
		}
		
		
		if (address == null) {
			
			throw new IllegalArgumentException("Address cannot be null");
			
		}
		
		
		if (address.length() > 30) {
			
			throw new IllegalArgumentException("Address cannot be longer than 30 characters");
			
		}
		
		// pointers
		// --------
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
		
	}
	
	
	private boolean isValidPhoneNum(String phoneNum) { //function for testing is phoneNum is valid
		
		Pattern pattern = Pattern.compile("\\d{10}"); //looking for exactly 10 digits
		
		Matcher matcher = pattern.matcher(phoneNum); //looks for those 10 digits in phoneNum input
		
		return matcher.matches(); //returns result
		
	}
	
	
	//Setters and Getters
	//-------------------
	public String getContactId() {
		
		return contactId;
		
	}
	
	
	public String getFirstName() {
		
		return firstName;
		
	}
	
	
	public void setFirstName(String firstName) {
		
		if (firstName == null) {
			
			throw new IllegalArgumentException("First name cannot be null");
			
		}
		
		if (firstName.length() > 10) {
			
			throw new IllegalArgumentException("First name cannot be longer than 10 characters");
			
		}
		
		this.firstName = firstName;
		
	}
	
	
	public String getLastName() {
		
		return lastName;
		
	}
	
	public void setLastName(String lastName) {
		
		if (lastName == null) {
			
			throw new IllegalArgumentException("Last name cannot be null");
			
		}
		
		if (lastName.length() > 10) {
			
			throw new IllegalArgumentException("Last name cannot be longer than 10 characters");
			
		}
		
		this.lastName = lastName;
		
	}
	
	public String getPhoneNum() {
		
		return phoneNum;
		
	}
	
	public void setPhoneNum(String phoneNum) {
		
		if (phoneNum == null) {
			
			throw new IllegalArgumentException("Phone number cannot be null");
			
		}
		
		if (!isValidPhoneNum(phoneNum)) {
			
			throw new IllegalArgumentException("Phone number not valid, must be exactly 10 digits");
			
		}
		
		this.phoneNum = phoneNum;
		
	}
	
	public String getAddress() {
		
		return address;
		
	}
	
	public void setAddress(String address) {
		
		if (address == null) {
			
			throw new IllegalArgumentException("Address cannot be null");
			
		}
		
		if (address.length() > 30) {
			
			throw new IllegalArgumentException("Address cannot be longer than 30 characters");
			
		}
		
		this.address = address;
		
	}
	
	
}