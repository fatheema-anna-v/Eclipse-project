package oopss;
class Members{
	String name;
	int age;
	String address;
	int salary;
	
	public void printdetails(String name,String address,int age,int salary) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.salary=salary;
		System.out.println("details: ");
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);
		System.out.println("address: "+address);
	}
}
class Worker extends Members{
	String spclz;
	
		

	
	
}
class Manager extends Members{
	String deprtmnt;
	
		
		
	
}
public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker ob1=new Worker();
		
		
		ob1.printdetails("Anna", "hjshh", 22, 22000);
		ob1.spclz="qwe";
		System.out.println("specialization: "+ob1.spclz);
		Manager ob2=new Manager();
		ob2.deprtmnt="IT";
		System.out.println("department: "+ob2.deprtmnt);
		

	}

}
