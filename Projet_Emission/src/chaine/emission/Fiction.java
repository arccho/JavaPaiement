package chaine.emission;

public class Fiction extends Emission implements TypeFiction {

	private int AnneeRealisation;
	private String NomRealisateur;
	private boolean Rediffusion;
	
	public Fiction(String nom, int annee_realisation,  String nom_realisateur, boolean rediffusion)
	{
		super(nom);
		AnneeRealisation = annee_realisation;
		NomRealisateur = nom_realisateur;
		Rediffusion = rediffusion;
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
