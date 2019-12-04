package exercise_04;

public class Vehicle {
	private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;

	private double fuelConsumption;

	private double fuel;

	int horsePower;

	public Vehicle(double fuel, int horsePower) {
		this.fuel = fuel;
		this.horsePower = horsePower;
		this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public void drive(double kilometers) {
		double neededFuel = this.fuelConsumption * kilometers / 100;
		if (hasEnoughFuel(neededFuel)) {
			this.fuel -= neededFuel;
		}
	}

	private boolean hasEnoughFuel(double neededFuel) {
		return this.fuel >= neededFuel;
	}

}
