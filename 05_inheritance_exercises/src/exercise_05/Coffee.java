package exercise_05;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {

	private static final double COFFEE_MILLILITERS = 50;
	private static final BigDecimal COFFEE_PRICE = new BigDecimal(3.50);

	private double coffeine;

	public Coffee(String name, double coffeine) {
		super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
		this.coffeine = coffeine;
	}

	public double getCoffeine() {
		return coffeine;
	}

}
