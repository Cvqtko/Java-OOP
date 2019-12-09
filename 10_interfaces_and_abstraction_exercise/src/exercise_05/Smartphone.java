package exercise_05;

import java.util.List;

public class Smartphone implements Callable, Browsable {
	private List<String> numbers;
	private List<String> urls;

	public Smartphone(List<String> numbers, List<String> urls) {
		super();
		this.numbers = numbers;
		this.urls = urls;
	}

	@Override
	public String browse() {
		StringBuilder sb = new StringBuilder();
		for (String url : this.urls) {
			boolean isValidURL = validateURL(url);
			if (isValidURL)
				sb.append("Browsing: " + url + "!\n");
			else
				sb.append("Invalid URL!\n");
		}
		return sb.toString();
	}

	@Override
	public String call() {
		StringBuilder sb = new StringBuilder();

		for (String number : this.numbers) {
			boolean isValidNumber = validatePhoneNimber(number);
			if (isValidNumber)
				sb.append("Calling... " + number + "\n");
			else
				sb.append("Invalid number!\n");
		}

		return sb.toString().trim();
	}

	private boolean validateURL(String url) {
		for (char symbol : url.toCharArray()) {
			if (Character.isDigit(symbol)) {
				return false;
			}
		}
		return true;
	}

	private boolean validatePhoneNimber(String number) {
		for (char symbol : number.toCharArray()) {
			if (!Character.isDigit(symbol)) {
				return false;
			}
		}
		return true;
	}

}
