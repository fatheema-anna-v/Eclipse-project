package Assignments;
import java.util.Scanner;

public class Factpgm {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Initialize factorial to 1 (since factorial of 0 is 1)
        int factorial = 1;
        
        // Calculate the factorial using a loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Multiply factorial by i at each step
        }
        
        // Print the result
        System.out.println("Factorial of " + num + " is " + factorial);
        
       
    }
}

