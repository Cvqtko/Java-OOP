package exercise_01;

public class XmlLayout implements Layout {

	@Override
	public void format(String time, String reportLevel, String message) {
		// TODO Auto-generated method stub
		System.out.println(String.format("" + "<log>\r\n" + "<date>%s</date>\r\n" + "<level>%s</level>\r\n"
				+ "<message>%s</message>\r\n" + "</log>\r\n" + "", time, reportLevel, message));
	}

}
