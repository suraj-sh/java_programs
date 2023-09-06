/*  Task 4: Palindrome Checker
    Write a Java program that checks whether a given string is a palindrome 
    (reads the same forwards and backwards), ignoring spaces and case. */

import java.util.Scanner;

public class PalindromeChecker{

    public static boolean isPalindrome(String str){
        // Remove spaces and convert the string to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if(result){
            System.out.println("The string is a palindrome.");
        } 
        else{
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}