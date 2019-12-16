package exercise_04.core.commands;

import javax.naming.OperationNotSupportedException;

import exercise_04.interfaces.Repository;
import exercise_04.interfaces.Unit;
import exercise_04.interfaces.UnitFactory;

public class Retire extends Command {

	public Retire(String[] data, Repository repository, UnitFactory factory) {
		super(data, repository, factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() {
		String type = this.getData()[1];

		String result;

		try {
			this.getRepository().removeUnit(type);
			result = type + " retired!";
		} catch (OperationNotSupportedException e) {
			result = e.getMessage();
		}

		return result;
	}

}
