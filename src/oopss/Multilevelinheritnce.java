package oopss;
interface Bank1{
	void withdraw();
	void deposit();
}
interface Bank2{
	void interest();
	void balance();
}
class Icici implements Bank1,Bank2{

	@Override
	public void interest() {
		System.out.println("Interest rate ");
		
	}

	@Override
	public void balance() {
		System.out.println("balance ");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw ");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit");
		
	}
	
}
public class Multilevelinheritnce {

	public static void main(String[] args) {
		Icici ob=new Icici();
		ob.balance();
		ob.deposit();
		ob.interest();
		ob.withdraw();

	}

}
