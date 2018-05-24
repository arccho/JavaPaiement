package ex1;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListeChainee {

	public static LinkedList<String> CreerListe() {
		return new LinkedList<String>();
	}
	
	public static void AjouterElement(LinkedList<String> liste, String element) {
		liste.add(element);
	}
	
	public static void AfficherListe(LinkedList<String> liste) {
		System.out.println("Contenu liste chainée:");
		for(int i=0; i < liste.size(); i++) {
			System.out.print(liste.get(i) + "\t");
		}
		System.out.println();
	}
	
	public static void AfficherListeDepuisPosition(LinkedList<String> liste, int position) {
		if (position < 0 || position >= liste.size())
			throw new InvalidParameterException("Paramètre position inférieur à 0 ou plus grand que l'élément max de la liste");
		else {
			System.out.println("Contenu liste chainée à partir de la position " + position + ":");
			for(int i=position; i < liste.size(); i++) {
				System.out.print(liste.get(i) + "\t");
			}
			System.out.println();
		}
	}
	
	public static void AfficherListeInverse(LinkedList<String> liste) {
		System.out.println("Contenu liste chainée inversé:");
		for(int i=liste.size()-1; i > -1; i--) {
			System.out.print(liste.get(i) + "\t");
		}
		System.out.println();
	}
	
	public static void AjouterElement(LinkedList<String> liste, String element, int position) {
		if (position < 0 || position >= liste.size())
			throw new InvalidParameterException("Paramètre position inférieur à 0 ou plus grand que l'élément max de la liste");
		else {
			liste.add(position, element);
		}
	}
	
	public static void InsererElementsTeteQueue(LinkedList<String> liste, String elementTete, String elementQueue) {
		liste.addFirst(elementTete);
		liste.addLast(elementQueue);
	}
	
	public static void AjouterPlusieursElements(LinkedList<String> liste, ArrayList<String> ensembleElements, ArrayList<Integer> ensemblePositions) {
		if(ensembleElements.size() != ensemblePositions.size())
			throw new InvalidParameterException("L'ensemble d'éléments à ajouter doit être de même taille que l'ensemble des positions");
		else {
			for(int i=0; i < ensemblePositions.size(); i++) {
				if (ensemblePositions.get(i) < 0 || ensemblePositions.get(i) >= liste.size())
					throw new InvalidParameterException("Au moins une valeur dans l'ensemble des positions est inférieur à 0 ou plus grand que la position max de la liste");
			}
				///	FIN verifs	///
			for(int i=0; i < ensemblePositions.size(); i++) {
				liste.add(ensemblePositions.get(i), ensembleElements.get(i));
			}
		}
	}
	
	public static void AfficherListeAvecPosition(LinkedList<String> liste) {
		for(int i = 0; i < liste.size(); i++) {
		      System.out.println("Élément à la position " + i + " = " + liste.get(i));
		  }
	}

	public static boolean VerifierElement(LinkedList<String> liste, String element) {
		if(liste.indexOf(element) == -1)
			return false;
		else
			return true;
	}
	
	public static void SupprimerElement(LinkedList<String> liste, String element) {
		liste.remove(element);
	}
	
	public static void SupprimerPremierElement(LinkedList<String> liste, String element) {
		liste.removeFirst();
	}
	
	public static void PermuterElements(LinkedList<String> liste, String element1, String element2) {
		int position1 = liste.indexOf(element1);
		int position2 = liste.indexOf(element2);
		if(position1 == -1 || position2 == -1) {
			throw new InvalidParameterException("Au moins un des elements n'existe pas dans la liste");
		}
		Collections.swap(liste, position1, position2);
	}
	
	public static void MelangerElements(LinkedList<String> liste) {
		Collections.shuffle(liste);
	}
	
	public static LinkedList<String> DuppliquerListe(LinkedList<String> liste) {
		return new LinkedList<String>(liste);
	}
	
	public static String RecupererPremierElement(LinkedList<String> liste) {
		return liste.getFirst();
	}
	
	public static String RecupererDernierElement(LinkedList<String> liste) {
		return liste.getLast();
	}
	
	public static void RemplacerElement(LinkedList<String> liste, String element, int position) {
			liste.set(position, element);
	}
	
	public static ArrayList<String> ConversionArrayList(LinkedList<String> liste) {
		return new ArrayList<String>(liste);
	}
	
	public static boolean VerifierListeVide(LinkedList<String> liste) {
		if (liste.size() == 0)
			return true;
		else
			return false;
	}
	
	public static boolean ComparerListesIdentiques(LinkedList<String> liste1, LinkedList<String> liste2) {
		return liste1.equals(liste2);
	}
}
