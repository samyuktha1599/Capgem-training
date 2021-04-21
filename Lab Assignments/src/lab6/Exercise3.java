package lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise3 {
	
public static HashMap<Integer, Integer> getSquares(int[] a) {
		
		HashMap <Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			
			if (map.containsKey(a[i]) == false){
				int n = a[i];
			    map.put(a[i], n*n);
			   
			}
		}
		return map;
	}

	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter size :");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(" Enter values:");
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(getSquares(a));
		}

	}


}
