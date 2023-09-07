/*  Task 6: Inheritance
    Extend the Person class from Task 1 to create a subclass Student. 
    Add attributes like student ID and major. Override the toString method to display student-specific information. */

class PersonInfo{

    private String name;
    private int age;
    private String email;

    // Constructor
    public PersonInfo(String name, int age, String email){

        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // Display
    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nEmail: " + email;
    }
}

class Student extends PersonInfo{

    private String studentID;
    private String major;

    // Constructor
    public Student(String name, int age, String email, String studentID, String major){

        super(name, age, email);
        this.studentID = studentID;
        this.major = major;
    }

    // Getters
    public String getStudentID(){
        return studentID;
    }

    public String getMajor(){
        return major;
    }

    // Setters
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public void setMajor(String major){
        this.major = major;
    }

    // Display
    public String toString(){
        return super.toString() + "\nStudent ID: " + studentID + "\nMajor: " + major;
    }
}

public class StudentInheritance{
    public static void main(String[] args){

        Student student = new Student("Suraj Sharma", 23, 
                                "suraj.sharma@studentemail.com", 
                                "12345", "Computer Science");

        System.out.println("Student Information:");
        System.out.println(student);

        student.setMajor("Mathematics");
        System.out.println("\nUpdated Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Major: " + student.getMajor());
    }
}
