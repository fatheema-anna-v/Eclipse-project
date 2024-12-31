package oopss;
interface Principal{
	void resign();
	void rejoin();
	}
class Student{
	int mrk;
	String name;
	void mark() {
		
	}
	void showdetails(String name,int mrk) {
		this.name=name;
		this.mrk=mrk;
		System.out.println("mark: " +mrk);
		System.out.println("name: " +name);
	}
}
class Teacher extends Student implements Principal{
	String dep;

	@Override
	public void resign() {
		// TODO Auto-generated method stub
		System.out.println("Resign");
	}

	@Override
	public void rejoin() {
		System.out.println("rejoin");
		
	}
	void department(String dep) {
		this.dep=dep;
		System.out.println("department: " +dep);
	}
}
public class Exm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.mark();
		obj.showdetails("Anna", 40);
		Teacher t=new Teacher();
		t.resign();
		t.rejoin();
		t.department("IT");

	}

}
