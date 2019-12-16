package exercise_03.core.factories;

import exercise_03.interfaces.Unit;
import exercise_03.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
		// TODO: implement for problem 3
		throw new ExecutionControl.NotImplementedException("message");
	}
}
