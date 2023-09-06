/*  Task 6: Reverse Array
    Write a Java program that reverses the elements of an array of integers. */

import java.util.Scanner;

public class ReverseArray{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        // Declaring an array
        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // calling the reverseArray method
        reverseArray(arr);

        // Display the reversed array
        System.out.println("Reversed array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static void reverseArray(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            // Swap elements at left and right positions
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }
    }
}

