package Volatile_15_07;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		Interf i = (int a,int b)-> System.out.println(a+b);	
		i.m1(5,3);
		i.m1(10,5);
	}

}
