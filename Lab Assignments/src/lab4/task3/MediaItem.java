package lab4.task3;

public class MediaItem extends Item {
	
	private int runTime;
	
	

	public MediaItem(int identificationNumber, String title, int numberOfCopies, int runTime) {
		super(identificationNumber, title, numberOfCopies);
		this.runTime = runTime;
	}
	
	

	public MediaItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public int getRunTime() {
		return runTime;
	}



	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}



	@Override
	public void print() {
		System.out.println("Identification Number: "+getIdentificationNumber());
		System.out.println("Title: "+getTitle());
		System.out.println("Number of copies: "+getNumberOfCopies());
		System.out.println("Run Time: "+getRunTime()+" minutes");

	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub

	}

}
