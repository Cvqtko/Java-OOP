package exercise_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Map<String, Engine> engines = new LinkedHashMap<>();
		List<Car> cars = new ArrayList<>();
		collectEngines(reader, engines);
		collectCars(reader, engines, cars);

		cars.forEach(System.out::println);

	}

	private static void collectCars(BufferedReader reader, Map<String, Engine> engines, List<Car> cars)
			throws IOException {
		int countOfCars = Integer.parseInt(reader.readLine());
		while (countOfCars-- > 0) {
			String[] tokens = reader.readLine().split("\\s+");
			Car car = null;
			switch (tokens.length) {
			case 2:
				car = new Car(tokens[0], engines.get(tokens[1]));
				break;
			case 3:
				if (tokens[2].matches("\\d+")) {
					car = new Car(tokens[0], engines.get(tokens[1]), Integer.parseInt(tokens[2]));
				} else {
					car = new Car(tokens[0], engines.get(tokens[1]), tokens[2]);
				}
				break;
			case 4:
				car = new Car(tokens[0], engines.get(tokens[1]), Integer.parseInt(tokens[2]), tokens[3]);
				break;
			}
			cars.add(car);
		}
	}

	private static void collectEngines(BufferedReader reader, Map<String, Engine> engines) throws IOException {
		int countOfEngines = Integer.parseInt(reader.readLine());
		while (countOfEngines-- > 0) {
			String[] tokens = reader.readLine().split("\\s+");
			Engine engine = null;
			switch (tokens.length) {
			case 2:
				engine = new Engine(tokens[0], Integer.parseInt(tokens[1]));
				break;
			case 3:
				if (tokens[2].matches("\\d+")) {
					engine = new Engine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
				} else {
					engine = new Engine(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
				}
				break;
			case 4:
				engine = new Engine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), tokens[3]);
				break;
			}
			engines.putIfAbsent(engine.getModel(), engine);
		}
	}
}
