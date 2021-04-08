package day3.task2.bank;


import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		BankAccount acc=new BankAccount("Sujay",5000);
		Scanner sc=new Scanner(System.in);
		int n;
		do
		{
			System.out.println("----Enter your choice---");
			System.out.println("1:-To Check balance");
			System.out.println("2:-To withdraw");
			System.out.println("3:-To deposit");
			System.out.println("4:-To get account details");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Your balance is: "+acc.getBalance());
				acc.getStatus();
				break;
			case 2: 
				acc.doWithdrawal();
				System.out.println("Your balance is: "+acc.getBalance());
				acc.getStatus();
				break;
			case 3:
				acc.doDeposit();
				acc.getStatus();
				break;
			case 4:
				System.out.println(acc);
				break;
			case 0: 
				System.exit(0);
			}
			System.out.println("To continue enter 5");
			 n=sc.nextInt();
			
		}while(n==5);
		
		sc.close();
	}

}
