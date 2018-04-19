package entreprise.employee;

import entreprise.salaire.InfosSalaire;

public abstract class Employe {

	protected String Nom;
	protected int Age;
	protected String Telephone;
	
	protected InfosSalaire InfosSalaire;
	
	public String getNom() {
		return Nom;
	}
	
	public int getAge() {
		return Age;
	}
	
	public void setAge(int age) {
		Age = age;
	}
	
	public String getTelephone() {
		return Telephone;
	}
	
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	
	//////////////////////////////////////////
	public double getSalaire() {
		//TODO getSalaire
		return 0;
	}
	
	public void setInfosSalaire(InfosSalaire infoDalaire) {
		InfosSalaire = infoDalaire;
	}
	//////////////////////////////////////////////
	
}
