package oopss;


abstract class Google{
	abstract void message();
	public void search() {
		System.out.println("search");
	}
}
class Childclass1 extends Google{
	void message() {
		System.out.println("search1");
	}
	
}
class Childclass2 extends Google{
	void message() {
		System.out.println("search2");
	}
	
}
public class Exampleabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass1 ob1=new Childclass1();
		Childclass2 ob2=new Childclass2();
		ob1.message();
		ob2.message();
		ob2.search();

	}

}
