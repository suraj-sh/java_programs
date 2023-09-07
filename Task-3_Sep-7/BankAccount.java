/*  Task 2: Bank Account
    Create a Java class BankAccount with attributes like account number, balance, and account holder. 
    Implement methods for deposit, withdrawal, and displaying the account information.  */

public class BankAccount{

    private String accNo;
    private double balance;
    private String accHol;

    // Constructor
    public BankAccount(String accNo, double balance, String accHol){

        this.accNo = accNo;
        this.balance = balance;
        this.accHol = accHol;
    }

    // Method to deposit funds into the account
    public void deposit(double amount){

        if(amount > 0){

            balance += amount;
            System.out.println("Deposit of Rs." + amount + " successful.");
        } 
        else{
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount){

        if(amount > 0 && amount <= balance){

            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful.");
        } 
        else if(amount <= 0){
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } 
        else{
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Method to display account information
    public void displayAccountInfo(){

        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + accHol);
        System.out.println("Balance: Rs." + balance);
    }

    public static void main(String[] args){

        // Creating Object myAccount
        BankAccount myAccount = new BankAccount("1234567890", 1000.0, "Suraj Sharma");

        myAccount.displayAccountInfo(); // Display initial account information

        myAccount.deposit(500.0); // Deposit Rs.500
        myAccount.withdraw(200.0); // Withdraw Rs.200

        myAccount.displayAccountInfo(); // Display updated account information
    }
}
