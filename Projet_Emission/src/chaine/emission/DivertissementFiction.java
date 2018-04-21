package chaine.emission;

import java.security.InvalidParameterException;

public class DivertissementFiction extends Emission implements TypeDivertissement, TypeFiction {
	
	protected int AnneeRealisation;
	protected String NomRealisateur;
	protected boolean Rediffusion;
	
	public DivertissementFiction(String nom, int duree, int annee_realisation,  String nom_realisateur, boolean rediffusion) {
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

	public int ageMinimumConseille() {
		return 16;
	}
	
	public void SetInfosPlannification(PlannificationDivertissement infosPlannification) {
		if(Rediffusion == true) {
			throw new InvalidParameterException(
					"Cette émission est une rediffusion, elle ne peut donc pas avoir une plannification de type \"Divertissement\"");
		}
		InfosPlannification = infosPlannification;
	}
	
	public void SetInfosPlannification(PlannificationFiction infosPlannification) {
		InfosPlannification = infosPlannification;
	}
	
	@Override
	public int getHeureMinimumPlannification() {
		if (InfosPlannification == null) {
			throw new NullPointerException("Aucune plannification n'a été attribuée à cette émission");
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
