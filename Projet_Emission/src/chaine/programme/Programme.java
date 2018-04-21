package chaine.programme;

import chaine.emission.Emission;

public class Programme {

	Emission[] ListeProgramme;
	
	public Programme() {
		ListeProgramme = new Emission[25];	//de 0h à 24h compris
	}
	
	public void ajouterEmission(Emission emission) {
		int heureMinimumPlanification = emission.getHeureMinimumPlannification();
		int heureMaximumPlanification = emission.getHeureMaximumPlannification();
		int dureeEmission = emission.getDuree();
		
		
		int nombreParcourHeure = Math.min(24 - heureMinimumPlanification + 1, heureMaximumPlanification - heureMinimumPlanification + 1);
		int nombreParcourtCalcul = nombreParcourHeure;
		int debutHeureRecherche = heureMinimumPlanification;
		
		boolean placeDisponible = false;
		
		while(!placeDisponible && debutHeureRecherche < heureMinimumPlanification + nombreParcourHeure) {
			placeDisponible = true;
			
			int boucle = debutHeureRecherche;
			while(placeDisponible && boucle < Math.min(dureeEmission, nombreParcourtCalcul) + debutHeureRecherche) {
				if(ListeProgramme[boucle] != null) {
					placeDisponible = false;
				}
				boucle++;
			}
			if(placeDisponible == true) {
				for(int boucleinsert = debutHeureRecherche; boucleinsert < Math.min(dureeEmission, nombreParcourtCalcul) + debutHeureRecherche; boucleinsert++) {
					ListeProgramme[boucleinsert] = emission;
				}
			}
			else {
				debutHeureRecherche++;
				nombreParcourtCalcul--;
			}
		}
		
		if(!placeDisponible) {
			System.out.println("Aucune horaire n'a été trouvée pour l'émission " + emission.getNom());
		}
	}
	
	public void afficherProgramme() {
		Emission emission = null;
		int heureFin = 0;
		
		for(int boucle = 0; boucle < 25; boucle++) {
			if(ListeProgramme[boucle] == null) {
				System.out.println("Heure " + boucle + "   Aucune emission");
			}
			else {
				if (ListeProgramme[boucle] != emission) {
					emission = ListeProgramme[boucle];
					heureFin = (boucle + emission.getDuree())%24;
				}
				System.out.println("Heure " + boucle + "   Emission: " + emission.getNom() + " jusqu'à " + heureFin + "h");
			}
		}
	}
}
