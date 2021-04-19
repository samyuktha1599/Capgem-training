package lab1;

import java.util.Scanner;

public class IncreasingNumber {
	public static void main(String[] args) {
		System.out.println("Enter the the value of n:");
		Scanner sc=new Scanner(System.in);
		 int number=sc.nextInt();
		 boolean check=checkNumber (number);
		 if(check==true)
		 {
			 System.out.println("Number is an increasing number");
		 }
		 else
		 {
			 System.out.println("Number is not an increasing number");
		 }
			 
	}

	public static boolean checkNumber(int number) {
		int k=number;
		while(k!=0)
		{
			int n1=k%10;
			k=k/10;
			int n2=k%10;
			if(n1>n2)
			{
				continue;
			}
			else {
				return false;
				
				
			}
			
		}
		return true;
	}

}
