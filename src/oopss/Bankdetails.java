package oopss;
class Bank{
	public void withdraw()
	{
		System.out.println("withdraw");
	}
	public void deposit()
	{
		System.out.println("deposit");
	}
}
class Sbibank extends Bank{
	public void Sbiinterest()
	{
		System.out.println("Sbiinterest");
	}
}
class Hdfc extends Bank{
	public void Hdfcinterest()
	{
		System.out.println("Hdfc Interest");
	}
}
public class Bankdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbibank sbi=new Sbibank();
		sbi.deposit();
		sbi.withdraw();
		sbi.Sbiinterest();
		
		Hdfc hd=new Hdfc();
		hd.deposit();
		hd.withdraw();
		hd.Hdfcinterest();

	}

}
