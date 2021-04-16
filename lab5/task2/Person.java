package lab5.task2;

public class Person {
	
	private String firstName;
	private String lastName;
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Person(String firstName, String lastName) throws NameException {
		
		if(firstName.isEmpty()||lastName.isEmpty()) {
			
			
			throw new NameException("Please Enter your name");
		}
		else {	
	
			this.firstName = firstName;
		this.lastName = lastName;
		}
	}



	

}
