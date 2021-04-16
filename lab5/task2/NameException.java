package lab5.task2;

public class NameException extends Exception{
	private String message;

	public NameException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "An exception occured: "+message;
	}

	public NameException() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

}
