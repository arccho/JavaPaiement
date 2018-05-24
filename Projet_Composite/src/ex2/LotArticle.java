package ex2;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class LotArticle implements Article {

	private float pourcentageReduction;
	
	private ArrayList<Article> ListeEnfantsArticle = new ArrayList<Article>();
	
	public LotArticle(float reduction) {
		pourcentageReduction = reduction;
	}
	
    public void add(Article article)
    {
    	if (ListeEnfantsArticle.isEmpty()) {
    		ListeEnfantsArticle.add(article);
    	}
    	else if (ListeEnfantsArticle.get(0).getMarque().equals(article.getMarque()) 
    			&& ListeEnfantsArticle.get(0).getNom().equals(article.getNom()) 
    			&& ListeEnfantsArticle.get(0).getReference().equals(article.getReference()))
    		ListeEnfantsArticle.add(article);
    	else
    		throw new InvalidParameterException("L'article à ajouter n'est pas le même que ceux du lot.\n"
    				+ "Il ne peut donc pas être ajouté");
    }

    public void remove(Article article)
    {
    	ListeEnfantsArticle.remove(article);
    }

	@Override
	public String getReference() {
		if (ListeEnfantsArticle.isEmpty())
			return "aucune reference";
		else
			return ListeEnfantsArticle.get(0).getReference();
	}

	@Override
	public String getNom() {
		if(ListeEnfantsArticle.isEmpty())
			return "Lot vide";
		else {
			return "Lot de " + ListeEnfantsArticle.size() + " " + ListeEnfantsArticle.get(0).getNom();
		}
	}

	@Override
	public String getMarque() {
		if (ListeEnfantsArticle.isEmpty())
			return "aucune marque";
		else
			return ListeEnfantsArticle.get(0).getMarque();
	}

	@Override
	public float getPrixUnitaire() {
		float total = 0;
		for (Article article : ListeEnfantsArticle) {
			total += article.getPrixUnitaire();
		}
		return total - total * (pourcentageReduction / 100);
	}
}
