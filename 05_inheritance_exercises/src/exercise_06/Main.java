package exercise_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String input = scanner.nextLine();

		List<Animal> animals = new ArrayList<>();

		while (!input.equals("Beast!")) {

			Animal animal;
			String[] params;
			try {
				if (input.equals("Dog")) {
					params=getParams();
					animal = new Dog(params[0], Integer.parseInt(params[1]), params[2]);
				} else if (input.equals("Cat")) {
					params=getParams();
					animal = new Cat(params[0], Integer.parseInt(params[1]), params[2]);
				} else if (input.equals("Frog")) {
					params=getParams();
					animal = new Frog(params[0], Integer.parseInt(params[1]), params[2]);
				} else if (input.equals("Kitten")) {
					params=getParams();
					animal = new Kitten(params[0], Integer.parseInt(params[1]));
				} else {
					params=getParams();
					animal = new Tomcat(params[0], Integer.parseInt(params[1]));
				}

				animals.add(animal);

			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("Invalid input!");
			}

			input = scanner.nextLine();
		}
		for (Animal animal : animals) {
			System.out.println(animal.toString());
			System.out.println(animal.produceSound());
		}
	}

	public static String[] getParams() {
		String[] params = scanner.nextLine().split("\\s+");
		return params;
	}
}
