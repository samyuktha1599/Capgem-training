package lab1;

import java.util.Scanner;

public class NaturalNumbers {
	
	public static int calculateSum(int n) {
		int i;
		int sum=0;
		for(i=0;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the the value of n:");
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		int sum=calculateSum(n);
		System.out.println("The sum of n natural nos is :"+sum);
	}

		

}
