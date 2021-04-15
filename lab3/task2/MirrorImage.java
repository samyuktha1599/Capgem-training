package lab3.task2;


import java.util.Scanner;

public class MirrorImage {
	
	public StringBuffer getImage(String str)
	{
		StringBuffer sb=new StringBuffer();
		sb.append(str);
	//	str=sb;
		//hiSystem.out.println(sb.reverse());
		return sb.reverse();
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		MirrorImage image=new MirrorImage();
		
		System.out.println("Enter the word");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer str2=image.getImage(str);
		System.out.println(str+"|"+str2);
		sc.close();
	}

}
