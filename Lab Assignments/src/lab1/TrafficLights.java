package lab1;

import java.util.Scanner;

public class TrafficLights {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Red light--->1");
		System.out.println("Yellow---->2");
		System.out.println("Green----->3");
		
		int x=sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		default:System.out.println("Invalid");
		}
	}

}
