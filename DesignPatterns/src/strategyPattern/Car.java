package strategyPattern;

public class Car extends Vehicle {

	public Car() {
		super(new SteeringDrive());
	}
}
