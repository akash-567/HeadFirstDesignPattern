package chptr1.strategyPattern.duckm;

import chptr1.strategyPattern.flyBehaviour.FlyWithWings;
import chptr1.strategyPattern.quackBehaviour.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour  = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a Mallard Duck!");
	}

}
