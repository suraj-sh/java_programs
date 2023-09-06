// 15. Manipulate a string using various String class methods like length(), toUpperCase(), and substring().

public class StringManipulation{
    public static void main(String[] args){

        String str = "Suraj Sharma";
        
        // Calculate the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Convert the string to uppercase
        String upperCaseString = str.toUpperCase();
        System.out.println("Uppercase version: " + upperCaseString);
        
        // Extract a substring
        int start = 3;
        int end = 12;
        String substring = str.substring(start, end);
        System.out.println("Substring from index " + start + " to " + end + ": " + substring);
    }
}
