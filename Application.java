/**
 * 
 */

/**
 * @author Keren Loka
 * 
 */
import java.util.Scanner;
public class Application {
	

	private static final String String = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		StudentRoster roster = new StudentRoster();
		boolean exit = false;
		MenuManager menu = new MenuManager();

		while (!exit) {
		menu.printMainMenu();
		String choice = scnr.nextLine().toLowerCase();

		switch (choice) {
		  case "a":
			  roster.addStudent(menu.getStudentInfo(scnr));
		      break;
		  case "b":
		      roster.printRoster();
		      break;
		  case "c":
		      menu.searchStudent(roster, scnr);
		      break;
		  case "d":
		      roster.saveRosterToFile(String);
		      break;
		  case "e":
		      roster.readRosterFromFile(String);
		      break;
		  case "f":
		      exit = true;
		      System.out.println("Exiting program...");
		      break;
		  default:
		      System.out.println("Invalid choice. Please try again.");
		      break;
		      }
		
		}
		
	}

	
}
		 
		
		

