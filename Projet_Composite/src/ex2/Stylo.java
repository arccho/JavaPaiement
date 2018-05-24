package ex2;

public class Stylo implements Article {

	enum Couleur {
		Blanc,
		Noir,
		Gris,
		Marron,
		Bleu,
		Jaune,
		Rouge,
		Orange,
		Vert,
		Rose
	}
	
	private String reference;
	private String nom;
	private String marque;
	private float prixUnitaire;
	private Couleur couleur;
	
	public Stylo(String ref, String nom, String marque, float prixUnit, Couleur couleur) {
		reference = ref;
		this.nom = nom;
		this.marque = marque;
		prixUnitaire = prixUnit;
		this.couleur = couleur;
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
	
	public Couleur getCouleur() {
		return couleur;
	}
}
