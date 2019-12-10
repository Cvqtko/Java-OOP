package exercise_02;

import exercise_01.Car;

public class CarImpl implements Car {
	String model;
	String color;
	Integer horsePower;
	String countryProduced;

	public CarImpl(String model, String color, Integer horsePower, String countryProduced) {
		this.model = model;
		this.color = color;
		this.horsePower = horsePower;
		this.countryProduced = countryProduced;
	}

	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public Integer getHorsePower() {
		return this.horsePower;
	}

	@Override
	public String countryProduced() {
		return this.countryProduced;
	}

}
