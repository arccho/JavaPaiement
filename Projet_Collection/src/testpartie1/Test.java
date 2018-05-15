package testpartie1;

import java.util.ArrayList;
import java.util.Scanner;

import programme1.Etudiant;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> listeNotes = new ArrayList<Integer>();
		ArrayList<Integer> listeCoefficients = new ArrayList<Integer>();
		Etudiant.AjouterNote(listeNotes, listeCoefficients, 12, 1);
		Etudiant.AjouterNote(listeNotes, listeCoefficients, 14, 1);
		Etudiant.AjouterNote(listeNotes, listeCoefficients, 9, 1);
		Etudiant.AfficherNotes(listeNotes, listeCoefficients);
		System.out.println(Etudiant.CalculerMoyenne(listeNotes, listeCoefficients));
		
		Etudiant.AjouterNote(listeNotes, listeCoefficients, 13, 1);
		Etudiant.AfficherNotes(listeNotes, listeCoefficients);
		System.out.println(Etudiant.CalculerMoyenne(listeNotes, listeCoefficients));
		
		
		Scanner sc = new Scanner(System.in);
		int saisie = 0;
		while(saisie != 5) {
			System.out.println("Menu principal\n Saisir:\n 1 pour ajouter une note\n 2 pour afficher toutes les notes\n "
					+ "3 pour changer une note\n 4 pour calculer la moyenne\n 5 pour quitter le programme");
			try {
				saisie = sc.nextInt();
				int nouvelleNote;
				int ancienneNote;
				int coefficient;
			
				switch(saisie) {
					case 1:
						System.out.println("Saisir la note:");
						nouvelleNote = sc.nextInt();
						System.out.println("Saisir son coefficient:");
						coefficient = sc.nextInt();
						Etudiant.AjouterNote(listeNotes, listeCoefficients, nouvelleNote, coefficient);
						break;
					case 2:
						Etudiant.AfficherNotes(listeNotes, listeCoefficients);
						break;
					case 3:
						System.out.println("Saisir la note à modifier:");
						ancienneNote = sc.nextInt();
						System.out.println("Saisir la note nouvelle note:");
						nouvelleNote = sc.nextInt();
						Etudiant.ChangerNote(listeNotes, ancienneNote, nouvelleNote);
						break;
					case 4:
						Etudiant.CalculerMoyenne(listeNotes, listeCoefficients);
						break;			
				}
			} catch (Exception e) {
				System.out.println("Une erreur a été levée:\n" + e.getMessage());
				saisie = 0;
				sc.next();
			}
		}
	}

	
}
