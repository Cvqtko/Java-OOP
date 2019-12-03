package exercise_03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String powerInput = scanner.nextLine();
		String suitInput = scanner.nextLine();

		CardPower power = CardPower.valueOf(powerInput);
		CardSuit suit = CardSuit.valueOf(suitInput);

		Card card = new Card(suit, power);

		System.out.println(card.toString());
	}
}
