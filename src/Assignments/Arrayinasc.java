package Assignments;

import java.util.Scanner;

public class Arrayinasc {
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
        
        // Sort the array using Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // Output the sorted array
        System.out.print("Sorted array in ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        
    }
}
