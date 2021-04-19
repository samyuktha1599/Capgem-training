package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Samllest2nd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array lenght:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values into array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		int m=getSecondSmallest(arr,n);
		System.out.println("The 2nd smallest element is :"+ m);
		
	}

	private static int getSecondSmallest(int[] arr, int n) {
		Arrays.sort(arr);
		//int k=arr[0];
		
	  
		return arr[1];
	}

}
