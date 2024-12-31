package Loop;

public class Printingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		for(int i=1;i<=10;i++) {
			int j=5;
			
			System.out.println( i+"*" +j+ "=" + i*j);
		}
		for(int a=1;a<=100;a++) {
			int sum=a*(a+1)/2;
			System.out.println(sum);
		}
		int sumn=0;
		for(int n=1;n<=100;n++) {
			sumn=sumn+n;
		}
		System.out.println(sumn);
	}

}
