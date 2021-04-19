package lab1;

import java.util.Scanner;

public class PowerOf2 {
	
	
	private static boolean checkNumber(int n) {
		
		
			while(n%2==0)
			{
				n/=2;
			}
			if(n==1)
			{
				return true;
			}
		
		return false;
	}

	
	
	public static void main(String[] args) {
		System.out.println("Enter the the value of n:");
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 boolean check=checkNumber(n);
		 
		if(check==true)
		{
			System.out.println("The number is a power of 2");
		}
		else
		{
			System.out.println("The number is not a power of 2");
		}
	}

	
	

}
