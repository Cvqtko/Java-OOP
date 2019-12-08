package exercise_04;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private String name;
	private Dough dough;
	private List<Topping> toppings;

	public Pizza(String name, int numberOfToppings) {
		this.setName(name);
		this.setToppingCount(numberOfToppings);
	}

	private void setName(String name) {
		name = name.trim();
		if (name == null || name.length() < 1 || name.length() > 15) {
			throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
		}
		this.name = name;

	}

	private void setToppingCount(int numberOfToppings) {
		if (numberOfToppings < 0 || numberOfToppings > 10) {
			throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
		}
		this.toppings = new ArrayList<Topping>(numberOfToppings);
	}

	public void addTopping(Topping topping) {
		this.toppings.add(topping);
	}

	public void setDough(Dough dough) {
		this.dough = dough;

	}

	public double getOverallCalories() {
		return this.dough.calculateCalories() + 
				this.toppings.stream().mapToDouble(t -> t.calculateCalories()).sum();
	}

	@Override
	public String toString() {
		return String.format("%s - %.2f", this.name, this.getOverallCalories());
	}

}
