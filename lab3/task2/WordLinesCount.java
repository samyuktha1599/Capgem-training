package lab3.task2;

import java.util.Scanner;

public class WordLinesCount {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text");
		String text=sc.nextLine();
		int line=1;
		int words=0,character=0;
		for(int i=0;i<text.length();i++)
		{
			char ch=text.charAt(i);
			if(ch=='\n' || ch=='.')
			{
				line++;
			}
			else if(ch==' ')
			{
				words++;
			}
			else
			{
				character++;
			}
		}
		System.out.println("Word count: "+words);
		System.out.println("Lines count: "+line);
		System.out.println("Character count: "+character);
	}

}
