package chaine.test;

import chaine.emission.DivertissementFiction;
import chaine.emission.PlannificationDivertissement;
import chaine.emission.PlannificationFiction;
import chaine.emission.PlannificationReportage;
import chaine.emission.Reportage;
import chaine.emission.TypeReportage.Documentaire;

public class test {

	public static void main(String[] args) {
		Reportage r = new Reportage("ReportageGoSleeeeeeeeeeeeeep", Documentaire.Animalier);
		r.SetInfosPlannification(new PlannificationReportage(5));
		Reportage r2 = new Reportage("reportageEnnuyant2", Documentaire.Culturel);
		System.out.println(r.getDuree());
		System.out.println(r2.getTheme());
		
		DivertissementFiction DivFicRediff = new DivertissementFiction("Rediff", 4, 2001, "Realisateur1", true);
		DivFicRediff.SetInfosPlannification(new PlannificationFiction(3));
		
		System.out.println(DivFicRediff.getDuree());
		System.out.println(DivFicRediff.getHeureMinimumPlannification());
		System.out.println(DivFicRediff.getHeureMaximumPlannification());

		
		
		DivertissementFiction dFictionDirect = new DivertissementFiction("EnDirect", 3, 2001, "Realisateur2", false);
		dFictionDirect.SetInfosPlannification(new PlannificationDivertissement());
		System.out.println(dFictionDirect.getDuree());
		dFictionDirect.SetInfosPlannification(new PlannificationFiction(3));
		
		System.out.println(dFictionDirect.getDuree());
		System.out.println(dFictionDirect.getHeureMinimumPlannification());
		System.out.println(dFictionDirect.getHeureMaximumPlannification());

	}

}
