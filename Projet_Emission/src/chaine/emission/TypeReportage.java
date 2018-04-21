package chaine.emission;

public interface TypeReportage {
	
	enum Documentaire {
		  Animalier ("Documentaire animalier"),
		  Culturel ("Documentaire culturel");
		   
		  private String Categorie;
		   
		  Documentaire(String categorie) {
		    this.Categorie = categorie;
		  }
		  
		  public String toString() {
			    return Categorie;
		  }
	}
}
