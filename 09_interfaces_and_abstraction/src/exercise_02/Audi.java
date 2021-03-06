package exercise_02;

import exercise_01.Car;

public class Audi extends CarImpl implements Rentable {

	Integer minRentDay;
	Double pricePerDay;

	public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay,
			Double pricePerDay) {
		super(model, color, horsePower, countryProduced);
		this.minRentDay = minRentDay;
		this.pricePerDay = pricePerDay;
	}

	@Override
	public Integer getMinRentDay() {
		return this.minRentDay;
	}

	@Override
	public Double getPricePerDay() {
		return this.pricePerDay;
	}

	@Override
	public String toString() {
		return String.format(
				"This is %s produced in %s and have %d tires\r\n"
						+ "Minimum rental period of %d days. Price per day %f\r\n" + "",
				this.model, this.countryProduced, Car.TIRES, this.minRentDay, this.pricePerDay);
	}
}
