package exercise_06;

public class Main {
	public static void main(String[] args) {
		InputReader reader = new ConsoleReader();
		Engine engine = new EngineImpl(reader);
		engine.run();
	}
}