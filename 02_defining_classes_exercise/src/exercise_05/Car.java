package exercise_05;

public class Car {
	private String model;
	private double fuelAmount;
	private double fuelForOneKilometer;
	private int distanceTraveled;

	public Car(String model, double fuelAmount, double fuelForOneKilometer) {
		this.model = model;
		this.fuelAmount = fuelAmount;
		this.fuelForOneKilometer = fuelForOneKilometer;
	}

	public String getModel() {
		return model;
	}

	public double getFuelAmount() {
		return fuelAmount;
	}

	public void setFuelAmount(double fuelAmount) {
		this.fuelAmount = fuelAmount;
	}

	public double getFuelForOneKilometer() {
		return fuelForOneKilometer;
	}

	public void setFuelForOneKilometer(double fuelForOneKilometer) {
		this.fuelForOneKilometer = fuelForOneKilometer;
	}

	public int getDistanceTraveled() {
		return distanceTraveled;
	}

	public void setDistanceTraveled(int distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}

	public void drive(int distance) {
		if (distance * this.getFuelForOneKilometer() > this.getFuelAmount()) {
			System.out.println("Insufficient fuel for the drive");
		} else {
			this.setFuelAmount(this.getFuelAmount() - distance * this.getFuelForOneKilometer());
			this.setDistanceTraveled(this.getDistanceTraveled() + distance);
		}

	}

	@Override
	public String toString() {
		return String.format("%s %.2f %d", this.getModel(), this.getFuelAmount(), this.getDistanceTraveled());
	}

}