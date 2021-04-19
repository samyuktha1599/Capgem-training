package lab4.task1;

public class Account {
	
	 private long accNum;
	private  double balance;
	private Person accHolder;
	
	 public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	//------------methods----------
	public void deposit(double amount)
	{
		setBalance(getBalance()+amount);
		System.out.println("Deposited Rs."+amount+" to acc Number "+getAccNum());
	}
	
	public void withdraw(double amount)
	{ //System.out.println("Balance is "+getBalance());
		
		setBalance(getBalance()-amount);
		System.out.println("Withdrew Rs."+amount+" from acc Number "+getAccNum());
	}
	
	public double getBalanceMethod()
	{
		return getBalance();
		
	}

}
