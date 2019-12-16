package exercise_04.core.commands;

import exercise_04.interfaces.Repository;
import exercise_04.interfaces.UnitFactory;

public class Report extends Command {

	public Report(String[] data, Repository repository, UnitFactory factory) {
		super(data, repository, factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		return this.getRepository().getStatistics();

	}

}
