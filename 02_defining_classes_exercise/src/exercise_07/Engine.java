package exercise_07;

public class Engine {

	private static final int DEFAULT_DISPLACEMENT = 0;
	private static final String DEFAULT_EFFICIENCY = "n/a";

	private String model;
	private int power;
	private int displacement;
	private String efficiency;

	public Engine(String model, int power) {
		this(model, power, DEFAULT_DISPLACEMENT, DEFAULT_EFFICIENCY);
	}

	public Engine(String model, int power, int displacement) {
		this(model, power, displacement, DEFAULT_EFFICIENCY);
	}

	public Engine(String model, int power, String efficiency) {
		this(model, power, DEFAULT_DISPLACEMENT, efficiency);
	}

	public Engine(String model, int power, int displacement, String efficiency) {
		this.model = model;
		this.power = power;
		this.displacement = displacement;
		this.efficiency = efficiency;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(this.model).append(":").append(System.lineSeparator());
		result.append("Power: ").append(this.power).append(System.lineSeparator());
		result.append("Displacement: ").append(this.displacement == 0 ? "n/a" : this.displacement)
				.append(System.lineSeparator());
		result.append("Efficiency: ").append(this.efficiency).append(System.lineSeparator());

		return result.toString();
	}
}
