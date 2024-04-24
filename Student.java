/**
 * 
 */

/**
 * @author Keren Loka
 * 
 */
public class Student {
	private String firstName;
	private String lastName;
	private double gpa;
	private String currentAddress;
	private String homeAddress;
	private String phoneNumber;

	// Constructor
	public Student(String firstName, String lastName, double gpa, String currentAddress, String homeAddress, String phoneNumber) {
		this.firstName = firstName;
	    this.lastName = lastName;
	    this.gpa = gpa;
	    this.currentAddress = currentAddress;
	    this.homeAddress = homeAddress;
	    this.phoneNumber = phoneNumber;
	}

	// Getters and setters
	public String getFirstName() {
	    return firstName;
	}

	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}

	public String getLastName() {
	    return lastName;
	}

	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}

	public double getGpa() {
	    return gpa;
	}

	public void setGpa(double gpa) {
	    this.gpa = gpa;
	}

	public String getCurrentAddress() {
	    return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
	    this.currentAddress = currentAddress;
	}

	public String getHomeAddress() {
	    return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
	    this.homeAddress = homeAddress;
	}

	public String getPhoneNumber() {
	    return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
	}

	// toString method
	public String toString() {
	    return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' +", gpa=" + gpa +", currentAddress='" + currentAddress + '\'' + ", homeAddress='" + homeAddress + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
	}
	
}
