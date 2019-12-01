package exercise_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Map<Integer, BankAccount> accounts = new HashMap<>();
		String line = reader.readLine();

		while (!"End".equals(line)) {
			String[] command = line.split("\\s+");
			int id = Integer.parseInt(command[1]);
			BankAccount acc = accounts.get(id);
			switch (command[0]) {
			case "Create":
				execCreate(accounts, id);
				break;
			case "Deposit":
				execDeposit(accounts, command, id, acc);
				break;
			case "Withdraw":
				execWithdraw(command, acc);
				break;
			case "Print":
				execPrint(acc);
				break;
			}

			line = reader.readLine();
		}
	}

	private static void execPrint(BankAccount acc) {
		if (acc == null)
			System.out.println("Account does not exist");
		else
			System.out.println(acc.toString());
	}

	private static void execWithdraw(String[] command, BankAccount acc) {
		double withdrawAmount = Double.parseDouble(command[2]);
		if (acc == null) {
			System.out.println("Account does not exist");
		} else {
			if (acc.getBalance() < withdrawAmount) {
				System.out.println("Insufficient balance");
			} else {
				acc.withdraw(withdrawAmount);
			}
		}
	}

	private static void execDeposit(Map<Integer, BankAccount> accounts, String[] command, int id, BankAccount acc) {
		double depositAmount = Double.parseDouble(command[2]);
		if (acc == null)
			System.out.println("Account does not exist");
		else
			accounts.get(id).deposit(depositAmount);
	}

	private static void execCreate(Map<Integer, BankAccount> accounts, int id) {
		if (accounts.containsKey(id)) {
			System.out.println("Account already exists");
		} else {
			BankAccount bankAccount = new BankAccount();
			bankAccount.setId(id);
			accounts.put(id, bankAccount);
		}
	}
}
