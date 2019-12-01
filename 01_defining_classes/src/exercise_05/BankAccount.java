package exercise_05;

public class BankAccount {
	private static final double DEFAULT_INTEREST_RATE = 0.02;
	private static int idSequence = 1;
	private static double interestRate = DEFAULT_INTEREST_RATE;

	private int id;
	private double balance;

	public BankAccount() {
		this.id = idSequence++;
	}

	public static void setInterest(double interest) {
		interestRate = interest;
	}

	public double getInterest(int years) {
		return this.interestRate;
	}

	public double getInterestRate(int years) {
		return this.balance * interestRate * years;
	}

	public int getId() {
		return this.id;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
}
