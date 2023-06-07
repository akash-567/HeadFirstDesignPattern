package chptr1.strategyPattern.duck;

import chptr1.strategyPattern.flyBehaviour.FlyBehaviour;
import chptr1.strategyPattern.quackBehaviour.QuackBehaviour;

public abstract class Duck {
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
	 
}
