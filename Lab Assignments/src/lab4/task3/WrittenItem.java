package lab4.task3;

public class WrittenItem extends Item {
	
	private String author;

	public WrittenItem(int identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber, title, numberOfCopies);
		this.author = author;
	}

	
	
	
	public WrittenItem() {
		super();
		// TODO Auto-generated constructor stub
	}




	public WrittenItem(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	@Override
	public void print() {
		
		System.out.println("Identification Number: "+getIdentificationNumber());
		System.out.println("Title: "+getTitle());
		System.out.println("Number of copies: "+getNumberOfCopies());
		System.out.println("Author: "+getAuthor());

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
