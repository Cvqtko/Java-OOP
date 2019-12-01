
public class Test {

	public static void main(String[] args) {
		double delitel = 11.075;
		String delimo = "73465";

		for (int i = 0; i < 100; i++) {
			delimo = "73465";
			if (i < 10) {
				delimo = delimo + "0" + i;
			} else {
				delimo = delimo + i;
			}
			System.out.println(delimo + " / " + delitel + " = " + Double.parseDouble(delimo) / delitel);
		}
	}

}
