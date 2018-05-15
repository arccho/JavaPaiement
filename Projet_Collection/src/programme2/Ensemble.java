package programme2;

import java.util.ArrayList;

public class Ensemble {

	public static ArrayList<Integer> CreerSingleton(int element) {
		ArrayList<Integer> singleton = new ArrayList<Integer>();
		singleton.add(element);
		return singleton;
	}
	
	public static void AjouterElement(ArrayList<Integer> singleton, int element) {
		if(singleton.indexOf(element) == -1)
			singleton.add(element);
	}
}
