package ControlStatements;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		int m=23;
		int sum;
		char op=3;
		switch(op) {
		case 1:
			 sum=m+n;
			
			System.out.println(sum);
			break;
		case 2:
			sum=m-n;
			
			System.out.println(sum);
			break;
		case 3:
			sum=m*n;
			
			System.out.println(sum);
			break;
			default:
				System.out.println("invalid");
				break;
			
		}

	}

}
