package menu;

import java.util.Scanner;

public class menu {
	
	public static void saisirChoix(int n) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier pour effectuer la factorielle:");
		String chaineSaisie = scanner.nextLine();
	}

	public static void main(String[] args) {
		saisirChoix(10);
	}

}
