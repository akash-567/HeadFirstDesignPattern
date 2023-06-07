package chptr1.strategyPattern.duckm;

import chptr1.strategyPattern.flyBehaviour.FlyWithWings;
import chptr1.strategyPattern.quackBehaviour.Squeak;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("I am a Model Duck");
	}
}
