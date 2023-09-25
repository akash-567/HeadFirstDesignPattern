package chptr3.decoratorPattern;

public class SteamedMilk extends CondimentDecorator {

	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 0.10;
	}
}
