package strategyPattern;

public class Vehicle {

	DriveStrategy driveStrategy;
	
	public Vehicle(DriveStrategy _driveStrategy) {
		driveStrategy = _driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}
}
