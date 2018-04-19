package entreprise.employee;

import entreprise.salaire.SalaireCollaborateur;

public class Collaborateur extends Employe {

	public Collaborateur(String nom, int age, String telephone) {
		super(nom, age, telephone);
	}
	
	public Collaborateur(String nom, int age, String telephone, SalaireCollaborateur infosSalaire) {
		super(nom, age, telephone);
		InfosSalaire = infosSalaire;
	}
	
	public void setInfosSalaire(SalaireCollaborateur infosSalaire) {
		InfosSalaire = infosSalaire;
	}
}
