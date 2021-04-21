package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	
public  int getSecondSmallest(int[] a) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		
		Collections.sort(list);
		return list.get(1);
	}

	public static void main(String[] args) {
		Exercise5 obj=new Exercise5();
		
		System.out.println("Enter size of Array :");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println("Enter values: ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Second Smallest Integer is:"+obj.getSecondSmallest(arr));
		
		
		
	}


}
