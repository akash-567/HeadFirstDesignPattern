package chptr2.observerPattern;

import chptr2.observerPattern.observer.CurrentConditionDisplay;
import chptr2.observerPattern.subject.WeatherData;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setTemp(80f);
		weatherData.setPressure(30.4f);
		weatherData.setHumidity(65);
		weatherData.measurementsChanged();
		
	}
}
