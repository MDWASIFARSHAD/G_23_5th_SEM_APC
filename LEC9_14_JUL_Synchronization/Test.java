package SYnchronization_14_07;

public class Test {
	static int count=0;
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println(count);
		
		
	}
	
	public static synchronized void counter()
	{
		count++;
	}
	
	

}
