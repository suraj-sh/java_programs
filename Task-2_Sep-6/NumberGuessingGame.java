/*  Task 8: Number Guessing Game
    Write a Java program for a number guessing game. 
    The program generates a random number between 1 and 100, and the user tries to guess the number. 
    The program provides hints like "Too high" or "Too low" until the user guesses the correct number. */

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        
        while(!hasGuessedCorrectly){

            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            numberOfTries++;

            if(userGuess < lowerBound || userGuess > upperBound){
                System.out.println("Please enter a number between 1 and 100.");
            } 
            else if(userGuess < numberToGuess){
                System.out.println("Too low! Try again.");
            } 
            else if(userGuess > numberToGuess){
                System.out.println("Too high! Try again.");
            } 
            else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly in " + numberOfTries + " tries.");
            }
        }

        sc.close();
    }
}
