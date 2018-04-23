package factorielle.calcul;

import java.util.Scanner;

public class Entree {
	
	public static void Interpretation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier pour effectuer la factorielle:");
		String chaineSaisie = scanner.nextLine();
		if(chaineSaisie.equals("")) {
			throw new ArrayIndexOutOfBoundsException("Argument vide, un entier est attendu");
		}
		else {
			try {
				int nombreSaisie = Integer.parseInt(chaineSaisie);
				
				System.out.println(calcul.factorielle(nombreSaisie));
			}
			catch (NumberFormatException NFException) {
				throw new NumberFormatException("L'argument saisi n'est pas un entier");
			}
		}
	}
}
