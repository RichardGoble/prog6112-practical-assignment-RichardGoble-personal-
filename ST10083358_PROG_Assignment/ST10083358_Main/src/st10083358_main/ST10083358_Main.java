
package st10083358_main;

import java.util.ArrayList;
import java.util.Scanner;

public class ST10083358_Main {

    private static ArrayList<Student> students = new ArrayList<>();  // Initializing an empty list to store student objects.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                     // A scanner object to read user input.

        while (true) {  // A while loop to continuously prompt the user for what action they want to execute.
            
            System.out.println("\nSTUDENT MANAGEMENT APPLICATION" + "\n***********************************************************");     // Display of the application title and a prompt to the user to launch the menu by entering 1.
            System.out.println("Enter (1) to launch menu or any other key to exit");
            String menuLaunch = input.nextLine();

            if (!menuLaunch.equals("1")) {   // If the user chooses to exit the loop then any value other than 1 will end the application.
                break;
            }
            displayMenu();      // The main menu options are displayed once the user enters 1.

            String menuOption = input.nextLine();   // Once the user has selected one of the options 1 -5 the choice is read.
            
            switch (menuOption) {           // When the user has selected an option 1-5 the users choice is processed using a switch statement.
                
                case "1":  // If the user selects option 1 by entering 1 into the console a new student's details will be captured and are added to the array list and stored.
                    students.add(Student.captureStudent(input));
                    System.out.println("Student details have been successfully saved.");
                    break;
                case "2":   // If the user selects option 2 by entering 2 into the console the user can search for a students details by entering a valid ID.
                    Student.searchStudent(input, students);
                    break;
                case "3":    // If the user selects option 3 by entering 3 into the console the user can attempt to delete a students details by enetering a valid ID.
                    if (Student.deleteStudent(input, students)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case "4":   // If the user selects option 4 by entering 4 into the console the user will generate a report showing all captured students details.
                    Student.studentReport(students);
                    break;
                case "5":   // If the user selects option 5 by entering 5 into the console the user will successfully Exit the application.
                    Student.exitStudentApplication();
                    break;
                default:   //If the user selects an invalid option and enters a number higher than 5 into the console the user will receive a error message to please try again by entering a valid option.
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        input.close();    // Closing of the scanner object
    }

    // this is the Method used to display the main menu options that are displayed to the user when 1 is entered to launch the application.
    private static void displayMenu() {       
        System.out.println("\nPlease select one of the following menu items:");
        System.out.println("1. Capture a new student.");
        System.out.println("2. Search for a student.");
        System.out.println("3. Delete a student.");
        System.out.println("4. Print student report.");
        System.out.println("5. Exit Application.");
        System.out.print("Enter your choice: ");
    }
}

//Referencing List

//Farrell, J. (2022) Java Programming. 10th edn. Boston, MA: Cengage Learning. 

// GeeksforGeeks.(2024). Iterating over ArrayLists in Java. n.d. [Online] Available at: https://www.geeksforgeeks.org/iterating-arraylists-java/ [Accessed:  25 August 2024].

// OpenAI.(2024). ChatGPT. [Online] Available at: https://www.openai.com/chatgpt [Accessed: 29 August 2024].

// Microsoft.(2024). Copilot AI. [Online] Available at: https://www.microsoft.com/copilot [Accessed: 31 August 2024].

// Own learned knowledge and Class mates who were also a great help.

