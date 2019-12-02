package exercise_04;

import java.util.Scanner;

enum Season {
	Spring(2), Summer(4), Autumn(1), Winter(3);

	private int priceMultiplier;

	Season(int index) {
		this.priceMultiplier = index;
	}

	public int getPriceMultiplier() {
		return priceMultiplier;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double pricePerDay = scanner.nextDouble();
		int numberOfDays = scanner.nextInt();
		String seasonName = scanner.next();
		String discountType = scanner.next();
		Season season = Season.valueOf(seasonName);
		Discount discount = Discount.valueOf(discountType);

		System.out.println(String.format("%.2f", getPriceFor(pricePerDay, numberOfDays, season, discount)));
	}

	private static double getPriceFor(double pricePerDay, int numberOfDays, Season season, Discount discount) {
		return pricePerDay * season.getPriceMultiplier() * numberOfDays * discount.getDiscount();
	}
}
