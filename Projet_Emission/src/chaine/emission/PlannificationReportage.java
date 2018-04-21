package chaine.emission;

public class PlannificationReportage implements InfosPlannification {

	private int Duree;
	
	public PlannificationReportage(int duree) {
		Duree = duree;
	}
	
	public int dureeEmission() {
		return Duree;
	}

	public IntervalleHeure heurePlannification() {
		return new IntervalleHeure(0, 24);
	}
}
