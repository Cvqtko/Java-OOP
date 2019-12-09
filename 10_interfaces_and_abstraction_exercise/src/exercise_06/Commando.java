package exercise_06;

import java.util.Collection;

public interface Commando {
	public void addMission(Mission mission);

	public Collection<Mission> getMissions();

}
