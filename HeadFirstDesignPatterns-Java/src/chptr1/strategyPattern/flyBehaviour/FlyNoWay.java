package chptr1.strategyPattern.flyBehaviour;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}
