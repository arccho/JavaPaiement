package programme2;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;

public class Ensemble {

	public static ArrayList<Integer> CreerSingleton(int element) {
		ArrayList<Integer> singleton = new ArrayList<Integer>();
		singleton.add(element);
		return singleton;
	}
	
	public static void AjouterElement(ArrayList<Integer> singleton, int element) {
		if(singleton.indexOf(element) == -1) {
			singleton.add(element);
			Collections.sort(singleton);
		}		
		else
			throw new InvalidParameterException("L'element existe déja dans l'ensemble");
	}
	
	public static void AfficherEnsemble(ArrayList<Integer> singleton) {
		System.out.println("Contenu de l'ensemble:");
		for (int i = 0; i < singleton.size(); i++) {
			System.out.print(singleton.get(i) + "\t");
		}
		System.out.println();
	}
	
	public static ArrayList<Integer> UnionEnsembles(ArrayList<Integer> singleton1, ArrayList<Integer> singleton2) {
		ArrayList<Integer> nouvelEnsemble = new ArrayList<Integer>(singleton1);
		for(int i=0; i < singleton2.size(); i++) {
			if(nouvelEnsemble.indexOf(singleton2.get(i)) == -1)
				nouvelEnsemble.add(singleton2.get(i));
		}
		Collections.sort(nouvelEnsemble);
		return nouvelEnsemble;
	}
	
	public static ArrayList<Integer> IntersectionEnsembles(ArrayList<Integer> singleton1, ArrayList<Integer> singleton2) {
		ArrayList<Integer> nouvelEnsemble = new ArrayList<Integer>();
		for(int i=0; i < singleton1.size(); i++) {
			if(singleton2.indexOf(singleton1.get(i)) != -1)
				nouvelEnsemble.add(singleton1.get(i));
		}
		Collections.sort(nouvelEnsemble);
		return nouvelEnsemble;
	}
	
	public static boolean ElementDansEnsemble(ArrayList<Integer> singleton, int element) {
		if(singleton.indexOf(element) == -1)
			return false;
		else
			return true;
	}
	
	public static int NombreElementDansEnsemble(ArrayList<Integer> singleton) {
		return singleton.size();
	}
}
