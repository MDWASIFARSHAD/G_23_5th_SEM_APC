package File_Opertion_21_07;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) throws IOException{
		
		File f = new File("Wasif");
		f.mkdir();
		File f1 = new File(f,"Wasif.txt");
		f1.createNewFile();
		
		
		FileWriter f2 = new FileWriter(f1,true);
		f2.write("Hello , ");
		f2.write("My Name is Wasif");
		f2.flush();
		
		
		FileReader fr = new FileReader(f1);
		int i = fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i = fr.read();
			
		}
		
	}

}
