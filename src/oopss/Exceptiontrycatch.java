package oopss;

public class Exceptiontrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		System.out.println("stopped");

	}

}
