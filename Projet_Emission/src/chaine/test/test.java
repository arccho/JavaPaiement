package chaine.test;

import chaine.emission.Divertissement;
import chaine.emission.DivertissementFiction;
import chaine.emission.Fiction;
import chaine.emission.PlannificationDivertissement;
import chaine.emission.PlannificationFiction;
import chaine.emission.PlannificationReportage;
import chaine.emission.Reportage;
import chaine.emission.TypeReportage.Documentaire;
import chaine.programme.Programme;

public class test {

	public static void main(String[] args) {
		Reportage reportageAnimal = new Reportage("Reportage Environnement", Documentaire.Animalier);
		reportageAnimal.SetInfosPlannification(new PlannificationReportage(2));
		Reportage reportageCulturel = new Reportage("Reportage Guerre de Cent Ans", Documentaire.Culturel);
		reportageCulturel.SetInfosPlannification(new PlannificationReportage(2));
		//System.out.println(r.getDuree());
		//System.out.println(r2.getTheme());
		
		DivertissementFiction DivFicRediff = new DivertissementFiction("Rediff", 4, 2001, "Realisateur1", true);
		DivFicRediff.SetInfosPlannification(new PlannificationFiction(3));
		
		//System.out.println(DivFicRediff.getDuree());
		//System.out.println(DivFicRediff.getHeureMinimumPlannification());
		//System.out.println(DivFicRediff.getHeureMaximumPlannification());

		
		
		DivertissementFiction dFictionDirect = new DivertissementFiction("EnDirect", 3, 2001, "Realisateur2", false);
		dFictionDirect.SetInfosPlannification(new PlannificationDivertissement());
		//System.out.println(dFictionDirect.getDuree());
		dFictionDirect.SetInfosPlannification(new PlannificationFiction(3));
		
		//System.out.println(dFictionDirect.getDuree());
		//System.out.println(dFictionDirect.getHeureMinimumPlannification());
		//System.out.println(dFictionDirect.getHeureMaximumPlannification());
		
		Fiction SerieAnimé = new Fiction("Rick et Morty", 2015, "realisateur3", false);
		SerieAnimé.SetInfosPlannification(new PlannificationFiction(4));
		
		Divertissement manga = new Divertissement("OnePiece");
		manga.SetInfosPlannification(new PlannificationDivertissement());
		Fiction Serie = new Fiction("Serie Seigneur des anneaux", 2003, "realisateur4", true);
		Serie.SetInfosPlannification(new PlannificationFiction(10));
		
		Programme programme = new Programme();
		programme.ajouterEmission(reportageAnimal);
		programme.ajouterEmission(reportageCulturel);
		programme.ajouterEmission(DivFicRediff);
		programme.ajouterEmission(dFictionDirect);
		programme.ajouterEmission(SerieAnimé);
		programme.ajouterEmission(manga);
		programme.ajouterEmission(Serie);
		programme.afficherProgramme();

	}

}
