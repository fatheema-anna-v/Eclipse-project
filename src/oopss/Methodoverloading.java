package oopss;
class Parent{
	public void phone() {
		System.out.println("nokia");
	}
}
class Child extends Parent {
	public void phone() {
		super.phone();
		System.out.println("iphone");
	}
}
public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child o=new Child();
		o.phone();

	}

}
