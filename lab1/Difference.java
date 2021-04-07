package lab1;

import java.util.Scanner;

public class Difference {
	
	private static int calculateDifference(int n) {
		int j=0;
		int m=0;
		for(int i=1;i<=n;i++)
		{  j=j+i;
			m+=(i*i);
		}
		int k=j*j;
		int sum=m-k;
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the the value of n:");
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int dif=calculateDifference(n);
		 System.out.println("The difference is:"+dif);
	}

	

}
