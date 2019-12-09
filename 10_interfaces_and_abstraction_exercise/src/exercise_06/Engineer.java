package exercise_06;

import java.util.Collection;

public interface Engineer {
	public void addRepair(Repair repair);

	Collection<Repair> getRepairs();
}
