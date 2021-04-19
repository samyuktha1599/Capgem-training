package lab3.task2;

import java.util.Scanner;

public class PositiveString {
	
	public boolean checkString(String str)
	{
		str=str.toLowerCase();
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)>str.charAt(i+1))
			{
				return false;
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		PositiveString p=new PositiveString();
		System.out.println("Enter the word");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean check=p.checkString(str);
		if(check==true) System.out.println("It is a Positive String");
		else System.out.println("It is not a Positive String");
		sc.close();
	}

}
