package menu;
import java.util.Scanner;

import exception.InferiorEqualsException;
import exception.NoNumberException;
import exception.NotBetweenException;

public class menu {
	
	public int saisirChoix(int n) throws InferiorEqualsException, NotBetweenException, NoNumberException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier");
		try {
			int entierSaisie = scanner.nextInt();
			
			if (n <= 1) {
				throw new InferiorEqualsException(n);
			}
			else if (entierSaisie < 1 || entierSaisie > n) {
				throw new NotBetweenException(n);
			}
			return entierSaisie;
		}
		catch (Exception e) {
			throw new NoNumberException();
		}
	}
	
	public void affichageMenu(String[] tab) {
		for (int boucle =0; boucle < tab.length; boucle++) {
			System.out.println((boucle+1) + ": " + tab[boucle].toString());
		}
	}
	
	public int choix(String[] tab) {
		try {
			affichageMenu(tab);
			return saisirChoix(tab.length);
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	public static void main(String[] args) {
		menu menu = new menu();
		String[] Combobox = {"Choix 1", "Choix 2", "Choix 3", "Choix 4", "Choix 5"};
		System.out.println(menu.choix(Combobox));
	}

}
