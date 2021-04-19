package lab5.task2;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
		System.out.println("Enter first name");
		Scanner sc=new Scanner(System.in);
		String firstName=sc.nextLine();
		System.out.println("Enter last name");
		String lastName=sc.nextLine();
		try {
			Person person=new Person(firstName,lastName);
		
		} catch (NameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
