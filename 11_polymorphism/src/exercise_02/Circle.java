package exercise_02;

public class Circle extends Shape {
	private Double radius;
	
	public Circle(Double radius) {
		this.radius = radius;
	}

	@Override
	public double calculatePerimeter() {

		return 2 * 3.14 * this.radius;
	}

	@Override
	public double calculateArea() {
		return 3.14 * Math.pow(this.radius, 2);
	}
}
