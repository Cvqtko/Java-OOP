package exercise_01;

import java.util.HashSet;

public class ConsoleAppender implements Appender {

	private Layout layout;
	private ReportLevel reportLevel;

	public ConsoleAppender(Layout layout) {
		this.layout = layout;
		this.reportLevel = ReportLevel.INFO;
	}

	@Override
	public void append(String time, String reportLevel, String message) {
		this.layout.format(time, reportLevel, message);

	}

	@Override
	public void setReportLevel(ReportLevel reportLevel) {
		this.reportLevel = reportLevel;
	}

	@Override
	public ReportLevel getReportLevel() {
		// TODO Auto-generated method stub
		return this.reportLevel;
	}

}
