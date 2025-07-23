package HigherOrderFunction_23_07;

import java.util.ArrayList;
import java.util.function.Function;

public class HOFExampl1 {
	
	public static void main(String[] args) {
		
		
//		HOFExampl1 h1 = new HOFExampl1();
//	
//		Interf d = ()->  System.out.println("I am Calling");
//		h1.printName(d);
		
	
		Function<Integer, Integer> d = (n)-> n*n;
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(12);
//		System.out.println(d.apply(6));
		
		HOFExampl1 h1 = new HOFExampl1();
		System.out.println(h1.square(d, a));
		
		
		}
	
//	public void printName(Interf d)
//	
//	{
//		d.Doing();
//		System.out.println("Hello Class");
//	}
	
	public ArrayList<Integer> square(Function<Integer, Integer> d , ArrayList<Integer> a)
	{
		ArrayList<Integer> u = new ArrayList<>(); 
		
		for(Integer i : a)
		{
			u.add(d.apply(i));
		}
		return u;
		
	}

}
