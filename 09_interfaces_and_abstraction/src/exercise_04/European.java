package exercise_04;

public class European extends BasePerson {
	String name;

	public European(String name) {
		super(name);
	}

	@Override
	public String sayHello() {
		return "Hello";
	}

}
