package Stringrelated;

public class questionsstringsreltd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jmeter";
		String s2=" performance testing tool";
		System.out.println(s1.concat(s2));
		
		
		//
		String s3="java language is platform independent";
		String s6="language";
		System.out.println(s3.contains("language"));
		
		if(s3.contains(s6)) {
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
		}
		//
		String s4="selenium webdriver is used for webapplication testing";
		String[] words=s4.split("");
		for (String h:words) {
			System.out.println(h);
			if(h.contains("webapplication")) {
				break;
			}
			
		}
		
		

	}

}
