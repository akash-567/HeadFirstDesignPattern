package chptr2.observerPattern.observer;

import chptr2.observerPattern.displayElement.DisplayElement;
import chptr2.observerPattern.subject.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public String toString() {
		return "CurrentConditionDisplay [temperature=" + temperature + ", humidity=" + humidity + "]";
	}

	@Override
	public void display() {
		System.out.println(this.toString());;
	}

	@Override
	public void update() {
		this.temperature = weatherData.getTemp();
		this.humidity =  weatherData.getHumidity();
		display();
 	}
	
	
	
	
}
