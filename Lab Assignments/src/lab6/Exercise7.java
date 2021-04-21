package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = Integer.parseInt(sc.nextLine());
		int arr[] = new int[num];
		System.out.println("Enter the array");
		for(int i = 0;i < num;i++) {
			arr[i] = sc.nextInt();
		}
        List<Integer> list = new Exercise7().getSorted(arr);
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
        	Integer i = itr.next();
        	System.out.print(i+" ");
        }
	}
    public List<Integer> getSorted(int arr[]) {
    	List<Integer> list = new ArrayList<>();
       for(int i = 0;i < arr.length;i++) {
    	   StringBuffer sb = new StringBuffer();
    	   sb.append(arr[i]);
    	   sb.reverse();
    	    String s = sb.toString();
    	     list.add(Integer.parseInt(s));
       }
       Collections.sort(list);
       return list;
    }

}
