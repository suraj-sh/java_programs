// 16. Given a string, write a program to count the occurrences of a specific character.

public class CharacterCount{

    public static void main(String[] args){

        String str = "Suraj Sharma";
        char findChar = 'a'; // The character to count

        int count = countOccurrences(str, findChar);

        System.out.println("The character '" + findChar + "' appears " + count + " times in the string.");
    }

    public static int countOccurrences(String str, char findChar){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == findChar){
                count++;
            }
        }

        return count;
    }
}
