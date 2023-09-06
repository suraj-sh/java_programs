/*  Task 5: Prime Number Checker
    Write a Java program that checks whether a user-defined positive integer is a prime number or not. */

import java.util.Scanner;

public class PrimeNumberChecker{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        int m = n / 2; // Calculate half of the input number
        int flag = 0; // Initialize a flag variable to check for prime

        if(n == 0 || n == 1){
            // Check if the input is 0 or 1, which are not prime
            System.out.println(n + " is not a prime number");
        } 
        else{
            for(int i = 2; i <= m; i++){
                // Iterate from 2 to m (half of the input number)
                if(n % i == 0){
                    // If n is divisible by i, it's not prime
                    System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                // If flag is still 0, it means n has no divisors other than 1 and itself
                System.out.println(n + " is a prime number");
            }
        }

        scanner.close();
    }
}

