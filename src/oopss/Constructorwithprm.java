package oopss;

public class Constructorwithprm {
	
	int id;
	int salary;
	String designation;
	
	
	public Constructorwithprm(int id,int salary,String designation) {
		this.id=id;
		this.salary=salary;
		this.designation=designation;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorwithprm ob=new Constructorwithprm(1,223456,"mngr");
		System.out.println(ob.id);
		System.out.println(ob.salary);
		System.out.println(ob.designation);

	}

}
