package lab4.task3;

import java.time.LocalDate;

public class CD extends MediaItem {
	
	private String artist;
	private String genre;
	
	public CD(int identificationNumber, String title, int numberOfCopies, int runTime, String artist, String genre) {
		super(identificationNumber, title, numberOfCopies, runTime);
		this.artist = artist;
		this.genre = genre;
	}

	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Artist: "+getArtist());
		System.out.println("Genre: "+getGenre());
	}
	
	
	
	
	

}
