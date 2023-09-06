/*  1. WAP with which you can simulate one round of fight between you and monster.
    2. Modify it so that the fight continues until both becomes 0.
    3. Hero runs away from a too powerful monster, if hero runs lose some points but still remains alive.
    4. Name the monster randomly and select it with a switch.
    5. Let the hero fight with 3 monsters */

import java.util.Scanner;
import java.util.Random;

public class Fighting{
    
    public static void main(String[] args){
        
        // Create a Scanner for user input
        Scanner sc = new Scanner(System.in);

        Random generator = new Random();

        // Get attributes for the hero
        System.out.print("Your Attack points: ");
        int yourAttack = generator.nextInt(6) + 5;
        System.out.println(yourAttack);
        System.out.print("Your Defense points: ");
        int yourDefense = generator.nextInt(10) + 6;
        System.out.println(yourDefense);
        System.out.print("Your Damage: ");
        int yourDamage = generator.nextInt(3) + 2;
        System.out.println(yourDamage);
        System.out.print("Your Life points: ");
        int yourLife = generator.nextInt(20) + 25;
        System.out.println(yourLife);

        for(int i = 0; i < 3; i++){

            String monsterName;
            int num = generator.nextInt(5);
            switch(num){
                case 0: monsterName = "Black Daemon"; break;
                case 1: monsterName = "The Rabbit"; break;
                case 2: monsterName = "Silver Dragon"; break;
                case 3: monsterName = "Mountain Troll"; break;
                case 4: monsterName = "Alien"; break;
                default: monsterName = "N/A"; break;
            }
            
            // Get attributes for the monster
            System.out.print("Attack points of " + monsterName + ": ");
            int monsterAttack = generator.nextInt(8) + 1;
            System.out.println(monsterAttack);
            System.out.print("Defense points of " + monsterName + ": ");
            int monsterDefense = generator.nextInt(10) + 3;
            System.out.println(monsterDefense);
            System.out.print("Damage of " + monsterName + ": ");
            int monsterDamage = generator.nextInt(3) + 1;
            System.out.println(monsterDamage);
            System.out.print("Life points of " + monsterName + ": ");
            int monsterLife = generator.nextInt(20) + 15;
            System.out.println(monsterLife);

            boolean runaway = false;

            do {
                boolean attacker = generator.nextBoolean();

                // Check who attacks first
                if(attacker){
                    // Hero Attacks
                    System.out.println("You Attack");
                    
                    // Generate a random number between 1 and 6 for two dice rolls and add them
                    int dice = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
                    int attackValue = yourAttack + dice;
                    
                    // Display the rolled values and attack value
                    System.out.println("Rolled values: " + dice);
                    System.out.println("Your attack value: " + attackValue);
                    
                    if(attackValue > monsterDefense){
                        // Hero's attack was successful
                        monsterLife -= yourDamage;
                        System.out.println(monsterName + "'s remaining life points: " + monsterLife);
                    } 
                    else{
                        // Hero's attack was not successful
                        System.out.println("Your attack was not successful");
                    }
                } 
                else{
                    // Monster Attacks
                    System.out.println(monsterName + " Attacks");
                    
                    // Generate a random number between 1 and 6 for two dice rolls and add them
                    int dice = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
                    int attackValue = monsterAttack + dice;
                    
                    // Display the rolled values and monster's attack value
                    System.out.println("Rolled values: " + dice);
                    System.out.println(monsterName + "'s attack value: " + attackValue);
                    
                    if(attackValue > yourDefense){
                        // Monster's attack was successful
                        yourLife -= monsterDamage;
                        System.out.println("Your remaining life points: " + yourLife);
                    } 
                    else{
                        // Monster's attack was not successful
                        System.out.println(monsterName + "'s attack was not successful");
                    }
                }

                System.out.println("Press ENTER to continue. (or type in 'run' to run away)");
                String command = sc.nextLine();
                switch(command){

                    case "run":
                        System.out.println("You ran away. You coward! -4 Life Points!");
                        yourLife -= 4;
                        runaway = true;
                        break;
                }
            }while(yourLife > 0 && monsterLife > 0 && !runaway);

            if(yourLife <= 0){
                System.out.println("You are dead. R.I.P. :-(");
                break;
            }
            if(monsterLife <= 0){
                System.out.println("You won. The " + monsterName + " is dead");
            }
        }
        // Close the Scanner
        sc.close();
    }
}
