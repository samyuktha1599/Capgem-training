package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no of elements:");
			int n=sc.nextInt();
			System.out.println("Enter the array element:");
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int b[]=getSorted(arr,n);
			
			for(int k:b)
			{
				System.out.print(k+" ");
			}
			sc.close();
		
		}

		private static int[] getSorted(int[] arr,int n) {
			int reverse;
			for(int i=0;i<n;i++)
			{	reverse=0;
				int m=arr[i];
			//	System.out.println(m);
				
				while(m!=0) {
					int k=m%10;
				  reverse= reverse*10+k;
				  m=m/10;
				}
				
			arr[i]=reverse;
		}
			Arrays.sort(arr);
			
			return arr;
		}
		
}
