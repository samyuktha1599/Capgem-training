package lab9.streams.exercises;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Exercise3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String userName = sc.next();
		System.out.println("Enter password");
		String passwprd= sc.next();

		BiFunction<String,String,Boolean>validate= (str1,str2) -> {
			if (str1.equals("Samyuktha") && str2.equals("sam@123"))
				return true;
			return false;
		};
		if (validate.apply(userName,passwprd))
			System.out.println("Valid credentials");
		else
			System.out.println("Invalid credentials");
	}

}
