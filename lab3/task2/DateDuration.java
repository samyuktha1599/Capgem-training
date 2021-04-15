package lab3.task2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDuration {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date:");
		int date=Integer.parseInt(sc.nextLine());
		System.out.println("Enter month:");
		int month=Integer.parseInt(sc.nextLine());
		System.out.println("Enter year:");
		int year=Integer.parseInt(sc.nextLine());
		
		LocalDate givenDate=LocalDate.of(year, month,date );
		LocalDate currentDate=LocalDate.now();
		Period Difference=Period.between(givenDate, currentDate);
		System.out.println("Difference is "+Difference.getDays()+"Days "+Difference.getMonths()+"Months "+Difference.getYears()+"Years");
		sc.close();
		
	}

}
