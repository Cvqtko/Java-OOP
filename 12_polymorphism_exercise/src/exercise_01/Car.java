package exercise_01;

public class Car extends VehicleImpl {

	private static final double AIR_CONDITION_EXTRA_CONSUMPTION = 0.9;

	protected Car(double fuelQuantity, double consumption) {
		super(fuelQuantity, consumption + AIR_CONDITION_EXTRA_CONSUMPTION);
	}

	@Override
	public String drive(double distance) {
		return String.format("Car %s", super.drive(distance));
	}
	
	@Override
	public String toString() {
		return String.format("Car: %s", super.toString());
	};

}
