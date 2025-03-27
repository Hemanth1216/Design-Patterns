package observerPattern;

public class ForecastDisplay implements Observer, Display {

	private WeatherStation station;
	private double temperature;
	private double humidity;
	private double pressure;
	public ForecastDisplay(WeatherStation observable) {
		station = observable;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		temperature = station.getTemperature();
		humidity = station.getHumidity();
		pressure = station.getPressure();
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm forecast display");
		System.out.println("Temperature : " + temperature);
		System.out.println("Humidity : " + humidity);
		System.out.println("Pressure : " + pressure);
	}

}
