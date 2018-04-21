package chaine.emission;

public class Divertissement extends Emission implements TypeDivertissement {

	private int Duree;
	
	public Divertissement(String nom, int duree)
	{
		super(nom);
		Duree = duree;
	}

	public int getDuree() {
		return Duree;
	}

	public void setDuree(int duree) {
		Duree = duree;
	}
	
}
