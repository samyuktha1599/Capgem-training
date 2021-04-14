package lab4.task1;

public class CurrentAccount extends Account {
	
	double overDraftLimit;

	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		overDraftLimit=super.getBalance()-500;
	//	System.out.println("---------"+overDraftLimit);
		if(overDraftLimit<=500)
		{
			System.out.println("Over Draft Limit Reached");
		}
		else
		{
			super.withdraw(amount);
			System.out.println("Balance is: "+super.getBalance());
		}
		
	//	super.withdraw(amount);
	}
	
	
	

}
