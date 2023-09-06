import java.util.Scanner;

public class Temperature{

    public static void main(String[] args) {
        
        System.out.println("Temperture in Celsius : ");
        // Scanner for taking input from user
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
      
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        System.out.println("Fahrenheit : " + fahrenheit);
        
        // Close the scanner when you're done with it
        sc.close();
    }
    
}