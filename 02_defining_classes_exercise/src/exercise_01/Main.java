package exercise_01;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws Exception {
		Class person = Person.class;
		Field[] fields = person.getDeclaredFields();
		System.out.println(fields.length);

		Person pesho = new Person();
		Person gosho = new Person();
		Person stamat = new Person();
	}

}
