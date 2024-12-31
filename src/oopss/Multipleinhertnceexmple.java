package oopss;
interface Basicanimal{
	void cat();
	void sleep();
}
class Monkey{
	void jump() {
		System.out.println("jump");
	}
	void bite() {
		System.out.println("bite");
	}
}
class Human extends Monkey implements Basicanimal{
	void speak() {
		System.out.println("speak");
	}

	@Override
	public void cat() {
		System.out.println("cat");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep");
		
	}
}
public class Multipleinhertnceexmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human ob=new Human();
		ob.bite();
		ob.cat();
		ob.jump();
		ob.sleep();
		ob.speak();
		
	}

}
