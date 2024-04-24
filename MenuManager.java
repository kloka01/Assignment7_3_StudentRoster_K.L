import java.util.Scanner;

public class MenuManager {
	// Method to print the main menu
	public void printMainMenu() {
		System.out.println("Main Menu:");
	    System.out.println("a. Enter student information for new students");
	    System.out.println("b. Print the student roster");
	    System.out.println("c. Enter a student name and search for and print information for a particular student");
	    System.out.println("d. Save the student roster to disk");
	    System.out.println("e. Read the student roster from disk");
	    System.out.println("f. Exit the program");
	    System.out.println("Enter your choice:");
	}
	 

	// Method to get student information from user input
	public Student getStudentInfo(Scanner scnr) {
		System.out.println("Enter student information:");
	    System.out.print("First Name: ");
	    String firstName = scnr.nextLine();
	    System.out.print("Last Name: ");
	    String lastName = scnr.nextLine();
	    System.out.print("GPA: ");
	    double gpa = Double.parseDouble(scnr.nextLine());
	    System.out.print("Current Address: ");
	    String currentAddress = scnr.nextLine();
	    System.out.print("Home Address: ");
	    String homeAddress = scnr.nextLine();
	    System.out.print("Phone Number: ");
	    String phoneNumber = scnr.nextLine();

	    return new Student(firstName, lastName, gpa, currentAddress, homeAddress, phoneNumber);
	}
	
	// Method to search for a student by name
	public void searchStudent(StudentRoster roster, Scanner scnr) {
		System.out.println("Enter the name of the student to search:");
	    String name = scnr.nextLine();
	    roster.searchByName(name);
	    }
	
}



