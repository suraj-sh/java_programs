// 2.16 Write a program that showcases exception handling using try, catch, and finally blocks.

public class Exception{

    public static void main(String[] args){
     
        System.out.println("Progrm is started");
        System.out.println("Progrm is running");

        int a = 100;
        try{
           
            System.out.println(a / 0);
        } 
        catch(ArithmeticException e){

            System.out.println("Arithmetic exception is occurred and handled successfully");
        }
        finally{

            System.out.println("This is finally block");
        }

        System.out.println("Progrm is Completed");
        System.out.println("Progrm is exited");
    }
}