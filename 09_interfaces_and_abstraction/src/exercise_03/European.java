package exercise_03;

public class European implements Person {
	String name;

	public European(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}


}
