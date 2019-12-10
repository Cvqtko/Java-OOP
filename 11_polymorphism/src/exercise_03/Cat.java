package exercise_03;

public class Cat extends Animal {

	public Cat(String name, String favouriteFood) {
		super(name, favouriteFood);
	}

	@Override
	public String explainSelf() {
		return String.format("%s%nMEEOW", super.explainSelf());
	}

}
