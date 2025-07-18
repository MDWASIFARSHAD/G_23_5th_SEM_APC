package FIleoperation_18_07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) throws IOException{
		
		File f = new File("abc.txt");
		System.out.println(f.exists());
		
		FileWriter fw = new FileWriter("abc.txt",true);
		fw.write("JAVA Programming \n");
		fw.write("Hello WOrld\n");
		
		fw.write(1000000000);
		
		char[] ch = {'a','b','c'};
		fw.write(ch);
		
		fw.write("Liza ");
		fw.flush();
	}

}
