package oopss;


	 
class deer{
	
	public void barking() {
		System.out.println("dog is barking");
	}
}

class  Cat extends deer{
	public void sleeping() {
		
		System.out.println("cat is sleeping");
		}
}
	
	
public class Dog {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.barking();
		c.sleeping();

	}
 }


