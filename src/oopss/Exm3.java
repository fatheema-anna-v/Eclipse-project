package oopss;
class Classroom{
	int rollno;
	String name;
	float mark;
	
	void store(int rollno,String name,float mark) {
	    this.rollno=rollno;
	    this.name=name;
	    this.mark=mark;
	    
	    
	}
	void display() {
		System.out.println("rollno: " +rollno);
		System.out.println("name: " +name);
		System.out.println("mark: " +mark);
	}
}
public class Exm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classroom obj=new Classroom();
		obj.store(1, "Anna", 40);
		obj.display();

	}

}
