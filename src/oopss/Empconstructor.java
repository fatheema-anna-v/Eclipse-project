package oopss;

public class Empconstructor {
	
	int empid;
	int salary;
	String designation;
	
	public Empconstructor() {
		empid=100;
		salary=35000;
		designation="manager";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empconstructor ob=new Empconstructor();
		System.out.println(ob.empid);
		System.out.println(ob.salary);
		System.out.println(ob.designation);

	}

}
