package exercise_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import exercise_02.Person;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int countOfPeople = Integer.parseInt(reader.readLine());
		ArrayList<Person> people = new ArrayList<>();

		while (countOfPeople-- > 0) {
			String[] tokens = reader.readLine().split("\\s+");
			String name = tokens[0];
			int age = Integer.parseInt(tokens[1]);

			Person person = new Person(name, age);
			people.add(person);
		}
		people.stream().filter(person -> person.getAge() > 30)
		.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
				.forEach(person -> System.out.println(person.getName() + " - " + person.getAge()));
	}
}
