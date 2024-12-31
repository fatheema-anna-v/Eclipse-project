package Stringrelated;

public class Stringprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//length of string
		String s="Hello";
		System.out.println(s);
		System.out.println("length of string: "+ s.length());
		int v=s.length();
		System.out.println("length:" +v);
		//
		String s1="Hi ";
		String s2=" Anna";
		System.out.println(s1.concat(s2));
		//
		System.out.println(s1+s2);
		System.out.println(s1+2+s2);
		System.out.println(1+2+s1+s2);
		//
		String s3="Welcome";
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.startsWith("W"));
		System.out.println(s3.endsWith("W"));
		//
		String q="abc";
		String w="Abc";
		System.out.println(q.equals(w));
		System.out.println(q.equalsIgnoreCase(w));
		
		//
		String d="  Flower";
		System.out.println(d);
		System.out.println(d.trim());
		//
		String e="qwertyuiop";
		System.out.println(e.substring(3));
		System.out.println(e.substring(0,4));
		System.out.println(e.substring(3,4));
		System.out.println(e.substring(0));
		//
		String a="Welcome to Luminar";
		System.out.println(a.contains("to"));
		System.out.println(a.contains("To"));
		System.out.println(a.replace("to","ho"));
		System.out.println(a.charAt(3));
		String words[]=a.split(" ");
		for(String y:words) {
			System.out.println(y);
		}
		
		String f="Hello";
		char li[]=f.toCharArray();
		for(char c:li) {
			System.out.println(c);
		}
	}

}
