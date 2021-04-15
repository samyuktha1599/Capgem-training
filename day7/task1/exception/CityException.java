package day7.task1.exception;

public class CityException extends Exception {
	
	private String msg;

	public CityException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return " City Exception: "+msg;
	}

	
	

}
