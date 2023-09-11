/*  Task: Employee Management System with JDBC
    Build an Employee Management System using JDBC. This task will help you practice creating a 
    complete application that interacts with a database using JDBC for CRUD operations.
    Database Setup:
        Set up a MySQL database named employee_management.
        Create a table named employees with columns: id, first_name, last_name, email, and salary.
    Java Application:
        Create a Java application for managing employee records using JDBC.
    Employee Class:
        Create an Employee class with attributes corresponding to the database columns.
        Implement constructors, getters, setters, and a toString method.
    Database Connection:
        Set up a JDBC connection to the database using the appropriate JDBC driver.
    CRUD Operations:
        Implement methods for the following CRUD operations:
        createEmployee(Employee employee): Insert a new employee record into the database.
        getEmployeeById(int id): Retrieve an employee's information by their ID.
        getAllEmployees(): Retrieve a list of all employees.
        updateEmployee(Employee employee): Update an employee's information in the database.
        deleteEmployee(int id): Delete an employee's record from the database.
    User Interface:
        Create a simple command-line user interface that allows the user to interact with the application.
        Display a menu with options to perform CRUD operations.
    Error Handling:
        Implement appropriate error handling for database connection issues and SQL errors.
    Testing and Demonstration:
        Write a script that demonstrates the usage of your Employee Management System.
        Perform various CRUD operations and display the results. */


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Employee class to represent employee data
class Employee{

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;

    // Constructor
    public Employee(String firstName, String lastName, String email, double salary){

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
    }

    // Getters
    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public double getSalary(){
        return salary;
    }

    // Setters
    public void setId(int id){
        this.id = id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    } 

    public void setEmail(String email){
        this.email = email;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    // toString method to display employee records
    public String toString(){

        return " " + id + " | " + firstName + " | " + lastName + " | " + email + " | " + salary;
    }
    
}

// EmployeeDAO interface to specify CRUD operations
interface EmployeeDAO{

    void createEmployee(Employee employee);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
    void closeConnection();
}

// Implement EmployeeDAO interface in the EmployeeDaoJdbcImpl class
class EmployeeDaoJdbcImpl implements EmployeeDAO{

    private Connection conn;

    public EmployeeDaoJdbcImpl(){
        conn = DatabaseConnection.getConnection();
    }

    // 1. Add employee method
    public void createEmployee(Employee employee){

        try{
            String sql = "INSERT INTO employees (first_name, last_name, email, salary) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getEmail());
            ps.setDouble(4, employee.getSalary());

            int rowsInserted = ps.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Employee added successfully!");
            } 
            else{
                System.out.println("Failed to add employee.");
            }
        } 
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error: Failed to add employee.");
        }
    }

    // 2. View Employee by ID method
    public Employee getEmployeeById(int id){

        try{
            String sql = "SELECT * FROM employees WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet resultSet = ps.executeQuery();
            if(resultSet.next()){

                Employee employee = new Employee(sql, sql, sql, id);
                employee.setId(resultSet.getInt("id"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
                employee.setEmail(resultSet.getString("email"));
                employee.setSalary(resultSet.getDouble("salary"));
                return employee;
            }
        } 
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error: Failed to retrieve employee by ID.");
        }
        return null;
    }

    // 3. View All Employees method
    public List<Employee> getAllEmployees(){

        List<Employee> employees = new ArrayList<>();
        try{
            String sql = "SELECT * FROM employees";
            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){

                Employee employee = new Employee(sql, sql, sql, 0);
                employee.setId(resultSet.getInt("id"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
                employee.setEmail(resultSet.getString("email"));
                employee.setSalary(resultSet.getDouble("salary"));
                employees.add(employee);
            }
        } 
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error: Failed to retrieve employees.");
        }
        return employees;
    }

    // 4. Update Employee method 
    public void updateEmployee(Employee employee){

        try{
            String sql = "UPDATE employees SET first_name=?, last_name=?, email=?, salary=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getEmail());
            ps.setDouble(4, employee.getSalary());
            ps.setInt(5, employee.getId());

            int rowsUpdated = ps.executeUpdate();
            if(rowsUpdated > 0){
                System.out.println("Employee updated successfully!");
            } 
            else{
                System.out.println("Failed to update employee.");
            }
        } 
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error: Failed to update employee.");
        }
    }

    // 5. Delete Employee method
    public void deleteEmployee(int id){

        try{
            String sql = "DELETE FROM employees WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int rowsDeleted = ps.executeUpdate();
            if(rowsDeleted > 0){
                System.out.println("Employee deleted successfully!");
            } 
            else{
                System.out.println("Failed to delete employee.");
            }
        } 
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error: Failed to delete employee.");
        }
    }

    // 6. Close the connection
    public void closeConnection(){

        try{
            if(conn != null){
                conn.close();
            }
        } 
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

// DatabaseConnection class to handle database connections
class DatabaseConnection{

    // 'useSSL=false' is not recommended in production because we need SSL connection
    private static String URL = "jdbc:mysql://localhost/employee_management?useSSL=false";
    private static String USER = "root";
    private static String PASSWORD = "Root@123!";

    public static Connection getConnection(){

        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } 
        catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database.");
        }
    }
}

// Main application class
public class EmployeeManagementSystem{

    public static void main(String[] args){

        EmployeeDAO employeeDAO = new EmployeeDaoJdbcImpl();
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println();
            System.out.println("Employee Management System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee by ID");
            System.out.println("3. View All Employees");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice){

                case 1: // Add Employee
                        Employee newEmployee = readEmployeeDetails(sc);
                        employeeDAO.createEmployee(newEmployee);
                        System.out.println("Employee added successfully!");
                        break;

                case 2: // View Employee by ID
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        Employee employeeById = employeeDAO.getEmployeeById(id);
                        if(employeeById != null){
                            System.out.println(employeeById);
                        } 
                        else{
                            System.out.println("Employee not found.");
                        }
                        break;

                case 3: // View All Employees
                        List<Employee> allEmployees = employeeDAO.getAllEmployees();
                        if(!allEmployees.isEmpty()){
                            for(Employee emp : allEmployees){
                                System.out.println(emp);
                            }
                        } 
                        else{
                            System.out.println("No employees found.");
                        }
                        break;

                case 4: // Update Employee
                        System.out.print("Enter Employee ID to update: ");
                        int updateId = sc.nextInt();
                        Employee updatedEmployee = readEmployeeDetails(sc);
                        updatedEmployee.setId(updateId);
                        employeeDAO.updateEmployee(updatedEmployee);
                        break;

                case 5: // Delete Employee
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = sc.nextInt();
                        employeeDAO.deleteEmployee(deleteId);
                        break;

                case 6: // Close the database connection and exit
                        employeeDAO.closeConnection();
                        System.out.println("Exiting Employee Management System");
                        System.exit(0);

                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to read employee details from the user
    private static Employee readEmployeeDetails(Scanner sc){

        System.out.print("Enter First Name: ");
        String firstName = sc.next();

        System.out.print("Enter Last Name: ");
        String lastName = sc.next();

        System.out.print("Enter Email: ");
        String email = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        return new Employee(firstName, lastName, email, salary);
    }
}
