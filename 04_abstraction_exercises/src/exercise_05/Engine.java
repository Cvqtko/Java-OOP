package exercise_05;

import java.util.Arrays;

public class Engine {
	private String command;
	private ConsoleReader reader;
	private Enemy enemy;
	private Player player;

	public Engine(ConsoleReader reader, Enemy enemy, Player player) {
		this.reader = reader;
		this.enemy = enemy;
		this.player = player;
		this.command = "";
	}

	public void run() {

		this.command = this.reader.readLine();

		while (!command.equals("Let the Force be with you")) {
			int[] playerPosition = InputParser.parseIntegerArray(this.command);
			int[] enemyPosition = InputParser.parseIntegerArray(this.reader.readLine());

			int enemyRow = enemyPosition[0];
			int enemyCow = enemyPosition[1];

			enemy.destroyStars(enemyRow, enemyCow);

			int playerRow = playerPosition[0];
			int playerCow = playerPosition[1];

			this.player.collectStars(playerRow, playerCow);

			this.command = this.reader.readLine();
		}
	}
}
