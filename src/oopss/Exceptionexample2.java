package oopss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionexample2 {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("E://Book.xlsx");
		
		System.out.println("started");
		Thread.sleep(5000);
		System.out.println("stopped");
	}

}
