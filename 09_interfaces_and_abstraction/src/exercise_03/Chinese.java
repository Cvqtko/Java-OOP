package exercise_03;

public class Chinese implements Person {
	String name;
	
	public Chinese(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String sayHello() {
		return "Djydjybydjy";
	}
}
