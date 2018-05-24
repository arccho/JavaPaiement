package ex2;

public class RamettePapier implements Article {

	private String reference;
	private String nom;
	private String marque;
	private float prixUnitaire;
	private float grammage;
	
	public RamettePapier(String ref, String nom, String marque, float prixUnit, float grammage) {
		reference = ref;
		this.nom = nom;
		this.marque = marque;
		prixUnitaire = prixUnit;
		this.grammage = grammage;
	}

	@Override
	public String getReference() {
		return reference;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public String getMarque() {
		return marque;
	}

	@Override
	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public float getGrammage() {
		return grammage;
	}
	
	
}
