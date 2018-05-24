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
					+ "Operations sur listes chainées\n"
					+ "==============================="
					+ "0 quitter le programme\n "
					+ "1 créer une liste vide\n"
					+ "2 ajouter un element à une liste\n"
					+ "3 afficher tous les éléments d'une liste\n"
					+ "4 afficher tous les éléments d'une liste depuis une position\n"
					+ "5 afficher tous les éléments d'une liste dans le sens inverse\n"
					+ "6 ajouter un éléments d'une liste à une position donnée\n"
					+ "7 inserer deux éléments en tête et en queue dans une liste\n"
					+ "8 inserer plusieurs éléments dans une liste à des positions spécifiques\n"
					+ "9 afficher tous les éléments d'une liste avec leurs positions\n"
					+ "10 verifier si un élément appartient à une liste\n"
					+ "11 supprimer un élément d'une liste\n"
					+ "12 supprimer le premier élément d'une liste\n"
					+ "13 permuter deux éléments d'une liste\n"
					+ "14 mélanger les éléments d'une liste\n"
					+ "15 duppliquer une liste\n"
					+ "16 récupérer le premier élément d'une liste\n"
					+ "17 récupérer le dernier élément d'une liste\n"
					+ "18 remplacer un élément d'une liste suivant une position\n"
					+ "19 vérifier si une liste est vide\n"
					+ "20 comparer deux listes\n"
					);
			try {
				saisie = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Une erreur a été levée:\n" + e.getMessage());
				saisie = 0;
				sc.next();
			}
		}
	}

}
