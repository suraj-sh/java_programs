// 2.7 Create a class "MathUtils" with overloaded methods to add integers and doubles.

public class MathUtils{
    
    // Method to add two integers
    public int add(int a, int b){

        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b){

        return a + b;
    }

    public static void main(String[] args){
        
        MathUtils math = new MathUtils();

        // Adding integers
        int sum1 = math.add(5, 10);
        System.out.println("Sum of integers: " + sum1);

        // Adding doubles
        double sum2 = math.add(3.5, 2.5);
        System.out.println("Sum of doubles: " + sum2);
    }
}
