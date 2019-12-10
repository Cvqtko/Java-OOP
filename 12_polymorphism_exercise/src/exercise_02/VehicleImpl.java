package exercise_02;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle {

	private static final DecimalFormat formatter = new DecimalFormat("#.##");

	private double fuelQuantity;
	private double consumption;
	private double tankCapacity;

	protected VehicleImpl(double fuelQuantity, double consumption, double tankCapacity) {
		this.fuelQuantity = fuelQuantity;
		this.consumption = consumption;
		this.tankCapacity = tankCapacity;
	}

	protected void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public double getConsumption() {
		return consumption;
	}

	@Override
	public String drive(double distance) {
		if (canDrive(distance)) {
			this.fuelQuantity -= this.consumption * distance;
			return String.format("travelled %s km", formatter.format(distance));
		} else {
			return String.format("needs refueling");
		}
	}

	protected boolean canDrive(double distance) {
		return this.fuelQuantity >= this.consumption * distance;
	}

	@Override
	public void refuel(double liters) {
		validateFuel(liters);
		validateTank(liters);
		this.fuelQuantity += liters;
	}

	private void validateTank(double liters) {
		if (this.fuelQuantity + liters > this.tankCapacity) {
			throw new IllegalArgumentException("Cannot fit fuel in tank");
		}
	}

	private void validateFuel(double liters) {
		if (liters <= 0) {
			throw new IllegalArgumentException("Fuel must be a positive number");
		}
	}

	@Override
	public String toString() {
		return String.format("%.2f", this.fuelQuantity);
	};

}
