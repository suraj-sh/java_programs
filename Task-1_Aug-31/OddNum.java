// 11. Create a loop that prints the numbers from 1 to 10, and then modify it to print only the odd numbers.
public class OddNum{

    public static void main(String[] args){

        System.out.println("Printing numbers from 1 to 10:");
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }

        System.out.println("\nPrinting odd numbers from 1 to 10:");
        for(int i = 1; i <= 10; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
