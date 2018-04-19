package entreprise.employee;

import entreprise.salaire.SalaireCommercial;

public class Commercial extends Employe {

	public Commercial(String nom, int age, String telephone) {
		super(nom, age, telephone);
	}
	
	public Commercial(String nom, int age, String telephone, SalaireCommercial infosSalaire) {
		super(nom, age, telephone);
		InfosSalaire = infosSalaire;
	}
}
