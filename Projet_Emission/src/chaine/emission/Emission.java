package chaine.emission;

public abstract class Emission {
	
	protected String Nom;
	protected InfosPlannification InfosPlannification;
	
	public Emission(String nom) {
		Nom = nom;
	}
	
	public String getNom() {
		return Nom;
	}
	
	public int getDuree() {
		if (InfosPlannification == null) {
			throw new NullPointerException("Aucune plannification n'a été attribuée à cette émission");
		}
		return InfosPlannification.dureeEmission();
	}
	
	public int getHeureMinimumPlannification() {
		if (InfosPlannification == null) {
			throw new NullPointerException("Aucune plannification n'a été attribuée à cette émission");
		}
		return InfosPlannification.heurePlannification().getHeureMinimum();
	}
	
	public int getHeureMaximumPlannification() {
		if (InfosPlannification == null) {
			throw new NullPointerException("Aucune plannification n'a été attribuée à cette émission");
		}
		return InfosPlannification.heurePlannification().getHeureMaximum();
	}
}
