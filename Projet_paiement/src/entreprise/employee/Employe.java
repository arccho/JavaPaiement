package entreprise.employee;

import entreprise.salaire.InfosSalaire;

public abstract class Employe {

	protected String Nom;
	protected int Age;
	protected String Telephone;
	
	protected InfosSalaire InfosSalaire;
	
	public Employe(){}
	
	public Employe(String nom, int age, String telephone) {
		Nom = nom;
		Age = age;
		Telephone = telephone;
	}
	
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
	
	public double getSalaire() {
		if (InfosSalaire == null) {
			throw new NullPointerException("L'employ� " + Nom + " n'a actuellement aucun param�tre attribu� sur son salaire");
		}
		return InfosSalaire.calculerSalaire();
	}
	
	public void afficherSalaire() {
		System.out.println(Nom + " gagne " + getSalaire() + " �\n");
	}
	
}
