package lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise2 {
	
public static HashMap countChars(char[] a) {
		
		HashMap< Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			
			if (map.containsKey(a[i])){
				int count = map.get(a[i]);
			   
				map.put(a[i], ++count);
			
			} else {
		        map.put(a[i],1);
		    }
		}
		return map;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter Chracter:");
		Scanner sc = new Scanner(System.in);	
		String s = sc.next();
		System.out.println(countChars(s.toCharArray()));
		

	}

}
