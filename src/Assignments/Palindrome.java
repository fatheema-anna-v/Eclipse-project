package Assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Reverse the input string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        
        // Compare the original string with the reversed string
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
}


}
