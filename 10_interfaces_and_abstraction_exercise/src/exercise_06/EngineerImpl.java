package exercise_06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
	private List<Repair> repairs;

	protected EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps,
			List<Repair> repairs) {
		super(id, firstName, lastName, salary, corps);
		this.repairs = repairs;
	}

	@Override
	public void addRepair(Repair repair) {
		this.repairs.add(repair);

	}

	@Override
	public Collection<Repair> getRepairs() {
		// TODO Auto-generated method stub
		return this.repairs;
	}

}
