// 2.18 Implement a HashMap to store and retrieve key-value pairs representing words and their meanings.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapWords{
    public static void main(String[] args){

        Map<String, String> wordMeanings = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Populate the dictionary with some initial words and meanings
        wordMeanings.put("apple", "a round fruit with red or green skin and white flesh");
        wordMeanings.put("book", "a written or printed work consisting of pages glued or sewn together");
        wordMeanings.put("computer", "an electronic device for storing and processing data");

        while(true){

            System.out.println("Dictionary Menu:");
            System.out.println("1. Look up a word");
            System.out.println("2. Add a new word");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch(choice){

                case 1: System.out.print("Enter a word to look up: ");
                        String lookupWord = scanner.nextLine();
                        String meaning = wordMeanings.get(lookupWord);
                        if(meaning != null){
                            System.out.println("Meaning: " + meaning);
                        } 
                        else{
                            System.out.println("Word not found in the dictionary.");
                        }
                        break;

                case 2: System.out.print("Enter a new word: ");
                        String newWord = scanner.nextLine();
                        System.out.print("Enter its meaning: ");
                        String newMeaning = scanner.nextLine();
                        wordMeanings.put(newWord, newMeaning);
                        System.out.println("Word and meaning added to the dictionary.");
                        break;

                case 3: System.out.println("Exiting the dictionary.");
                        scanner.close();
                        System.exit(0);

                default: System.out.println("Invalid choice. Please enter a valid option.");
                         break;
            }
        }
    }
}
