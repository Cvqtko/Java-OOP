package exercise_04;

public abstract class BasePerson implements Person {
	String name;

	protected BasePerson(String name) {
		setName(name);
	}

	public String getName() {
		return this.name;
	}

	private void setName(String name) {
		this.name = name;
	}

}
