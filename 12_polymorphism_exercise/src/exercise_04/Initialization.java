package exercise_04;

public class Initialization {

	public static CommandInterface bulidCommandInterface(StringBuilder text) {

		CommandInterface commandInterface = new CommandImpl(text);

		commandInterface.init();

		return commandInterface;
	}
}
