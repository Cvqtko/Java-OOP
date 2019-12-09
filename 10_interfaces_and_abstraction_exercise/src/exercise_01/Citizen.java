package exercise_01;

public class Citizen implements Person {

	String name;
	int age;

	public Citizen(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getAge() {
		return this.age;
	}

}
