package exercise_06;

public class Validator {

	private Validator() {

	};

	public static void validateCorps(String corps) {
		if (!corps.equals(Corps.AIRFORCE.getName()) && !corps.equals(Corps.AIRFORCE.getName())) {
			throw new IllegalArgumentException("Invalid Corps!");
		}
	}

	public static boolean validateMissionState(String state) {
		if (!state.equals(MissionState.FINISHED.getState()) && !state.equals(MissionState.IN_PROGRESS.getState())) {
			return false;

		}
		return true;

	}
}
