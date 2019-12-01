package exercise_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import exercise_05.BankAccount;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Map<Integer, BankAccount> accounts = new HashMap<>();
		String line = reader.readLine();

		while (!"End".equals(line)) {
			String[] command = line.split("\\s+");

			switch (command[0]) {
			case "Create":
				BankAccount acc = new BankAccount();
				accounts.put(acc.getId(), acc);
				System.out.printf("Account ID%d created\n", acc.getId());
				break;
			case "Deposit":
				int id = Integer.parseInt(command[1]);
				BankAccount acc1 = accounts.get(id);
				double depositAmount = Double.parseDouble(command[2]);
				if (acc1 == null)
					System.out.println("Account does not exist");
				else {

					accounts.get(id).deposit(depositAmount);
					System.out.printf("Deposited %s to ID%d\n", command[2], id);
				}
				break;
			case "SetInterest":
				BankAccount.setInterest(Double.parseDouble(command[1]));
				break;
			case "GetInterest":
				int idGetInterest = Integer.parseInt(command[1]);
				BankAccount accGetInterest = accounts.get(idGetInterest);
				if (accGetInterest == null)
					System.out.println("Account does not exist");
				else {
					System.out.printf("%.2f\n",
							accounts.get(Integer.parseInt(command[1])).getInterestRate(Integer.parseInt(command[2])));
				}
				break;
			}

			line = reader.readLine();
		}
	}

}
