package exercise_03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
	private String name;
	private double money;
	private List<Product> products;

	public Person(String name, double money) {
		this.setName(name);
		this.setMoney(money);
		products = new ArrayList<Product>();
	}

	private void setName(String name) {
		Validator.validateNonEmptyString(name);
		this.name = name;
	}

	private void setMoney(double money) {
		Validator.validateMoneyAmount(money);
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void buyProduct(Product product) {
		double cost = product.getCost();
		if (this.money >= cost) {
			this.money -= cost;
			this.products.add(product);
			System.out.printf("%s bought %s\n", this.name, product.getName());
		} else {
			throw new IllegalStateException(String.format("%s can't afford %s", this.name, product.getName()));
		}
	}

	@Override
	public String toString() {
		String output = "Nothing bought";
		if (!this.products.isEmpty()) {
			output = this.products.stream().map(p -> p.getName()).collect(Collectors.joining(", "));
		}

		return this.getName() + " - " + output;
	}

}
