/*  Task 10: Student Grade Calculator
    Write a Java program that calculates the average grade for a student based on their scores in multiple subjects. 
    The program should prompt the user to enter the number of subjects, followed by the scores. 
    It should then calculate and display the average grade. */ 

import java.util.Scanner;

public class StudentGradeCalculator{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        if(numSubjects <= 0){

            System.out.println("Please enter a valid number of subjects.");
            sc.close();
            return;
        }

        double[] scores = new double[numSubjects];

        // Input scores for each subject
        for(int i = 0; i < numSubjects; i++){

            System.out.print("Enter the score for subject " + (i + 1) + ": ");
            scores[i] = sc.nextDouble();
        }

        // Calculate the average grade
        double sum = 0;
        for(int i = 0; i < numSubjects; i++){
            sum += scores[i];
        }
        double average = sum / numSubjects;

        // Display the average grade
        System.out.println("Average grade: " + average);

        sc.close();
    }
}
