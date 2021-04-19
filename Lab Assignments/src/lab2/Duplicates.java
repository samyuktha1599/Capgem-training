package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int b[]=modifyArray(arr,n); 
		for(int i=0;i<b.length-1;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

	private static int[] modifyArray(int[] arr, int n) {
		int count=0;
		int b[]=new int[n];
		int x=0;
		for(int i=0;i<n;i++)
		{
			int counter=0;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{ x++;
					counter=1;
					break;
				}
			}
			if(counter==0)
			{
				b[count]=arr[i];
			}
			count++;
		}
		
		for(int i=0;i<count-x;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(b[i]>b[j])
				{
					int temp=b[j];
					b[j]=b[i];
					b[i]=temp;
				}
			}
		}
		
		return b;
	}

}
