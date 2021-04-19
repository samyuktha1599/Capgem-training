package lab5.task1;

public class Person {
	
	 private int age;
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(int age) throws AgeException {
		//this.age = age;
		if(age>15)
		{
			this.age=age;
			//System.out.println("Age valid");
		}
		else
		{
			throw new AgeException("Age invalid as it is less than 15years");
		}

		
	}

/*
	public void checkAge(int age) throws AgeException
	{
		if(age>15)
		{
			System.out.println("Age valid");
		}
		else
		{
			throw new AgeException("Age invalid as it is less than 15years");
		}
	}*/

}
