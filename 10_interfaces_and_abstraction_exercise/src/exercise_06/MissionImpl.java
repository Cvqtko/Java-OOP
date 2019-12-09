package exercise_06;

public class MissionImpl implements Mission {
	private String name;
	private MissionState state;

	public MissionImpl(String name, MissionState state) {
		this.name = name;
		this.state = state;
	}

	public void completeMission() {
		this.state = MissionState.FINISHED;
	}
}
