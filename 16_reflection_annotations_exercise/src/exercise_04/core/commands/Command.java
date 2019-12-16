package exercise_04.core.commands;

import exercise_04.interfaces.UnitFactory;
import exercise_04.interfaces.Executable;
import exercise_04.interfaces.Repository;

public abstract class Command implements Executable{
	private String[] data;
	private Repository repository;
	private UnitFactory factory;
	
	public Command(String[] data, Repository repository, UnitFactory factory) {
		this.data = data;
		this.repository = repository;
		this.factory = factory;
	}

	public String[] getData() {
		return data;
	}

	private void setData(String[] data) {
		this.data = data;
	}

	public Repository getRepository() {
		return repository;
	}

	private void setRepository(Repository repository) {
		this.repository = repository;
	}

	public UnitFactory getFactory() {
		return factory;
	}

	private void setFactory(UnitFactory factory) {
		this.factory = factory;
	}
	
	
}
