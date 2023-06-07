package chptr1.strategyPattern.quackBehaviour;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<<Silence>>");
	}
}
