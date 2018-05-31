package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		LinkedList<String> uneliste = new LinkedList<String>();
		ListeChainee.AjouterElement(uneliste, "premier");
		ListeChainee.AjouterElement(uneliste, "deuxi�me");
		ListeChainee.AjouterElement(uneliste, "troisi�me");
		
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
						System.out.println("Saisir un �l�ment");
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
						System.out.println("Saisir un �l�ment puis une position");
						ListeChainee.AjouterElement(l_list, sc.next(), sc.nextInt());
						break;
					case 7:
						System.out.println("Saisir deux �l�ments");
						ListeChainee.InsererElementsTeteQueue(l_list, sc.next(), sc.next());
						break;
					case 8:
						System.out.println("Saisir le nombre d'�l�ment � ajouter");
						int nb = sc.nextInt();
						ArrayList<String> listeVal = new ArrayList<String>();
						ArrayList<Integer> listePos = new ArrayList<Integer>();
						System.out.println("Saisir " + nb + " �l�ments � ajouter");
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
						System.out.println("Saisir un �l�ment � v�rifier");
						if(ListeChainee.VerifierElement(l_list, sc.next())) {
							System.out.println("Element dans la liste");
						}
						else {
							System.out.println("Element pas dans la liste");
						}
						break;
					case 11:
						System.out.println("Saisir un �l�ment � supprimer");
						ListeChainee.SupprimerElement(l_list, sc.next());
						break;
					case 12:
						System.out.println("Saisir le premier �l�ment � supprimer");
						ListeChainee.SupprimerPremierElement(l_list, sc.next());
						break;
					case 13:
						System.out.println("Saisir les deux �l�ments � permuter");
						ListeChainee.PermuterElements(l_list, sc.next(), sc.next());
						break;
					case 14:
						ListeChainee.MelangerElements(l_list);
						break;
					case 15:
						uneliste = ListeChainee.DuppliquerListe(l_list);
						break;
					case 16:
						System.out.println("Le premier �l�ment est " + ListeChainee.RecupererPremierElement(l_list));
						break;
					case 17:
						System.out.println("Le dernier �l�ment est " + ListeChainee.RecupererDernierElement(l_list));
						break;
					case 18:
						System.out.println("Saisir un �l�ment puis une position");
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
						System.out.println("Le nombre saisie ne correspond � aucune commande");
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
	        	 System.out.println("!!! Une exception a �t� lev�e !!!\tretour au menu principal");
	        	 infomenu();
			}
	      }
		 sc.close();
	}
	
	public static void infomenu() {
		 System.out.println(
					"===============================\n"
					+ "Operations sur listes chain�es\n"
					+ "===============================\n"
					+ "0 quitter le programme\n"
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
					+ "19 convertir une liste cha�n�e en ArrayList\n"
					+ "20 v�rifier si une liste est vide\n"
					+ "21 comparer deux listes"
		);
	}

}
