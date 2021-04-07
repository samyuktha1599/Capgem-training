package lab1;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=n;
		int sum=0;
		while(k!=0)
		{
			int m=k%10;
			sum+=(m*m*m);
			k=k/10;
		}
		System.out.println(sum);
		
	
}
}
