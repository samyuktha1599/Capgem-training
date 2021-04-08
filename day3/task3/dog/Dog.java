package day3.task3.dog;

public class Dog {
	private String name;
	private int age;
	private int weight;
	
	
	
	
	public Dog(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void doFeedAnimal()
	{
		System.out.println("Your dog is eating");
		this.weight+=10;
	}
	
	
	public void playGames()
	{
		if(getWeight()<2 )
		{
			System.out.println("Feed your dog because it's weight is: "+getWeight()+"Kg");
		}
		else if(getWeight()>30)
		{
			System.out.println("Your dog cannot play anymore as it's weight is: "+getWeight()+"Kg");
		}
		else
		{
			System.out.println("Your dog is playing games ");
			setWeight(getWeight()-1);
		}
		
		// dog cannot playGames if weight is less than 2Kg or more than 30Kg
		
		// whenever dog playGame weight will be decreased by 1kg
	}

	
	
	
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", weight=" + weight + "";
	}

	public void setName(String name)
	{
		this.name = name;
		
		// current calling object
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// --- business operation ---
		// non-functional requiremenets ----
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
		//System.out.println(this);
	}

	// Business method
	
}
