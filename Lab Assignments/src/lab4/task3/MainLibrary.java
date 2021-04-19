package lab4.task3;

import java.util.Scanner;

public class MainLibrary {
	
	public static void main(String[] args) {
		 MainLibrary library=new MainLibrary();
		 Book book=new Book(101,"Harry Potter",8,"J.K.Rowling");
		 JournalPaper journal=new JournalPaper(125,"Robotics",2,"XYZ",2019);
		 Video video=new Video(1,"Latest hits",10,120,"Someone","Folk",2012);
		 CD cd=new CD(11,"90's Hits",5,240,"Unknown","melodies");
		 while(true)
		 {
			 System.out.println("1.Book Details");
			 System.out.println("2.Journal Paper Details");
			 System.out.println("3.Video Details");
			 System.out.println("4.CD Details");
			 Scanner sc=new Scanner(System.in);
			 int option=Integer.parseInt(sc.nextLine());
			 switch(option)
			 {
			 case 1:
				 System.out.println("---Printing details of books---");
				library.printWrittenItem(book);
				System.out.println();
				break;
			 case 2:
				 System.out.println("---Printing details of Journal Paper---");
				 library.printWrittenItem(journal);
				 System.out.println();
				 break;
			 case 3:
				 System.out.println("---Printing details of Video---");
				 library.printMediaItem(video);
				 System.out.println();
				 break;
			 case 4:
				 System.out.println("---Printing details of CD---");
				 library.printMediaItem(cd);
				 System.out.println();
				 break;
			 
			 }
			


		 }
		 
	}

	public void printWrittenItem(WrittenItem item) {
		
		
		item.print();
	
	}
	
	public void printMediaItem(MediaItem item)
	{
		item.print();
	
	}

}
