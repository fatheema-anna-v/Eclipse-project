package Loop;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[6];
		System.out.println("enter no:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<6;i++) {
			System.out.print(" " +a[i]);
		}

	}

}
