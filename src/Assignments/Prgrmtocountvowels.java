package Assignments;

public class Prgrmtocountvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Education";
		char c[]=s.toCharArray();
		int vow=0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				vow++;
			}
		}
		System.out.println("vowels: " +vow);		
	
	}

}
