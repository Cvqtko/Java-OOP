package exercise_04;

public enum BakingTechnique {
	CRISPY(0.9), CHEWY(1.1), HOMEMADE(1.0);

	private double modifier;

	private BakingTechnique(double modifier) {
		this.modifier = modifier;
	}

	public double getModifier() {
		return this.modifier;
	}
}
