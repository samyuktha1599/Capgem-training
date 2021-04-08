package day3.task2.bank;

import java.util.Scanner;

public class BankAccount {
	private String accountHolderName;
	private int balance;
	private boolean status; // true for active / false for inactive
	
	//constructor
	public BankAccount(String accountHolderName, int balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	Scanner sc=new Scanner(System.in);

	
	// business methods
	public int doWithdrawal()
	{
		if(getBalance()<10000)
		{
			System.out.println("low balance so cannot withdraw");
			setStatus(false);
			
		}
		else
		{
			System.out.println("Enter the amount to withdraw: ");
			int amount=sc.nextInt();
			int x=getBalance()-amount;
			int y=getBalance()-10000;
			if(x>=10000) {
			balance-=amount;
			setStatus(true);
			}
			else
			{
				System.out.println("You can only withdraw upto: "+y);
			}
		//	System.out.println(isStatus());
		}
		
		return balance; // new balance
		
	}
	
	//deposit
	public int doDeposit()
	{
		System.out.println("Enter the amount to deposit");
		int amount=sc.nextInt();
		balance+=amount;
		System.out.println("Your balance is: "+getBalance());
		if(balance>=10000) setStatus(true);
		else 
			{
			
			setStatus(false);
			}
		
		return balance;
	}


	

	@Override
	public String toString() {
		return "accountHolderName=" + accountHolderName + ", balance=" + balance + "";
	}

	//status
	public void getStatus() {
		if(isStatus()==true || getBalance()>=10000)
		{
			System.out.println("Your account is active");
		}
		else System.out.println("Your account is inactive");
		
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	

	

	
}
