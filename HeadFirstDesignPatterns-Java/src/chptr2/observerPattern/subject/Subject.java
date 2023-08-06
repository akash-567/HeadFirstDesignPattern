package chptr2.observerPattern.subject;

import chptr2.observerPattern.observer.Observer;

public interface Subject {
 
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
