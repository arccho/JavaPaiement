package testpartie2;

import java.util.ArrayList;

import programme2.Ensemble;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> ensembleImpair = Ensemble.CreerSingleton(11);
		Ensemble.AjouterElement(ensembleImpair, 1);
		Ensemble.AjouterElement(ensembleImpair, 3);
		Ensemble.AjouterElement(ensembleImpair, 5);
		Ensemble.AjouterElement(ensembleImpair, 7);
		Ensemble.AfficherEnsemble(ensembleImpair);
		
		ArrayList<Integer> ensemblePair = Ensemble.CreerSingleton(12);
		Ensemble.AjouterElement(ensemblePair, 2);
		Ensemble.AjouterElement(ensemblePair, 4);
		Ensemble.AjouterElement(ensemblePair, 6);
		Ensemble.AjouterElement(ensemblePair, 8);
		Ensemble.AfficherEnsemble(ensemblePair);
		
		ArrayList<Integer> ensembleComplet= Ensemble.UnionEnsembles(ensembleImpair, ensemblePair);
		Ensemble.AfficherEnsemble(ensembleComplet);

		ArrayList<Integer> ensembleVide= Ensemble.IntersectionEnsembles(ensembleImpair, ensemblePair);
		Ensemble.AfficherEnsemble(ensembleVide);
	}

}
