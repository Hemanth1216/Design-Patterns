package strategyPattern;

public class DriveStrategyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car();
		car.drive();
		Vehicle bike = new Bike();
		bike.drive();
		Vehicle bus = new Bus();
		bus.drive();
	}
}
