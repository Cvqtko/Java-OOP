package exercise_05;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleReader {
	private Scanner scanner;

	public ConsoleReader() {
		this.scanner = new Scanner(System.in);
	}

	public String readLine() {
		return this.scanner.nextLine();
	}
}
