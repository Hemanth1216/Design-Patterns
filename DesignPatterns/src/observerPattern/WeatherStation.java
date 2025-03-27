package observerPattern;

import java.util.ArrayList;

public class WeatherStation implements Observable {

	private ArrayList<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;
	
	public WeatherStation() {
		observers = new ArrayList<>();
	}
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer: observers) {
			observer.update();
		}
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public double getHumidity() {
		return humidity;
	}
	
	public double getPressure() {
		return pressure;
	}
	
	public void measurementsChanges(double temp, double hum, double pres) {
		temperature = temp;
		humidity = hum;
		pressure = pres;
		notifyObservers();
	}
}
