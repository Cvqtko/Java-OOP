package exercise_04;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private double salary;

	public Person(String firstName, String lastName, int age) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
	}

	public Person(String firstName, String lastName, int age, double salary) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.setSalary(salary);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.validateName(firstName, "First");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.validateName(lastName, "Last");
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<=0)
			throw new IllegalArgumentException("Age cannot be zero or negative integer");
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary<460)
			throw new IllegalArgumentException("Salary cannot be less than 460 leva");
		this.salary = salary;
	}

	private void validateName(String toCheck, String field) {
		if (toCheck.length() < 3) {
			throw new IllegalArgumentException(field + "name cannot be less than 3 symbols");
		}

	}

	public void increaseSalary(double bonus) {
		if (this.getAge() < 30) {
			this.setSalary(this.getSalary() + (this.getSalary() * bonus / 200));
		} else {
			this.setSalary(this.getSalary() + (this.getSalary() * bonus / 100));
		}

	}

	@Override
	public String toString() {
		return String.format("%s %ss gets %.2f leva", firstName, lastName, salary);
	}

}
