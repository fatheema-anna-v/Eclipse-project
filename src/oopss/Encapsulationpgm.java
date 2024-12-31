package oopss;
class Encap{
	private String name;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
public class Encapsulationpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap e=new Encap();
		e.setName("Anu");
		System.out.println(e.getName());
		e.setDesignation("Designer");
		System.out.println(e.getDesignation());

	}

}
