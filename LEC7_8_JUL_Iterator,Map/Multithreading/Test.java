package Multithreading;

public class Test {
	
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("parent class");
		}
	}

}
