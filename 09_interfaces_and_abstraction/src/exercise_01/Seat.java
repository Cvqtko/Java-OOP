package exercise_01;

public class Seat implements Car {
	String model;
	String color;
	Integer horsePower;
	String countryProduced;

	public Seat(String model, String color, Integer horsePower, String countryProduced) {
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

	@Override
	public String toString() {
		return String.format(
				"%s is %s color and have %d horse power\r\n" + "This is %s produced in %s and have %d tires\r\n" + "",
				this.model, this.color, this.horsePower, this.model, this.countryProduced, Car.TIRES);
	}

}
