package exercise_01;

public class SimpleLayout implements Layout {

	@Override
	public void format(String time, String reportLevel, String message) {
		// TODO Auto-generated method stub
		System.out.println(String.format("%s - %s - %s", time, reportLevel, message));
	}

}
