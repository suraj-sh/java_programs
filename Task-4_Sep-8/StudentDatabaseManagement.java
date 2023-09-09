/*  Task: Student Database Management
    Create a Java program that interacts with a MySQL database to manage student records. 
    You will need to set up a MySQL database and perform CRUD (Create, Read, Update, Delete) 
    operations on student records using JDBC.
    Database Setup:
        Create a MySQL database named student_db.
        Create a table named students with columns: id, name, age, and grade.
    Java Program:
        Write a Java program that establishes a connection to the MySQL database using JDBC.
        Implement methods for the following operations:
        Add Student: Prompt the user to enter student details and insert them into the students table.
        View All Students: Retrieve and display all student records from the students table.
        Update Student: Prompt the user to enter a student ID and new details (name, age, grade), 
        then update the corresponding record in the database.
        Delete Student: Prompt the user to enter a student ID and delete the corresponding record from the database.
        Error Handling:
        Implement proper error handling for database connection issues, SQL errors, and user inputs.
        Remember to replace your_username and your_password with your MySQL credentials.
        In the program, you will need to use the Statement or PreparedStatement objects to execute SQL queries 
        for CRUD operations. You can use ResultSet to retrieve data from database queries. */

import java.sql.*;
import java.util.Scanner;

public class StudentDatabaseManagement{

    public static void main(String[] args){

        // JDBC connection details
        String jdbcUrl = "jdbc:mysql://localhost:3306/student_db?useSSL=false";
        String user = "root";
        String password = "Root@123!";

        try{
            // Establish JDBC connection
            Connection conn = DriverManager.getConnection(jdbcUrl, user, password);

            // Create a Scanner object for user input
            Scanner sc = new Scanner(System.in);

            // Create a menu for CRUD operations
            while(true){

                System.out.println("Student Database Management Menu:");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch(choice){

                    case 1: // Implement the Add Student operation
                            addStudent(conn, sc);
                            break;
                    case 2: // Implement the View All Students operation
                            viewAllStudents(conn);
                            break;
                    case 3: // Implement the Update Student operation
                            updateStudent(conn, sc);
                            break;
                    case 4: // Implement the Delete Student operation
                            deleteStudent(conn, sc);
                            break;
                    case 5: // Exit the program
                            sc.close();
                            conn.close();
                            System.exit(0);
                            
                    default: System.out.println("Invalid choice. Please try again.");
                }
            }
        } 
        catch(SQLException e){
            e.printStackTrace();
        }
    }


    // Method for adding a student
    private static void addStudent(Connection conn, Scanner sc) throws SQLException{

        System.out.print("Enter student name: ");
        String name = sc.next();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        System.out.print("Enter student grade: ");
        String grade = sc.next();

        String sql = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.setString(3, grade);

        int rowsInserted = ps.executeUpdate();
        if(rowsInserted > 0){
            System.out.println("Student added successfully.");
        } 
        else{
            System.out.println("Failed to add student.");
        }
    }

    // View all students
    private static void viewAllStudents(Connection conn) throws SQLException{

        String sql = "SELECT * FROM students";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        System.out.println("List of Students:");
        while(resultSet.next()){

            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String grade = resultSet.getString("grade");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
        }

        resultSet.close();
        statement.close();
    }

    // Update a student's information
    private static void updateStudent(Connection conn, Scanner sc) throws SQLException{

        System.out.print("Enter student ID to update: ");
        int studentId = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter new name: ");
        String newName = sc.nextLine();

        System.out.print("Enter new age: ");
        int newAge = sc.nextInt();

        System.out.print("Enter new grade: ");
        String newGrade = sc.next();

        String sql = "UPDATE students SET name=?, age=?, grade=? WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, newName);
        ps.setInt(2, newAge);
        ps.setString(3, newGrade);
        ps.setInt(4, studentId);

        int rowsUpdated = ps.executeUpdate();
        if(rowsUpdated > 0){
            System.out.println("Student information updated successfully.");
        } 
        else{
            System.out.println("No student found with the provided ID.");
        }

        ps.close();
    }

    // Delete a student
    private static void deleteStudent(Connection conn, Scanner sc) throws SQLException{

        System.out.print("Enter student ID to delete: ");
        int studentId = sc.nextInt();

        String sql = "DELETE FROM students WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, studentId);

        int rowsDeleted = ps.executeUpdate();
        if(rowsDeleted > 0){
            System.out.println("Student deleted successfully.");
        } 
        else{
            System.out.println("No student found with the provided ID.");
        }

        ps.close();
    }

}
