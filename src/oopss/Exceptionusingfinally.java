package oopss;

public class Exceptionusingfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		try {
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("exception found");
		}
		finally {
			System.out.println("Finally");
		}

	}

}
