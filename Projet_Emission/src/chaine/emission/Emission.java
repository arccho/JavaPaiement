package chaine.emission;

public abstract class Emission {
	protected String Nom;
	
	public Emission(String nom) {
		Nom = nom;
	}
	
	public String getNom() {
		return Nom;
	}
}
