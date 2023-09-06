/*  Task 1: Sum of Even Numbers
    Write a Java program that calculates the sum of all even numbers 
    between 1 and a user-defined positive integer. */

import java.util.Scanner;

public class SumOfEvenNumbers{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number [from 1 to]: ");
        int n = scanner.nextInt();

        if(n <= 0){
            System.out.println("Please enter a positive integer.");
        } 
        else{
            int sum = 0;

            // Calculate the sum of even numbers from 1 to n
            for(int i = 2; i <= n; i += 2){
                sum += i;
            }

            System.out.println("The sum of even numbers from 1 to " + n + " is: " + sum);
        }

        scanner.close();
    }
}
