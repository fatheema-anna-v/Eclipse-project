package oopss;

public class areaofcircle {
	
	public double area(int r) {
		double pi=3.14;
		double ar=pi*r*r;
		return ar;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaofcircle ob=new areaofcircle();
		System.out.println(ob.area(6));

	}

}
