package entreprise.salaire;

public interface InfosSalaire {
	
	default double CalculerSalaire(int heures) {
		return 0;
	}
}
