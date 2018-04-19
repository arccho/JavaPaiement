package entreprise.paie;


import java.util.ArrayList;
import java.util.List;

import entreprise.employee.*;
import entreprise.salaire.*;

public class Paie {

	public static void main(String[] args) {
		List<Employe> ListeEmployes = new ArrayList<Employe>();
		
		Commercial e1 = new Commercial("Com1", 31, "0123456789");
		e1.setInfosSalaire(new SalaireCommercial(20_000));
		Commercial e2 = new Commercial("Com2", 40, "1234567890");
		e2.setInfosSalaire(new SalaireCommercial(30_000));

		Ouvrier e3 = new Ouvrier("Ouv1", 22, "2345678901");
		e3.setInfosSalaire(new SalaireOuvrier(40));
		Ouvrier e4 = new Ouvrier("Ouv2", 48, "3456789012");
		e4.setInfosSalaire(new SalaireOuvrier(35));
		Ouvrier e5 = new Ouvrier("Ouv3", 33, "4567890123");
		e5.setInfosSalaire(new SalaireOuvrier(45));
		
		Cadre e6 = new Cadre("Cad1", 54, "5678901234");
		e6.setInfosSalaire(new SalaireCadre(38));
		
		Collaborateur e7 = new Collaborateur("Coll1", 62, "6789012345");
		e7.setInfosSalaire(new SalaireCollaborateur(40, 15_000));
		
		ListeEmployes.add(e1);
		ListeEmployes.add(e2);
		ListeEmployes.add(e3);
		ListeEmployes.add(e4);
		ListeEmployes.add(e5);
		ListeEmployes.add(e6);
		ListeEmployes.add(e7);
		
		for (int boucle =0; boucle < ListeEmployes.size(); boucle++) {
			ListeEmployes.get(boucle).afficherSalaire();
		}
		
	}

}
