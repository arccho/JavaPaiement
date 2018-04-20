package chaine.emission;

public abstract class DivertissementFiction implements TypeDivertissement, TypeFiction {
	

	private String Nom;
	private int Duree;
	private int AnneeRealisation;
	private String NomRealisateur;
	private boolean Rediffusion;
	
	public DivertissementFiction(String nom, int duree, int annee_realisation,  String nom_realisateur, boolean rediffusion)
	{
		Nom = nom;
		Duree = duree;
		AnneeRealisation = annee_realisation;
		NomRealisateur = nom_realisateur;
		Rediffusion = rediffusion;
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

	public int getAnneeRealisation() {
		return AnneeRealisation;
	}

	public void setAnneeRealisation(int anneeRealisation) {
		AnneeRealisation = anneeRealisation;
	}

	public String getNomRealisateur() {
		return NomRealisateur;
	}

	public void setNomRealisateur(String nomRealisateur) {
		NomRealisateur = nomRealisateur;
	}

	public boolean isRediffusion() {
		return Rediffusion;
	}

	public void setRediffusion(boolean rediffusion) {
		Rediffusion = rediffusion;
	}
	

}
