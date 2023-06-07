package chptr1.strategyPattern.flyBehaviour;

public class FlyWithRocketPower implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I am flying with rocket Power");
	}

}
