package oopss;

class Flower{
	public void petals(){
		System.out.println("all petals are beautiful");
		}
	}
class Rose extends Flower{
	public void beauty()
	{
		System.out.println("Roses are beautiful");
	}
}
class Jasmine extends Flower{
	public void smell()
	
	{
		System.out.println("Jasmine has an amazing smell");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//not multilevel it is hierarchical
		Rose r=new Rose();
		r.petals();
		r.beauty();
		Jasmine j=new Jasmine();
		j.petals();
		j.smell();

	}

}
