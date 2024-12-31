package Assignments;

import java.util.Scanner;

public class Armstrongpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int num=sc.nextInt();
		
		int sum=0;
		int ognmbr=num;
		int noofdigits=String.valueOf(num).length();
		while(num>0) {
			int digit=num %10;
			sum+=Math.pow(digit, noofdigits);
			num /=10;
		}
		if(sum==ognmbr) {
			System.out.println(ognmbr + " is an Armstrong number ");
		}
		else {
			System.out.println(ognmbr + " is not an Armstrong number");
		}
	}

}
