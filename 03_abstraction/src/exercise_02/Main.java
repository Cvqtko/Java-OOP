package exercise_02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] rectangleInput = scanner.nextLine().split(" ");
		int[] coordinates = new int[4];

		for (int i = 0; i < 4; i++) {
			coordinates[i] = Integer.parseInt(rectangleInput[i]);
		}

		Rectangle rectangle = new Rectangle(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
		int numberOfPoints = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < numberOfPoints; i++) {
			int pointX = scanner.nextInt();
			int pointY = scanner.nextInt();

			Point check = new Point(pointX, pointY);
			System.out.println(rectangle.contains(check));
		}

	}
}
