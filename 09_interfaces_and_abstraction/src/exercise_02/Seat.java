package exercise_02;

import exercise_01.Car;

public class Seat extends CarImpl implements Sellable {

	public Double price;

	public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
		super(model, color, horsePower, countryProduced);
		this.price = price;
	}

	@Override
	public Double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return String.format("This is %s produced in %s and have %d tires\r\n" + "%s sells for %f\r\n" + "", this.model,
				this.countryProduced, Car.TIRES, this.model, this.price);
	}
}
