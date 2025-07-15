package Volatile_15_07;

public class Test {
	
	public static void main(String[] args) {
		
		
		Thread1 t  = new Thread1();
		t.start();
		
		
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		t.stoping();
	}

}
