package exercise_02;

public class Truck extends VehicleImpl {
	private static final double AIR_CONDITION_EXTRA_CONSUMPTION = 1.6;
	private static final double MAXIMUM_FUEL_CAPACITY = 0.95;

	protected Truck(double fuelQuantity, double consumption, double tankCapacity) {
		super(fuelQuantity, consumption + AIR_CONDITION_EXTRA_CONSUMPTION, tankCapacity);
	}

	@Override
	public String drive(double distance) {
		return String.format("Truck %s", super.drive(distance));
	}

	@Override
	public void refuel(double liters) {
		super.refuel(liters * MAXIMUM_FUEL_CAPACITY);
	};

	@Override
	public String toString() {
		return String.format("Truck: %s", super.toString());
	};

}
