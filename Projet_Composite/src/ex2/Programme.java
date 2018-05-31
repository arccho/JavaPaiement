package ex2;

import java.awt.Color;

import ex2.Stylo.Couleur;

public class Programme {

	public static void main(String[] args) {
		Stylo s1 = new Stylo("ref_s1", "stylo noir B2", "WaterTruc", 100, Couleur.Noir);
		Stylo s2 = new Stylo("ref_s2", "stylo noir B2", "WaterTruc", 100, Couleur.Noir);
		Stylo s3 = new Stylo("ref_s3", "stylo noir B2", "WaterTruc", 100, Couleur.Noir);
		Stylo s4 = new Stylo("ref_s4", "stylo noir B2", "WaterTruc", 100, Couleur.Noir);
		Stylo s5 = new Stylo("ref_s5", "stylo noir B2", "WaterTruc", 100, Couleur.Noir);
		Stylo s6 = new Stylo("ref_s6", "stylo noir B2", "WaterTruc", 100, Couleur.Noir);
		Stylo s7 = new Stylo("ref_s7", "stylo noir B2", "WaterTruc", 100, Couleur.Noir);
		Stylo s8 = new Stylo("ref_s8", "stylo noir B2", "WaterTruc", 100, Couleur.Noir);
		Stylo s9 = new Stylo("ref_s9", "stylo noir B2", "WaterTruc", 100, Couleur.Noir);
		Stylo s10 = new Stylo("ref_s10", "stylo noir B2", "WaterTruc", 100, Couleur.Noir);
		
		LotArticle lot1 = new LotArticle("ref_l1", 20);
		lot1.add(s1);
		lot1.add(s2);
		lot1.add(s3);
		lot1.add(s4);
		lot1.add(s5);
		lot1.add(s6);
		lot1.add(s7);
		lot1.add(s8);
		lot1.add(s9);
		lot1.add(s10);
		
		System.out.println("Nom= " + lot1.getNom() + "\n"
							+ "Marque= " + lot1.getMarque() + "\n"
							+ "PrixUnitaireLot= " + lot1.getPrixUnitaire());
		
		try {
			RamettePapier r1 = new RamettePapier("ref_r1", "100 copies blanches A4", "marqueR", 50, 80);
			lot1.add(r1);
			System.out.println("Nom= " + lot1.getNom() + "\n"
					+ "Marque= " + lot1.getMarque() + "\n"
					+ "PrixUnitaireLot= " + lot1.getPrixUnitaire());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
