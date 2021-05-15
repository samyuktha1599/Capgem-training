package lab8.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		File f1 = new File("D:\\Capgem training\\Java\\File Handling\\source.txt");
		
		File f2 = new File("D:\\Capgem training\\Java\\File Handling\\target.txt");
		
		 CopyDataThread obj = new CopyDataThread(f1,f2);
		 
	}

}

