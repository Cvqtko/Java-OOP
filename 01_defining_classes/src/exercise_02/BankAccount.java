package exercise_02;

public class BankAccount {
	private int id;
	private double balance;

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
		return "ID: " + this.id;
	}
}
