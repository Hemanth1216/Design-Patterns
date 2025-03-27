package observerPattern;

public class WeatherObserserPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherStation station = new WeatherStation();
		Observer currentConditionsDisplay = new CurrentCondtionsDisplay(station);
		Observer statisticsDisplay = new StatisticsDisplay(station);
		station.registerObserver(currentConditionsDisplay);
		station.registerObserver(statisticsDisplay);
		
		station.measurementsChanges(97.34, 12.874, 9.6218);
		System.out.println("-----------------------------------");
		
		Observer forecastDisplay = new ForecastDisplay(station);
		station.registerObserver(forecastDisplay);
		
		station.measurementsChanges(97.35, 12.874, 9.6218);
		System.out.println("-----------------------------------");
		
		station.removeObserver(currentConditionsDisplay);
		
		station.measurementsChanges(97.35, 11.874, 9.6218);
		System.out.println("-----------------------------------");
//		Observer forecastDisplay = new ForecastDisplay(station);
//		station.registerObserver(forecastDisplay);
//		Observer statisticsDisplay = new StatisticsDisplay(station);
//		station.registerObserver(statisticsDisplay);
//		station.removeObserver(currentConditionsDisplay);
	}

}
