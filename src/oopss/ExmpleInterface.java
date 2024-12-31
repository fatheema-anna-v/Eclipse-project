package oopss;
interface Whatsappcalls{
	void calls();
	void mute();
	void disconnect();
}

 class Audiocalls implements Whatsappcalls{
	 public void calls() {
			// TODO Auto-generated method stub
			System.out.println("Audiocalls");
		}
	public void mute() {
		System.out.println("Audiocalls are muted.");
	}
	public void disconnect() {
		System.out.println("Audiocalls are disconnected..");
	}
	
	
}
 class Videocalls implements Whatsappcalls{
	 public void calls() {
			// TODO Auto-generated method stub
			System.out.println("videocalls");
		}
	public void mute() {
		System.out.println("videocalls are muted.");
	}
	public void disconnect() {
		System.out.println("videocalls are disconnected..");
	} 
 }
public class ExmpleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audiocalls a=new Audiocalls();
		a.calls();
		a.mute();
		a.disconnect();
		Videocalls v=new Videocalls();
		v.calls();
		v.mute();
		v.disconnect();
		Whatsappcalls ob=new Audiocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();
		ob=new Videocalls();
		ob.calls();
		ob.mute();
		ob.disconnect();

	}

}
