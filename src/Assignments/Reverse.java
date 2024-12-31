package Assignments;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // Create scanner to read input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append characters in reverse order
        }
        
        // Output the reversed string
        System.out.println("Reversed string: " + reversed);
        
       
    }
}
