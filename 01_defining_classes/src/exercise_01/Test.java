package exercise_01;

public class Test {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();

		acc.id = 1;
		acc.balance = 15;

		System.out.printf("Account ID: %d, balance %.2f", acc.id, acc.balance);
	}
}
