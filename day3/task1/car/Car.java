package day3.task1.car;

public class Car {
	private String colour;
	private String model;
	private String brandName;
	private String engine;
	private int MAX_SPEED=240;
	private String musicSystem;
	
	public Car(String colour, String model, String brandName, String engine, int mAX_SPEED, String musicSystem) {
		super();
		this.colour = colour;
		this.model = model;
		this.brandName = brandName;
		this.engine = engine;
		MAX_SPEED = mAX_SPEED;
		this.musicSystem = musicSystem;
	}
	public Car() {
		colour="Black";
		model="Top end";
		brandName="MG";
		//default constructor
		
	}
	
	
	public void startCar()
	{
		//business operation
	}
	
	@Override
	public String toString() {
		return "Car [colour=" + colour + ", model=" + model + ", brandName=" + brandName + ", engine=" + engine
				+ ", MAX_SPEED=" + MAX_SPEED + ", musicSystem=" + musicSystem + ", getColour()=" + getColour()
				+ ", getModel()=" + getModel() + ", getBrandName()=" + getBrandName() + ", getEngine()=" + getEngine()
				+ ", getMAX_SPEED()=" + getMAX_SPEED() + ", getMusicSystem()=" + getMusicSystem() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getMAX_SPEED() {
		return MAX_SPEED;
	}
	public void setMAX_SPEED(int mAX_SPEED) {
		MAX_SPEED = mAX_SPEED;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}
	
	
	

}
