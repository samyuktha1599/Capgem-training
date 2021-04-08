package day3.task3.dog;

import java.util.Scanner;

public class DogGameApp {
	public static void main(String[] args) {
		Dog d=new Dog("Boomer", 5, 1);
		Scanner sc=new Scanner(System.in);
		int n;
		do
		{
			System.out.println("------Enter your choice-----");
			System.out.println("1:-To feed your dog");
			System.out.println("2:-To play games");
			System.out.println("3:-To get details of your dog");
			int choice=sc.nextInt();
			switch (choice)
			{
			case 1:
				d.doFeedAnimal();
				break;
				
			case 2:
				d.playGames();
				break;
			case 3:
				System.out.println(d);
				break;

			case 0:
				System.exit(0);
			}
			System.out.println("Enter 4 to continue playing:");
			n=sc.nextInt();
		}while(n==4);
		sc.close();
	}

	

	
	}


