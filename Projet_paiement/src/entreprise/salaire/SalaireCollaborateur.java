package entreprise.salaire;

public class SalaireCollaborateur implements InfosSalaire, TauxCadre, TauxCommercial {
	
	private int NombreHeureSemaine;
	private double ChiffreAffaires;
	
	public SalaireCollaborateur(int heure, double chiffreAffaires) {
		NombreHeureSemaine = heure;
		ChiffreAffaires = chiffreAffaires;
	}
	
	public double calculerSalaire() {
		double salaire = ChiffreAffaires * TauxChiffreAffaires;
		if (NombreHeureSemaine <= TravailHoraire) {
			salaire += (NombreHeureSemaine * TarifHoraire) * 4;
		}
		else {
			salaire += (TravailHoraire * TarifHoraire + (NombreHeureSemaine - TravailHoraire) * TarifHoraire * (1 + TauxSupplement)) * 4;
		}
		return salaire;
	}
}
