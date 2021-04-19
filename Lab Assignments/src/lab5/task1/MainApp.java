package lab5.task1;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
		System.out.println("Enter Age");
		Scanner sc=new Scanner(System.in);
		int age=Integer.parseInt(sc.nextLine());
	//	AgeValidate validate=new AgeValidate();
		try {
			Person person=new Person(age);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
