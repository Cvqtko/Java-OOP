package exercise_06;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

	private Corps corps;

	protected SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corps corps) {
		super(id, firstName, lastName, salary);
		this.corps = corps;
	}

}
