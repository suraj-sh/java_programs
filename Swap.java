// WAP to swap two numbers
public class Swap{

    public static void main(String[] args){
        int num1 = 5;
        int num2 = 10;
        
        System.out.println("Before swapping: num1 = " + num1);
        System.out.println("Before swapping: num2 = " + num2);
        
        // Swap using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("After swapping: num1 = " + num1);
        System.out.println("After swapping: num2 = " + num2);
    }
}
