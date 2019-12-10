package exercise_04;

public class Bulgarian extends BasePerson {
	String name;

	public Bulgarian(String name) {
		super(name);
	}

	@Override
	public String sayHello() {
		return "Здравей";
	}
}
