package lab3.task2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerSum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the line of integers");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str, " ");
		while(st.hasMoreTokens())
		{
			String temp=st.nextToken();
			int n=Integer.parseInt(temp);
			sum+=n;
		}
		System.out.println(sum);
	}

}
