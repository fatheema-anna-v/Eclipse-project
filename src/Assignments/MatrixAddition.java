package Assignments;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        // Define the size of the matrix (3x3)
        int rows = 3, cols = 3;
        
        // Create two 3x3 matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        
        // Read elements for the first matrix
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + (i+1) + "][" + (j+1) + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        // Read elements for the second matrix
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + (i+1) + "][" + (j+1) + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        // Add the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Output the resulting matrix
        System.out.println("\nSum of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
}
