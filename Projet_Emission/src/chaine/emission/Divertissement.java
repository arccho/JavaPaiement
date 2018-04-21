package chaine.emission;

public class Divertissement extends Emission implements TypeDivertissement {
	
	public Divertissement(String nom) {
		super(nom);
	}
	
	public void SetInfosPlannification(PlannificationDivertissement infosPlannification) {
		InfosPlannification = infosPlannification;
	}
	
}
