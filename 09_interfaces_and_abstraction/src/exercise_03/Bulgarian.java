package exercise_03;

public class Bulgarian implements Person {
	String name;
	
	public Bulgarian(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String sayHello() {
		return "�������";
	}
}
