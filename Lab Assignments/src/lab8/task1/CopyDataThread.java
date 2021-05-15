package lab8.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {

	public CopyDataThread(File f1, File f2) throws IOException, InterruptedException {
		FileReader reader=new FileReader(f1);
		int x=reader.read();
		FileWriter writer=new FileWriter(f2);
		int i=0;
		while(x!=-1)
		{
			writer.write((char)x);
			i++;
			if(i%10==0)
			{
				System.out.println("10 characters are copied");
				sleep(1000);
			}
			x=reader.read();
			
		}
		writer.close();
	}


	
}
