package chptr1.strategyPattern;

import chptr1.strategyPattern.duck.Duck;
import chptr1.strategyPattern.duck.MallardDuck;
import chptr1.strategyPattern.duck.ModelDuck;
import chptr1.strategyPattern.flyBehaviour.FlyWithRocketPower;

public class MiniDuckSimulator {

	public static void main(String[] args) {
//		Duck mallard  = new MallardDuck();
//		mallard.display();
//		mallard.performFly();
//		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();
		model.setFlyBehaviour(new FlyWithRocketPower());
		model.performFly();
	}
}
