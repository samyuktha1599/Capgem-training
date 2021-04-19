package lab3.task2;

import java.util.Scanner;

public class Number {
	
	public int modifyNumber(int number1)
	{
		String str=String.valueOf(number1);
	StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{if(i!=str.length()-1) {
			int temp=0;
			char a=str.charAt(i);
			char b=str.charAt(i+1);
			
			
			 if(a>b)
			{
				temp=a-b;
			}
			else
			{
				temp=b-a;
			}
			
			sb.append(temp);
			
		}
		else sb.append(str.charAt(i));
		}
		

		str=sb.toString();
		number1=Integer.parseInt(str);
		
		return number1;
		
	}
		
		

		
		public static void main(String[] args) {
			Number num=new Number();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int number1=Integer.parseInt(sc.nextLine());
			System.out.println("The modified number is: "+num.modifyNumber(number1));
			
			sc.close();
		}

}
