package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		ArrayList<LinkedList<String>> l_list = new ArrayList<LinkedList<String>>();
		Scanner sc = new Scanner(System.in);
		int saisie = -1;
		while(saisie != 0) {
			System.out.println(
					"==============================="
					+ "Operations sur listes chain�es\n"
					+ "==============================="
					+ "0 quitter le programme\n "
					+ "1 cr�er une liste vide\n"
					+ "2 ajouter un element � une liste\n"
					+ "3 afficher tous les �l�ments d'une liste\n"
					+ "4 afficher tous les �l�ments d'une liste depuis une position\n"
					+ "5 afficher tous les �l�ments d'une liste dans le sens inverse\n"
					+ "6 ajouter un �l�ments d'une liste � une position donn�e\n"
					+ "7 inserer deux �l�ments en t�te et en queue dans une liste\n"
					+ "8 inserer plusieurs �l�ments dans une liste � des positions sp�cifiques\n"
					+ "9 afficher tous les �l�ments d'une liste avec leurs positions\n"
					+ "10 verifier si un �l�ment appartient � une liste\n"
					+ "11 supprimer un �l�ment d'une liste\n"
					+ "12 supprimer le premier �l�ment d'une liste\n"
					+ "13 permuter deux �l�ments d'une liste\n"
					+ "14 m�langer les �l�ments d'une liste\n"
					+ "15 duppliquer une liste\n"
					+ "16 r�cup�rer le premier �l�ment d'une liste\n"
					+ "17 r�cup�rer le dernier �l�ment d'une liste\n"
					+ "18 remplacer un �l�ment d'une liste suivant une position\n"
					+ "19 v�rifier si une liste est vide\n"
					+ "20 comparer deux listes\n"
					);
			try {
				saisie = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Une erreur a �t� lev�e:\n" + e.getMessage());
				saisie = 0;
				sc.next();
			}
		}
	}

}
