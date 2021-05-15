package lab9.streams.exercises;

import java.util.Scanner;
import java.util.function.Function;

public class Exercise2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		Function<String, String> mystring = (str1) -> {
			return str1.replace("", " ").trim();
		};
		System.out.println("Output: " + mystring.apply(str));
	}

}
