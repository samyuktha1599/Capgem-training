package lab4.task3;

public class Video extends MediaItem {
	
	private String director;
	private String genre;
	private int releasedYear;
	
	public Video(int identificationNumber, String title, int numberOfCopies, int runTime, String director, String genre,
			int releasedYear) {
		super(identificationNumber, title, numberOfCopies, runTime);
		this.director = director;
		this.genre = genre;
		this.releasedYear = releasedYear;
	}

	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Director: "+getDirector());
		System.out.println("Genre: "+getGenre());
		System.out.println("Year of release: "+getReleasedYear());
	}
	
	

}
