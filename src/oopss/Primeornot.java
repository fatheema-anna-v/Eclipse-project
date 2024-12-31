package oopss;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		p=sc.nextInt();
		if(p==0 || p==1) {
			System.out.println("not prime ");
		}
		else if(p>2) {
			if(p/p==1 || p/1==p) {
				System.out.println(" prime ");
			}else {
				System.out.println("not prime ");
			}
		}
		

	}

}
