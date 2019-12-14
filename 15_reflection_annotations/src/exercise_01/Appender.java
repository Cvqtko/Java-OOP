package exercise_01;

public interface Appender {
	void append(String time, String reportLevel, String message);
	void setReportLevel(ReportLevel reportLevel);
	ReportLevel getReportLevel();
}
