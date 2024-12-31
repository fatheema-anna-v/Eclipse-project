package Loop;

import java.util.Scanner;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers: ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("numbers are: ");
		for(int s:arr) {
			System.out.print(" " + s);
		}
	}

}
