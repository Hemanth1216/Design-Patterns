package strategyPattern;


public class Bike extends Vehicle {

	public Bike() {
		super(new RageDrive());
	}
}
