package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		LinkedList<String> uneliste = new LinkedList<String>();
		ListeChainee.AjouterElement(uneliste, "premier");
		ListeChainee.AjouterElement(uneliste, "deuxième");
		ListeChainee.AjouterElement(uneliste, "troisième");
		
		LinkedList<String> l_list = new LinkedList<String>() ;
		Scanner sc = new Scanner(System.in);
		int saisie = -1;
		infomenu();
		while (saisie != 0 && sc.hasNext()) {
			try {
		         if (sc.hasNextInt()) {
		        	 saisie = sc.nextInt();
					 switch (saisie) {
					 case 0:
						 break;
					 case 1:
						 l_list = new LinkedList<String>();
						 break;
					case 2:
						System.out.println("Saisir un élément");
						ListeChainee.AjouterElement(l_list, sc.next());
						break;
					case 3:
						ListeChainee.AfficherListe(l_list);
						break;
					case 4:
						System.out.println("Saisir une position");
						ListeChainee.AfficherListeDepuisPosition(l_list, sc.nextInt());
						break;
					case 5:
						ListeChainee.AfficherListeInverse(l_list);
						break;
					case 6:
						System.out.println("Saisir un élément puis une position");
						ListeChainee.AjouterElement(l_list, sc.next(), sc.nextInt());
						break;
					case 7:
						System.out.println("Saisir deux éléments");
						ListeChainee.InsererElementsTeteQueue(l_list, sc.next(), sc.next());
						break;
					case 8:
						System.out.println("Saisir le nombre d'élément à ajouter");
						int nb = sc.nextInt();
						ArrayList<String> listeVal = new ArrayList<String>();
						ArrayList<Integer> listePos = new ArrayList<Integer>();
						System.out.println("Saisir " + nb + " éléments à ajouter");
						for(int boucle=0; boucle < nb; boucle++) {
							listeVal.add(sc.next());
						}
						System.out.println("Saisir les " + nb + " positions");
						for(int boucle=0; boucle < nb; boucle++) {
							listePos.add(sc.nextInt());
						}
						ListeChainee.AjouterPlusieursElements(l_list, listeVal, listePos);
						break;
					case 9:
						ListeChainee.AfficherListeAvecPosition(l_list);
						break;
					case 10:
						System.out.println("Saisir un élément à vérifier");
						if(ListeChainee.VerifierElement(l_list, sc.next())) {
							System.out.println("Element dans la liste");
						}
						else {
							System.out.println("Element pas dans la liste");
						}
						break;
					case 11:
						System.out.println("Saisir un élément à supprimer");
						ListeChainee.SupprimerElement(l_list, sc.next());
						break;
					case 12:
						System.out.println("Saisir le premier élément à supprimer");
						ListeChainee.SupprimerPremierElement(l_list, sc.next());
						break;
					case 13:
						System.out.println("Saisir les deux éléments à permuter");
						ListeChainee.PermuterElements(l_list, sc.next(), sc.next());
						break;
					case 14:
						ListeChainee.MelangerElements(l_list);
						break;
					case 15:
						uneliste = ListeChainee.DuppliquerListe(l_list);
						break;
					case 16:
						System.out.println("Le premier élément est " + ListeChainee.RecupererPremierElement(l_list));
						break;
					case 17:
						System.out.println("Le dernier élément est " + ListeChainee.RecupererDernierElement(l_list));
						break;
					case 18:
						System.out.println("Saisir un élément puis une position");
						ListeChainee.RemplacerElement(l_list, sc.next(), sc.nextInt());
						break;
					case 19:
						ArrayList<String> arrayList = ListeChainee.ConversionArrayList(l_list);
						break;
					case 20:
						if(ListeChainee.VerifierListeVide(l_list)){
							System.out.println("Liste vide");
						}
						else {
							System.out.println("Liste non vide");
						}
						break;
					case 21:
						if(ListeChainee.ComparerListesIdentiques(l_list, uneliste)) {
							System.out.println("Les deux Listes sont identiques");
						}
						else {
							System.out.println("Les deux Listes ne sont pas identiques");
						}
						break;
					default:
						System.out.println("Le nombre saisie ne correspond à aucune commande");
						break;
					}
		         }
		         else {
		        	 System.out.println("!!! Erreur de saisie !!!\tretour au menu principal");
		        	 infomenu();
		        	 sc.next();
		         }
			}
	         catch (Exception e) {
	        	 System.out.println("!!! Une exception a été levée !!!\tretour au menu principal");
	        	 infomenu();
			}
	      }
		 sc.close();
	}
	
	public static void infomenu() {
		 System.out.println(
					"===============================\n"
					+ "Operations sur listes chainées\n"
					+ "===============================\n"
					+ "0 quitter le programme\n"
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
					+ "19 convertir une liste chaînée en ArrayList\n"
					+ "20 vérifier si une liste est vide\n"
					+ "21 comparer deux listes"
		);
	}

}
