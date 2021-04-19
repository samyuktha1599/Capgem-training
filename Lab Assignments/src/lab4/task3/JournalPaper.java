package lab4.task3;

public class JournalPaper extends WrittenItem {

	private int publishedYear;

	public JournalPaper(int identificationNumber, String title, int numberOfCopies, String author, int publishedYear) {
		super(identificationNumber, title, numberOfCopies, author);
		this.publishedYear = publishedYear;
	}

	public JournalPaper() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Year published: "+getPublishedYear());
	}
	
	
	

}
