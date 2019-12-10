package exercise_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Map<String, Vehicle> vehicles = new HashMap<>();
		vehicles.put("Car", readVehicleInput(scanner.nextLine()));
		vehicles.put("Truck", readVehicleInput(scanner.nextLine()));
		vehicles.put("Bus", readVehicleInput(scanner.nextLine()));

		int n = Integer.parseInt(scanner.nextLine());

		while (n-- > 0) {
			String[] tokens = scanner.nextLine().split("\\s+");

			String command = tokens[0];
			String type = tokens[1];
			double value = Double.parseDouble(tokens[2]);
			try {
				if (command.equals("Drive")) {
					if (type.equals("Bus")) {
						((Bus) vehicles.get(type)).setOccupied(true);
						vehicles.get(type).drive(value);
					} else {
						vehicles.get(type).drive(value);
					}
				} else
					vehicles.get(type).refuel(value);
			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			}
		}
		vehicles.values().forEach(e -> System.out.println(e));
	}

	private static Vehicle readVehicleInput(String nextLine) {
		String[] tokens = nextLine.split("\\s+");

		return tokens[0].equals("Car")
				? new Car(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]))
				: tokens[0].equals("Truck")
						? new Truck(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
								Double.parseDouble(tokens[3]))
						: new Bus(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
								Double.parseDouble(tokens[3]));

	}
}
