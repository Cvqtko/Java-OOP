package exercise_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Logger logger = new MessageLogger();

		int n = Integer.parseInt(scanner.nextLine());
		Appender appender = null;
		while (n-- > 0) {
			String[] tokens = scanner.nextLine().split("\\s+");

			String appenderType = tokens[0];

			Layout layout = tokens[1].equals("SimpleLayout") ? new SimpleLayout() : new XmlLayout();

			if (appenderType.equals("ConsoleAppender")) {

				appender = new ConsoleAppender(layout);
				if (tokens.length == 3) {
					appender.setReportLevel(ReportLevel.valueOf(tokens[2]));
				}
			} else {

			}

			if (appender != null) {
				logger.addAppenders(appender);
			}

		}
		String input = scanner.nextLine();
		while (!input.equals("END")) {

			String[] tokens = input.split("\\|");
			ReportLevel reportLevel = ReportLevel.valueOf(tokens[0]);
			String time = tokens[1];
			String message = tokens[2];

			switch (reportLevel) {
			case INFO: 
				logger.logInfo(time, message);
				break;
				
			case WARNING:
				logger.logWarning(time, message);
				break;
				
			case ERROR:
				logger.logError(time, message);
				break;
				
			case CRITICAL:
				logger.logCritical(time, message);
				break;
				
			case FATAL:
				logger.logFatal(time, message);
				break;
				
			}

			input = scanner.nextLine();
		}

	}
}
