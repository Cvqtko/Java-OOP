package exercise_01;

import java.util.HashSet;
import java.util.Set;

public class MessageLogger implements Logger {
	private Set<Appender> appenders;

	public MessageLogger(Appender... appenders) {
		this.setAppenders(appenders);
	}

	@Override
	public void setAppenders(Appender[] appenders) {
		this.appenders = new HashSet<>();
		if (appenders != null) {
			for (Appender appender : appenders) {
				this.appenders.add(appender);
			}
		}
	}

	@Override
	public void addAppenders(Appender appender) {
		this.appenders.add(appender);

	}

	private void log(String time, ReportLevel reportLevel, String message) {
		for (Appender appender : appenders) {
			if (appender.getReportLevel().ordinal() <= reportLevel.ordinal()) {
				appender.append(time, reportLevel.toString(), message);
			}
		}
	}

	@Override
	public void logError(String time, String message) {
		this.log(time, ReportLevel.ERROR, message);

	}

	@Override
	public void logInfo(String time, String message) {
		this.log(time, ReportLevel.INFO, message);

	}

	@Override
	public void logWarning(String time, String message) {
		this.log(time, ReportLevel.WARNING, message);

	}

	@Override
	public void logCritical(String time, String message) {
		this.log(time, ReportLevel.CRITICAL, message);

	}

	@Override
	public void logFatal(String time, String message) {
		this.log(time, ReportLevel.FATAL, message);

	}

}
