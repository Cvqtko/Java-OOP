package exercise_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LinkedHashMap<String, Car> cars = new LinkedHashMap<>();
		collectCars(reader, cars);

		String line = reader.readLine();
		while (!"End".equals(line)) {
			String[] tokens = line.split("\\s+");
			String carModel = tokens[1];
			int amountOfKm = Integer.parseInt(tokens[2]);
			Car car = cars.get(carModel);

			car.drive(amountOfKm);
			line = reader.readLine();
		}

		for (Car car : cars.values()) {
			System.out.println(car.toString());
		}
	}

	private static void collectCars(BufferedReader reader, HashMap<String, Car> cars) throws IOException {
		int numberOfCars = Integer.parseInt(reader.readLine());

		while (numberOfCars-- > 0) {
			String[] tokens = reader.readLine().split("\\s+");
			String model = tokens[0];
			Double fuelAmount = Double.parseDouble(tokens[1]);
			Double fuelCostFor1km = Double.parseDouble(tokens[2]);
			Car car = new Car(model, fuelAmount, fuelCostFor1km);
			cars.put(model, car);
		}
	}
}
