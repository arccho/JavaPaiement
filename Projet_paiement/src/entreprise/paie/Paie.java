package entreprise.paie;


import java.util.ArrayList;
import java.util.List;

import entreprise.employee.*;

public class Paie {

	public static void main(String[] args) {
		List<Employe> ListeEmployes = new ArrayList<Employe>();
		
		ListeEmployes.add(new Commercial("Com1", 31, "0123456789"));
		ListeEmployes.add(new Commercial("Com2", 31, "0123456789"));

		ListeEmployes.add(new Ouvrier("Ouv1", 31, "0123456789"));
		ListeEmployes.add(new Ouvrier("Ouv2", 31, "0123456789"));
		ListeEmployes.add(new Ouvrier("Ouv3", 31, "0123456789"));
		
		ListeEmployes.add(new Collaborateur("Coll1", 31, "0123456789"));
	}

}
