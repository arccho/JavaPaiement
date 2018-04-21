package chaine.emission;

public class PlannificationDivertissement implements InfosPlannification {

	public int dureeEmission() {
		return 2;
	}

	public IntervalleHeure heurePlannification() {
		return new IntervalleHeure(18, 23);
	}
}
