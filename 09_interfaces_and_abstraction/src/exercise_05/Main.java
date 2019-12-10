package exercise_05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		HashMap<String, Identifiable> data = new HashMap<>();

		while (!line.equals("End")) {
			String[] parts = line.split("\\s+");

			if (parts.length == 2) {
				Robot robot = new Robot(parts[0], parts[1]);
				data.put(parts[1], robot);
			} else {
				Citizen citizen = new Citizen(parts[0], Integer.parseInt(parts[1]), parts[2]);
				data.put(parts[2], citizen);
			}

			line = scanner.nextLine();
		}
		String fakeIdEndingOn = scanner.nextLine();

		// Using for
		for (String key : data.keySet()) {
			if (key.endsWith(fakeIdEndingOn)) {
				System.out.println(key);
			}
		}

		// Using Stream API
		data.keySet().stream().filter(k -> k.endsWith(fakeIdEndingOn)).forEach(s -> System.out.println(s));
	}
}
