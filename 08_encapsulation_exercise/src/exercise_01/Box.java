package exercise_01;

public class Box {
	private double length;
	private double width;
	private double height;

	public Box(double length, double width, double height) {
		this.setLength(length);
		this.setWidth(width);
		this.setHeight(height);
	}

	private void setLength(double length) {
		validateNonNegativeSize(length, "Length");
		this.length = length;
	}

	private void setWidth(double width) {
		validateNonNegativeSize(width, "Width");
		this.width = width;
	}

	private void setHeight(double height) {
		validateNonNegativeSize(height, "Height");
		this.height = height;

	}

	private void validateNonNegativeSize(double dimension, String source) {
		if (dimension <= 0) {
			throw new IllegalArgumentException(source + " cannot be zero or negative.");
		}
	}

	public double calculateSurfaceArea() {
		return 2 * this.length * this.width + calculateLateralSurfaceArea();
	}

	public double calculateLateralSurfaceArea() {
		return 2 * this.length * this.height + 2 * this.width * this.height;
	}

	public double calculateVolume() {
		return this.length * this.width * this.height;
	}

	@Override
	public String toString() {
		return String.format("Surface Area - %.2f\nLateral Surface Area - %.2f\nVolume – %.2f",
				this.calculateSurfaceArea(), this.calculateLateralSurfaceArea(), this.calculateVolume());
	}

}
