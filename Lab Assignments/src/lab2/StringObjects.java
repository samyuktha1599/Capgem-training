package lab2;

import java.util.Scanner;
import java.util.Arrays;

public class StringObjects {
	public static void main(String[] args) {
	
		String[] arr = {
	            "rtyesxf",
				
	            "abcxyz",
	            "cvtr",
	            "avachdf",
	        };      
		String b[]=sortStrings(arr);
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		
		
		
	}

	private static String[] sortStrings(String[] arr) {
		
		
		Arrays.sort(arr);
	

		for(int i=0;i<arr.length;i++)
		{
			String s1,s2;
			int n=arr[i].length()/2;
			s1=(arr[i].substring(0, n)).toUpperCase();
			s2= (arr[i].substring(n,arr[i].length() )).toLowerCase();
			arr[i]=s1+s2;
			
		}
		
		
		return arr;
	}

}
