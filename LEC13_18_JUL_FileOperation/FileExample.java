package FIleoperation_18_07;

import java.io.File;
import java.io.IOException;

public class FileExample {
	
	public static void main(String[] args) throws IOException{
		
//		File f = new File("abc.txt");
//		System.out.println(f.exists());
//		f.createNewFile();
//		System.out.println(f.exists());
//		
//		File fi = new File("wasif.txt");
//		fi.createNewFile();
//		System.out.println(fi.exists());
//		
//		System.out.println(fi.getAbsolutePath());
//		
		
		File f1 = new File("Java");
		f1.mkdir();
		System.out.println(f1.exists());
		
		File f2 = new File(f1,"java.txt");
		f2.createNewFile();
		System.out.println(f2.exists());
		
		f2.delete();
		System.out.println(f2.exists());
		
		
		
		
		
	}
	

}
