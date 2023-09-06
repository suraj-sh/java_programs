/*  Task 2: Fibonacci Series
    Write a Java program to generate the Fibonacci series up to a user-defined limit. 
    The Fibonacci series starts with 0 and 1, and each subsequent number is the sum of the two preceding ones. */

import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the limit for the Fibonacci series
        System.out.print("Enter the limit [from 0 to]: ");
        int limit = scanner.nextInt();

        if(limit <= 0){
            System.out.println("Please enter a positive limit.");
        } 
        else{
            // Initialize the first two numbers of the Fibonacci series
            int num1 = 0, num2 = 1;

            // Print the first two numbers
            System.out.print("Fibonacci Series: " + num1 + " " + num2);

            // Generate and print the rest of the Fibonacci series
            while(num1 + num2 <= limit){
                int nextNum = num1 + num2;
                System.out.print(" " + nextNum);
                num1 = num2;
                num2 = nextNum;
            }
        }

        scanner.close();
    }
}
