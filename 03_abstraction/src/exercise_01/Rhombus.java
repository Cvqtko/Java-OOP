package exercise_01;

import java.util.Scanner;

public class Rhombus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i <= size; i++) {
			printRow(size, i);
		}

		for (int i = size - 1; i >= 0; i--) {
			printRow(size, i);
		}
	}

	private static void printRow(int size, int i) {
		printLeadingSpaces(i, size);
		printStars(i);
		System.out.println();
	}

	private static void printStars(int starCount) {
		for (int i = 0; i < starCount; i++) {
			System.out.print("* ");
		}

	}

	private static void printLeadingSpaces(int row, int size) {
		int spacesCount = Math.abs(size - row);

		for (int i = 0; i < spacesCount; i++) {
			System.out.print(" ");
		}

	}

}
