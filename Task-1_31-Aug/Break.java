// 12. How would you use the break statement within a loop? Provide an example.
public class Break{

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

            // loop will print the values from 1 until 5 and then it terminates the loop
            if (i == 5) {
                System.out.println("\nReached 5, exiting loop.");
                break;
            }
        }
    }
}
