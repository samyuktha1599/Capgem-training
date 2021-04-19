package lab1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[])  
	{    
	 int x1=0,x2=1,x3,i;
	 System.out.println("Enter the number:");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	// System.out.print(x1+" "+x2);
	    
	 for(i=3;i<=n;i++)  
	 {    
		 x3 =x1 + x2;
	  if(i==n)
	  {
		  
	  System.out.print(" The" +n+"th value of Fibonacci series is:"+ x3);}    
	  x1 = x2;    
	  x2 = x3;    
	  
	 }    
	  

}
}
