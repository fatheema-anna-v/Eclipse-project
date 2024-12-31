package Assignments;

import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Create an array to hold the elements
        int[] arr = new int[n];
        
        // Read the elements from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Reverse the array
        int start = 0, end = n - 1;
        while (start < end) {
            // Swap the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move the pointers towards the center
            start++;
            end--;
        }
        
        // Output the reversed array
        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
       
    }
}
