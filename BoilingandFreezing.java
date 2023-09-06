import java.util.Scanner;

public class BoilingandFreezing{

    public static void main(String[] args){
        
        System.out.println("Temperature : ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

            if(temp >= 100){
                System.out.println("The water is boiling");
            }
            if(temp <= 0){
                System.out.println("The water is freezing");
            }
            if(0 < temp && temp < 100){
                System.out.println("The water is in normal state");
            }

            sc.close();
                
        }
}

