package exercise_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			double length = Double.parseDouble(scanner.nextLine());
			double width = Double.parseDouble(scanner.nextLine());
			double height = Double.parseDouble(scanner.nextLine());

			Box box = new Box(length, width, height);

			System.out.println(box.toString());
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
