/**
 * 
 */

/**
 * @author Keren Loka
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentRoster {
    private ArrayList<Student> roster = new ArrayList<>();

    // Method to add a student to the roster
    public void addStudent(Student student) {
        roster.add(student);
        System.out.println("Student added to roster.");
    }

    // Method to print the roster of students
    public void printRoster() {
        if (roster.isEmpty()) {
            System.out.println("Roster is empty.");
        } else {
            System.out.println("Student Roster:");
            for (Student student : roster) {
                System.out.println(student);
            }
        }
    }

    // Method to save the roster to a file 
    public void saveRosterToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Student student : roster) {
                writer.write(student.toString() + "\n");
            }
            System.out.println("Student roster saved to file successfully.");
        } catch (IOException e) {
            System.err.println("Error saving student roster to file: " + e.getMessage());
        }
    }
    

    // Method to read the roster from a file
    public void readRosterFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scnr = new Scanner(file);
            while (scnr.hasNextLine()) {
                String data = scnr.nextLine();
                // Process data to create Student objects
                // Assuming data format: firstName lastName GPA currentAddress homeAddress phoneNumber
                String[] studentData = data.split(" ");
                Student student = new Student(studentData[0], studentData[1], Double.parseDouble(studentData[2]),
                        studentData[3], studentData[4], studentData[5]);
                roster.add(student);
            }
            scnr.close();
            System.out.println("Student roster read from file successfully.");
        } catch (FileNotFoundException e) {
            System.err.println("Error reading student roster from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing GPA: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error processing student data: " + e.getMessage());
        }
    }

    // Method to search for a student by name
    public void searchByName(String name) {
        boolean found = false;
        for (Student student : roster) {
            if (student.getFirstName().equalsIgnoreCase(name) || student.getLastName().equalsIgnoreCase(name)) {
                System.out.println("Student found:");
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
