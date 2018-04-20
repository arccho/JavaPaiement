package chaine.emission;

public abstract class Divertissement implements TypeDivertissement {

	private String Nom;
	private int Duree;
	
	public Divertissement(String nom, int duree)
	{
		Nom = nom;
		Duree = duree;
	}

	public String getNom() {
		return Nom;
	}

	public int getDuree() {
		return Duree;
	}

	public void setDuree(int duree) {
		Duree = duree;
	}
	
}
