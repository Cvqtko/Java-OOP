package exercise_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {

	private List<Mission> missions;

	protected CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps, Mission... missions) {
		super(id, firstName, lastName, salary, corps);
		this.missions = missions != null ? Arrays.asList(missions) : new ArrayList<Mission>();
	}

	@Override
	public void addMission(Mission mission) {
		this.missions.add(mission);

	}

	@Override
	public Collection<Mission> getMissions() {
		return this.missions;
	}

}
