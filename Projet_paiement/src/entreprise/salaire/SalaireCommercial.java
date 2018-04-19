package entreprise.salaire;

public class SalaireCommercial implements InfosSalaire, TauxCommercial {
	
	private double ChiffreAffaires;
	
	public SalaireCommercial(double chiffreAffaires) {
		ChiffreAffaires = chiffreAffaires;
	}
	
	public double calculerSalaire() {
		return ChiffreAffaires * TauxChiffreAffaires;
	}
}
