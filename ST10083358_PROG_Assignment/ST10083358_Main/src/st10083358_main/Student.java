
package st10083358_main;

import java.util.ArrayList;
import java.util.Scanner;

    //Declaration of private instance variables

public class Student { //variables are declared here

    private String id;
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String course;

    //Constructor
    
    public Student(String id, String name, int age, String email, String phoneNumber, String course ) { //Initialization of a new Student object with the given id, name, age, email, phone number, and course.
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.course = course;
    }

    // Get methods which are used to provide access to the private fields, allowing the safe retrieval of user information (Student details).
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    
    public String getPhonenumber() {
        return phoneNumber;
    }

    public String getCourse() {
        return course;
    }

    // This is the captureStudent Method used to capture a new students detials, these include the (student id, student name, student age, student email, student phone number, and lastly the student course).
    
    public static Student captureStudent(Scanner input) {
        System.out.print("\nEnter the student id: ");
        String id = input.nextLine();

        System.out.print("Enter the student name: ");
        String name = input.nextLine();

        System.out.print("Enter the student age: ");
        int age = -1;
        while (true) {                              //While loop containing if statements which contain parameters for the student Age.
            if (input.hasNextInt()) {
                age = input.nextInt();
                input.nextLine();
                if (age >= 16) {
                    break;
                }
            } else {
                input.nextLine();
            }
            System.out.println("Invalid input. Enter a valid student age (>=16): ");    //If an invalid age is entered that does not meet the set parameters for the student age, an invalid input statement is shown to the user and a valid age is asked for.
        }

        System.out.println("Enter the student email: ");
        String email = input.nextLine();
        
        System.out.println("Enter your phone number: ");
        String phoneNumber = input.nextLine();

        System.out.println("Enter the student course: ");
        String course = input.nextLine();

        return new Student(id, name, age, email, phoneNumber, course);  //The details are captured.
    }

    //This is the searchStudent Method used to search for a specific student details using a student ID number.
    
    public static void searchStudent(Scanner input, ArrayList<Student> students) {
        
        System.out.print("\nEnter the student id to search: ");
        String id = input.nextLine();

        //When the student ID entered is found in the stored data a for loop is used to call and display the specific student details which have been called.
        
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("\nStudent found:" + "\n---------------------------------------");
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Email: " + student.getEmail());
                System.out.println("Phone Number: " + student.getPhonenumber());
                System.out.println("Course: " + student.getCourse() + "\n---------------------------------------");
                return;
            }
        }
        System.out.println("Student with Student ID: " + id + " was not found!"); //If statement which returns an error message , if the entered ID number being searched is not found.
    }

    //This is the deleteStudent Method used when the user wants to delete a specific students details by ID number.
    
    public static boolean deleteStudent(Scanner input, ArrayList<Student> students) {
        System.out.print("\nEnter the student id to delete: ");
        String id = input.nextLine();

        for (int i = 0; i < students.size(); i++) {    //for loop making use of if and else statements to make sure a valid student ID is entered and if yes then a confirmation of deletion is displayed where the user then confirms the deletion.
            Student student = students.get(i);
            if (student.getId().equals(id)) {
                System.out.println("Are you sure you want to delete student " + id + " from the system? Yes (y) to delete: ");  //Enter y to confirm specific student details to be deleted.
                String confirmation = input.nextLine();
                if (confirmation.equalsIgnoreCase("y")) {
                    students.remove(i);
                    System.out.println("Student with Student ID: " + id + " was deleted!");
                    return true;
                } else {
                    System.out.println("Deletion cancelled."); //else statement used when anything other than y is entered by the user , cancelling the deletion of a specific students details.
                    return false;
                }
            }
        }

        System.out.println("Student with Student ID: " + id + " was not found!"); //When an invalid student ID is entered by a user an error message returns "Student with student ID .... was not found."
        return false;
    }

    // This is the studentReport Method used to print a student report of all the captured students details.
    
    public static void studentReport(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("\nNo students to display as none have been captured."); //If statement used for when there is no captured student details(student data).
            return;
        }

        System.out.println("\nStudent Report:" + "\n---------------------------------------");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("Student " + (i + 1) + ":" + "\n---------------------------------------");
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Phone Number: " + student.getPhonenumber());
            System.out.println("Course: " + student.getCourse() + "\n---------------------------------------");
        }
    }

    //This is the exitStudentApplication Method which is used to exit the student application.
  
    public static void exitStudentApplication() {
        System.out.println("You have successfully exited the Student Management Application."); //Message shown to the user when they have succesfully exited the student management application.
        System.exit(0);
    }
}
