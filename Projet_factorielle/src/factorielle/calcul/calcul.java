package factorielle.calcul;

import java.security.InvalidParameterException;

public class calcul {
	
	public static int factorielle(int number) {
		
		if(number < 0) {
			throw new InvalidParameterException("Factorielle d'un nombre négatif impossible");
		}
		
		int total = 1;
		for (int boucle=1; boucle <= number; boucle++) {
			if((long)total * (long)boucle > Integer.MAX_VALUE) {
				throw new InvalidParameterException("Le nombre maximum du type entier ne peux exceder " + Integer.MAX_VALUE);
			}
			total =  total * boucle;
		}
		
		return total;
	}
}
