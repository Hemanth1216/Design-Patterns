package strategyPattern;

public class Bus extends Vehicle {
	
	public Bus() {
		super(new SteeringDrive());
	}
}
