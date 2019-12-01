package exercise_03;

public class BankAccount {
	private int id;
	private double balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0)
			this.balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= balance)
			this.balance -= amount;
		else
			System.out.println("Insufficient balance");
	}

	@Override
	public String toString() {
		return String.format("Account ID%d, balance %.2f", this.getId(), this.getBalance());
	}
}
