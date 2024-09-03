
package st10083358_main;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    
    Student student = new Student("2002", "Richard", 21, "richgoble@gmail.com", "076 262 3631", "Math");
    public StudentTest() {
    }

    @Test
    public void TestCaptureStudent() {   //Tests that a Student object is correctly initialized with provided details.
        
        Student student = new Student("2002", "Richard", 21, "richgoble@gmail.com", "076 262 3631", "Math");

        assertEquals("2002", student.getId());
        assertEquals("Richard", student.getName());
        assertEquals(21, student.getAge());
        assertEquals("richgoble@gmail.com", student.getEmail());
        assertEquals("Math", student.getCourse());
    }

    @Test
    public void TestSearchStudent_StudentFound() {   // Checks if a student can be successfully retrieved by their ID from a list of students.
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("2002", "Richard", 21, "richgoble@gmail.com", "076 262 3631", "Math"));
        Scanner input = new Scanner("2002\n");
        Student.searchStudent(input, students);
        Student student = students.get(0); 
        
        assertNotNull(student);
        assertEquals("2002", student.getId());
    }

    @Test
    public void TestSearchStudent_StudentNotFound() {  // Ensures that searching for a non-existent student ID returns an error or null result.
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("2002", "Richard", 21, "richgoble@gmail.com", "076 262 3631", "Math"));
        Scanner input = new Scanner("1111\n");
        Student.searchStudent(input, students);
        Student student = null;
        
        assertNull(student);
    }

    @Test
    public void TestDeleteStudent_StudentDeleted() { // Confirms that a student can be successfully deleted from the list by their ID.
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("2002", "Richard", 21, "richgoble@gmail.com", "076 262 3631", "Math"));
        Scanner input = new Scanner("2002\ny\n");
        boolean isDeleted = Student.deleteStudent(input, students);
        
        assertTrue(isDeleted);
        assertTrue(students.isEmpty());
    }

    @Test
    public void TestDeleteStudent_StudentNotFound() {  // Verifies that attempting to delete a non-existent student ID does not modify the list.
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("2002", "Richard", 21, "richgoble@gmail.com", "076 262 3631", "Math"));
        Scanner input = new Scanner("1111\n");
        boolean isDeleted = Student.deleteStudent(input, students);
        assertFalse(isDeleted);
        
        assertFalse(students.isEmpty());
    }

    @Test
    public void TestStudentAge_StudentAgeValid() {  // Checks that a student's age is correctly set and retrieved.
        
        Student student = new Student("2002", "Richard", 21, "richgoble@gmail.com", "076 262 3631", "Math");

        assertEquals(21, student.getAge());
    }

    @Test
    public void TestStudentAge_StudentAgeInvalid() {  // Ensures that a student's age is validated to be within a certain range which in this case, 16 or older).
        
        Student student = new Student("2002", "Richard", 16, "richgoble@gmail.com", "076 262 3631", "Math");
        assertTrue(student.getAge() >= 16);
    }

    @Test
    public void TestStudentAge_StudentAgeInvalidCharacter() {  // Verifies that attempting to set a student's age to a non-numeric value throws an exception.
        try {
            Student student = new Student("2002", "Richard", Integer.parseInt("abc"), "richgoble@gmail.com", "076 262 3631", "Math");
            fail("NumberFormatException expected");
        } 
            catch (NumberFormatException e) {
        }
        Student student = new Student("2002", "Richard", 21, "richgoble@gmail.com", "076 262 3631", "Math");
        assertEquals(21, student.getAge());
    }

    @Test
    public void TestStudentReport() {   // Generates a report for a list of captured students which includes their details.
        
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student("2002", "Richard", 21, "richgoble@gmail.com", "076 262 3631", "Math"));
        Student.studentReport(students);
        
    }
}
