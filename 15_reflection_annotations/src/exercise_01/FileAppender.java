package exercise_01;

public class FileAppender implements Appender {
	private Layout layout;
	private ReportLevel reportLevel;

	public FileAppender(Layout layout) {
		this.layout = layout;
		this.reportLevel = ReportLevel.INFO;
	}

	@Override
	public void append(String time, String reportLevel, String message) {
		// TODO: Add file append logic
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
