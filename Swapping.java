// Assignment Question 3
// WAP to swap without using third variable

public class Swapping{
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        
        System.out.println("Before swapping: num1 = " + num1);
        System.out.println("Before swapping: num2 = " + num2);
        
        // Swap without using a third variable
        num1 = num1 + num2;     //  num1 = 5 + 10 : 15 
        num2 = num1 - num2;     //  num2 = 15 - 10 : 5
        num1 = num1 - num2;     //  num1 = 15 - 5 : 10
        
        System.out.println("After swapping: num1 = " + num1);
        System.out.println("After swapping: num2 = " + num2);
    }
}
