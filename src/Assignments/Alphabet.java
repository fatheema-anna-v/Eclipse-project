package Assignments;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Ask the user for the character to check
        System.out.print("Enter the alphabet to check: ");
        char ch = scanner.next().charAt(0);
        
        // Check if the character is present in the string
        if (input.indexOf(ch) != -1) {
            System.out.println("The alphabet '" + ch + "' is present in the string.");
        } else {
            System.out.println("The alphabet '" + ch + "' is not present in the string.");
        }
        
        
    }
}
