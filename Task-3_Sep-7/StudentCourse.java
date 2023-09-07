/*  Task 5: Student and Course
    Create Java classes Student and Course. A Course can have multiple students. 
    Implement methods to enroll students, drop students, and calculate the average GPA for a course. */

import java.util.ArrayList;
import java.util.List;

class Student{

    private String studentID;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String studentID, String firstName, String lastName, double gpa){

        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getStudentID(){
        return studentID;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public double getGpa(){
        return gpa;
    }
}

class Course{

    private String courseCode;
    private List<Student> enrolledStudents;

    public Course(String courseCode){

        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student){

        enrolledStudents.add(student);
        System.out.println(student.getFullName() + " has been enrolled in " + courseCode);
    }

    public void dropStudent(Student student){

        if(enrolledStudents.contains(student)){

            enrolledStudents.remove(student);
            System.out.println(student.getFullName() + " has been dropped from " + courseCode);
        } 
        else{
            System.out.println(student.getFullName() + " is not enrolled in " + courseCode);
        }
    }

    public double calculateAverageGpa(){

        if(enrolledStudents.isEmpty()){
            return 0.0;
        }

        double totalGpa = 0.0;
        for(Student student : enrolledStudents){
            totalGpa += student.getGpa();
        }

        return totalGpa / enrolledStudents.size();
    }

    public String toString() {
        return courseCode;
    }
}

public class StudentCourse{

    public static void main(String[] args){

        // Create students
        Student student1 = new Student("001", "Suraj", "Sharma", 3.5);
        Student student2 = new Student("002", "Sanjay", "Kumar", 3.8);
        Student student3 = new Student("003", "Swapnil", "Shinde", 3.2);

        // Create a course
        Course cr = new Course("CS50");

        // Enroll students
        cr.enrollStudent(student1);
        cr.enrollStudent(student2);
        cr.enrollStudent(student3);

        // Calculate and display the average GPA for the course
        double averageGpa = cr.calculateAverageGpa();
        System.out.println("Average GPA for course " + cr + ": " + averageGpa);

        // Drop a student
        cr.dropStudent(student2);

        // Recalculate and display the average GPA after dropping a student
        averageGpa = cr.calculateAverageGpa();
        System.out.println("Average GPA for course " + cr + " after dropping a student: " + averageGpa);
    }
}
