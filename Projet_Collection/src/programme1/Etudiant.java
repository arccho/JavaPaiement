package programme1;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Etudiant {
	
	public static void AjouterNote(ArrayList<Integer> listeNotes, ArrayList<Integer> listeCoefficients, int note, int coefficient) {
		if (listeNotes.size() != listeCoefficients.size())
			throw new InvalidParameterException("Les deux listes doivent être de même taille");
		else {
			listeNotes.add(note);
			listeCoefficients.add(coefficient);
		}
	}
	
	public static void AfficherNotes(ArrayList<Integer> listeNotes, ArrayList<Integer> listeCoefficients) {
		if (listeNotes.size() != listeCoefficients.size())
			throw new InvalidParameterException("Les deux listes doivent être de même taille");
		else {
			System.out.println("Ensemble de notes:");
			for (int i = 0; i < listeNotes.size(); i++) {
				System.out.print(listeNotes.get(i) + "\t");
			}
			System.out.println("\nCoefficients:");
			for (int i = 0; i < listeCoefficients.size(); i++) {
				System.out.print(listeCoefficients.get(i) + "\t");
			}
			System.out.println();
		}
	}
	
	public static float CalculerMoyenne(ArrayList<Integer> listeNotes, ArrayList<Integer> listeCoefficients) {
		if (listeNotes.size() != listeCoefficients.size())
			throw new InvalidParameterException("Les deux listes doivent être de même taille");
		else {
			int MontantNote = 0;
			int totalCoefficient = 0;
			for (int i = 0; i < listeNotes.size(); i++) {
				MontantNote += listeNotes.get(i) * listeCoefficients.get(i);
				totalCoefficient += listeCoefficients.get(i);
			}
			return (float)MontantNote/totalCoefficient;
		}
	}
	
	public static void ChangerNote(ArrayList<Integer> listeNotes, int ancienneNote, int nouvelleNote) {
		int index = listeNotes.indexOf(ancienneNote);
		if(index == -1)
			throw new InvalidParameterException("La note " + ancienneNote + " n'existe pas dans la liste");
		else
			listeNotes.set(index, nouvelleNote);
	}
}
