package exercise_03;

public class Validator {

	private Validator() {

	}

	public static void validateMoneyAmount(double money) {
		if (money < 0) {
			throw new IllegalArgumentException("Money cannot be negative");
		}
	}

	public static void validateNonEmptyString(String str) {
		if (str == null || str.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
	}
}
