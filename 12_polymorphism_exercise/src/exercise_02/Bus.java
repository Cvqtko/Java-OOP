package exercise_02;

public class Bus extends VehicleImpl {
	private static final double AIR_CONDITION_EXTRA_CONSUMPTION = 1.4;
	private double defaultConsumption;
	private boolean occupied;

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	protected Bus(double fuelQuantity, double consumption, double tankCapacity) {
		super(fuelQuantity, consumption, tankCapacity);
		occupied = false;
		defaultConsumption = consumption;
	}

	@Override
	public String drive(double distance) {
		if (this.occupied) {
			super.setConsumption(defaultConsumption + AIR_CONDITION_EXTRA_CONSUMPTION);
		} else {
			super.setConsumption(defaultConsumption);
		}
		this.setOccupied(false);

		return String.format("Bus %s", super.drive(distance));
	}

	@Override
	public String toString() {
		return String.format("Bus: %s", super.toString());
	};

}
