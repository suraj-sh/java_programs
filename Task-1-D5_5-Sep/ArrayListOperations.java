// 2.17 Utilize an ArrayList to manage a list of names and perform basic operations like insertion and deletion.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations{
    public static void main(String[] args){

        ArrayList<String> nameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Name List:");

            for(String name : nameList){

                System.out.println(name);
            }

            System.out.println("\nOptions:");
            System.out.println("1. Add a name");
            System.out.println("2. Remove a name");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch(choice){

                case 1: System.out.print("Enter a name to add: ");
                        String newName = scanner.next();
                        nameList.add(newName);
                        System.out.println(newName + " has been added to the list.");
                        break;
                
                case 2: if(nameList.isEmpty()){
                            System.out.println("The list is empty. Cannot remove a name.");
                        } 
                        else{
                            System.out.print("Enter the name to remove: ");
                            String nameToRemove = scanner.next();
                            if(nameList.remove(nameToRemove)){
                                System.out.println(nameToRemove + " has been removed from the list.");
                            } 
                            else{
                                System.out.println(nameToRemove + " was not found in the list.");
                            }
                        }
                        break;

                case 3: System.out.println("Exiting program.");
                        scanner.close();
                        System.exit(0);
                
                default: System.out.println("Invalid choice. Please enter a valid option.");
                         break;
            }
        }
    }
}

