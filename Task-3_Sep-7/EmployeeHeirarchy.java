/*  Task 8: Employee Hierarchy
    Create a class hierarchy for employees: Employee, Manager, and Executive. 
    Each subclass should have attributes specific to their roles. 
    Implement methods to calculate salaries, taking into account bonuses and benefits. */

// Employee class
class Employee{

    private String name;
    private String employeeId;
    private double baseSalary;

    public Employee(String name, String employeeId, double baseSalary){

        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public String getName(){
        return name;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    // Calculate the salary for a generic employee (without any bonuses or benefits)
    public double calculateSalary(){
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee Details:\n" +
               "Name: " + name + "\n" +
               "Employee ID: " + employeeId + "\n" +
               "Base Salary: Rs." + baseSalary + "\n" +
               "Salary: Rs." + calculateSalary() + "\n";
    }
}

// Manager class (subclass of Employee)
class Manager extends Employee{

    private double bonus;

    public Manager(String name, String employeeId, double baseSalary, double bonus){

        super(name, employeeId, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    // Calculate the salary for a manager, including the bonus
    @Override
    public String toString() {
        return super.toString() +
               "Bonus: Rs." + bonus + "\n" +
               "Salary (including Bonus): Rs." + calculateSalary() + "\n";
    }
}

// Executive class (subclass of Manager)
class Executive extends Manager{

    private double stockOptions;

    public Executive(String name, String employeeId, double baseSalary, double bonus, double stockOptions){

        super(name, employeeId, baseSalary, bonus);
        this.stockOptions = stockOptions;
    }

    public double getStockOptions(){
        return stockOptions;
    }

    // Calculate the salary for an executive, including the bonus and stock options
    @Override
    public String toString() {
        return super.toString() +
               "Stock Options: Rs." + stockOptions + "\n" +
               "Salary (including Bonus and Stock Options): Rs." + calculateSalary() + "\n";
    }
}

public class EmployeeHeirarchy{

    public static void main(String[] args){

        // Create instances of employees
        Employee employee = new Employee("Suraj Sharma", "E001", 50000);
        Manager manager = new Manager("Sanchay Kumar", "M001", 60000, 10000);
        Executive executive = new Executive("Swapnil Shinde", "X001", 80000, 15000, 20000);

        // Display employee details and salaries
        System.out.println(employee);
        System.out.println(manager);
        System.out.println(executive);
       
    }
}
