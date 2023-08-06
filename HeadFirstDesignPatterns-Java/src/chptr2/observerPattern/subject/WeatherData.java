package chptr2.observerPattern.subject;

import java.util.ArrayList;
import java.util.List;

import chptr2.observerPattern.observer.Observer;

public class WeatherData implements Subject{
	private List<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o:observers) {
			o.update();
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	

}
