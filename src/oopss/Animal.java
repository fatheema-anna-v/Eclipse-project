package oopss;

class Doga{
	public void barking()
	{
		System.out.println("dog is barking");
	}	
}

class Cata extends Doga{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
}
class Deera extends Cata{
	public void running()
	{
		System.out.println("deer is running");
	}
}
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deera d=new Deera();
		d.barking();
		d.sleeping();
		d.sleeping();

	}

}
