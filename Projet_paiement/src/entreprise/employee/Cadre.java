package entreprise.employee;

import entreprise.salaire.SalaireCadre;

public class Cadre extends Employe {
	
	public Cadre(String nom, int age, String telephone) {
		super(nom, age, telephone);
	}
	
	public Cadre(String nom, int age, String telephone, SalaireCadre infosSalaire) {
		super(nom, age, telephone);
		InfosSalaire = infosSalaire;
	}
}
