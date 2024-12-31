package array;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		int n,m;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.print("operator:");
		op=sc.nextInt();
		System.out.print("enter first number:");
		n=sc.nextInt();
		System.out.print("enter second number:");
		m=sc.nextInt();
		switch(op) {
		case 1:
			result=m+n;
			System.out.println("answer: "+ m +" + " + n +" = " + result);
			break;
		case 2:
			result=m-n;
			System.out.println("answer: "+ m +"-" + n +" = " + result);
			break;
		case 3:
			result=m*n;
			System.out.println("answer: "+ m +" * " + n +" = " + result);
			break;
		case 4:
			result=m/n;
			System.out.println("answer: "+ m +" / " + n +" = " + result);
			break;
		default:
			System.out.println("invalid choice");
			break;
			
		}

	}

}
