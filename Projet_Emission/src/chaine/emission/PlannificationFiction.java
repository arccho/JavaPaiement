package chaine.emission;

public class PlannificationFiction implements InfosPlannification {

	private int Duree;
	
	public PlannificationFiction(int duree) {
		Duree = duree;
	}
	
	public int dureeEmission() {
		return Duree;
	}

	public IntervalleHeure heurePlannification() {
		return new IntervalleHeure(21, 24);
	}
}
