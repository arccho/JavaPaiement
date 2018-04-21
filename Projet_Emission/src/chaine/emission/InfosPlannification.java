package chaine.emission;

public interface InfosPlannification {
	
	class IntervalleHeure {
		private int HeureMinimum;
		private int HeureMaximum;
		
		public IntervalleHeure(int heureMinimum, int heureMaximum) {
			HeureMinimum = heureMinimum;
			HeureMaximum = heureMaximum;
		}
		
		public int getHeureMinimum() {
			return HeureMinimum;
		}
		
		public int getHeureMaximum() {
			return HeureMaximum;
		}
	}
	
	int dureeEmission();
	IntervalleHeure heurePlannification();
}
