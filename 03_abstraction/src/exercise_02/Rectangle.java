package exercise_02;

public class Rectangle {
	private Point bottomLeft;
	private Point topRight;

	public Rectangle(int bottomLeftX, int bottomLeftY, int topRightX, int topRightY) {
		this.bottomLeft = new Point(bottomLeftX, bottomLeftY);
		this.topRight = new Point(topRightX, topRightY);
	}

	public boolean contains(Point toCheck) {
		if (toCheck.getX() >= this.bottomLeft.getX() && toCheck.getX() <= this.topRight.getX()) {
			if (toCheck.getY() >= this.bottomLeft.getY() && toCheck.getY() <= this.topRight.getY()) {
				return true;
			}
		}
		return false;
	}
}
