package chaine.emission;

public class Fiction extends Emission implements TypeFiction {

	protected int AnneeRealisation;
	protected String NomRealisateur;
	protected boolean Rediffusion;
	
	public Fiction(String nom, int annee_realisation,  String nom_realisateur, boolean rediffusion) {
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
	
	public void SetInfosPlannification(PlannificationFiction infosPlannification) {
		InfosPlannification = infosPlannification;
	}
	
	@Override
	public int getHeureMinimumPlannification() {
		if (InfosPlannification == null) {
			throw new NullPointerException("Aucune plannification n'a été attribuée à  l'émission " + Nom);
		}
		
		if(Rediffusion == true) {
			return 0;
		}
		return InfosPlannification.heurePlannification().getHeureMinimum();
	}
	
	@Override
	public int getHeureMaximumPlannification() {
		if (InfosPlannification == null) {
			throw new NullPointerException("Aucune plannification n'a été attribuée à cette émission");
		}
		
		if(Rediffusion == true) {
			return 24;
		}
		return InfosPlannification.heurePlannification().getHeureMaximum();
	}
}
