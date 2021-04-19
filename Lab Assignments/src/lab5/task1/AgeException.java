package lab5.task1;

public class AgeException extends Exception {
	private String message;

	@Override
	public String toString() {
		return "Age Exception : "+message;
	}

	public AgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeException(String message) {
		super();
		this.message = message;
	}
	

}
