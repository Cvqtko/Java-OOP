package exercise_04;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
	public T getRandomElement() {
		int randomindex = this.getRandomIndex();
		return super.remove(randomindex);
	}

	private int getRandomIndex() {
		Random random = new Random();

		return random.nextInt(super.size());
	}
}
