package entreprise.employee;

import entreprise.salaire.SalaireOuvrier;

public class Ouvrier extends Employe {
	
	protected int HeuresSemaines;

	public Ouvrier(String nom, int age, String telephone) {
		super(nom, age, telephone);
	}
	
	public Ouvrier(String nom, int age, String telephone, int heures, SalaireOuvrier infosSalaire) {
		super(nom, age, telephone);
		InfosSalaire = infosSalaire;
	}
}
