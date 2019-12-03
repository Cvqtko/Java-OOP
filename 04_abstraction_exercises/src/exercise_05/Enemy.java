package exercise_05;

public class Enemy {
	private Galaxy galaxy;

	public Enemy(Galaxy galaxy) {
		this.galaxy = galaxy;
	}

	public void destroyStars(int row, int col) {
		while (row >= 0 && col >= 0) {
			if (row >= 0 && row < this.galaxy.getLength() && col >= 0 && col < this.galaxy.getInnerLength(row)) {
				this.galaxy.setStar(row, col, 0);
			}
			row--;
			col--;
		}
	}
}
