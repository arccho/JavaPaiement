package entreprise.salaire;

public class SalaireCadre implements InfosSalaire, TauxCadre {

	private int NombreHeureSemaine;
	
	public SalaireCadre(int heure)
	{
		NombreHeureSemaine = heure;
	}
	
	public double calculerSalaire() {
		double salaire = 0;
		if (NombreHeureSemaine <= TravailHoraire) {
			salaire = (NombreHeureSemaine * TarifHoraire) * 4;
		}
		else {
			salaire = (TravailHoraire * TarifHoraire + (NombreHeureSemaine - TravailHoraire) * TarifHoraire * (1 + TauxSupplement)) * 4;
		}
		return salaire;
	}
}
