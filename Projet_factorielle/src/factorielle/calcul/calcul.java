package factorielle.calcul;

public class calcul {
	
	public int factorielle(int number) {
		
		if(number == 0) {
			return 1;
		}
		else {
			return number * factorielle(number -1);
		}
	}
}
