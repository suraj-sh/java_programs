/*  Task 3: Factorial Calculation
    Write a Java program to calculate the factorial of a user-defined positive integer 
    using both iterative and recursive approaches. */

import java.util.Scanner;

public class FactorialCalculation{
    // Iterative approach to calculate factorial
    public static int factorialIterative(int n){
        if(n <= 0){
            return 1; // Factorial of 0 is 1
        }
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    // Recursive approach to calculate factorial
    public static int factorialRecursive(int n){
        if(n <= 0){
            return 1; // Factorial of 0 is 1
        } 
        else{
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if(n < 0){
            System.out.println("Factorial cannot be negative.");
        } 
        else{
            // Calculate factorial using iterative approach
            int iterativeFactorial = factorialIterative(n);
            System.out.println("Factorial (Iterative) of " + n + " is: " + iterativeFactorial);

            // Calculate factorial using recursive approach
            int recursiveFactorial = factorialRecursive(n);
            System.out.println("Factorial (Recursive) of " + n + " is: " + recursiveFactorial);
        }

        scanner.close();
    }
}
