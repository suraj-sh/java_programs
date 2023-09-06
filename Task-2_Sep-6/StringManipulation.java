/*  Task 7: String Manipulation
    Write a Java program that takes a user-defined sentence and performs the following tasks:
    1.  Count the number of vowels and consonants.
    2.  Convert the sentence to uppercase and lowercase.
    3.  Reverse the sentence without reversing the words. */

import java.util.Scanner;

public class StringManipulation{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        //  1: Count vowels and consonants
        int vowels = 0;
        int consonants = 0;
        input = input.toLowerCase(); // Convert the sentence to lowercase for easier vowel checking
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                } 
                else{
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        //  2: Convert the sentence to uppercase and lowercase
        String uppercaseSentence = input.toUpperCase();
        String lowercaseSentence = input.toLowerCase();
        System.out.println("Uppercase sentence: " + uppercaseSentence);
        System.out.println("Lowercase sentence: " + lowercaseSentence);

        //  3: Reverse the sentence without reversing words
        String[] words = input.split("\\s+"); // Split the sentence into words
        StringBuilder reversedSentence = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            reversedSentence.append(words[i]).append(" ");
        }
        reversedSentence.setLength(reversedSentence.length() - 1); // Remove the trailing space
        System.out.println("Reversed sentence (without reversing words): " + reversedSentence);

        sc.close();
    }
}
