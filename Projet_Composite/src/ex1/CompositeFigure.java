package ex1;

import java.util.ArrayList;

public class CompositeFigure implements Figure {

    private ArrayList<Figure> ListeEnfantsFigure = new ArrayList<Figure>();
    
	@Override
	public void Dessiner() {
        for (Figure figure : ListeEnfantsFigure)
        {
        	figure.Dessiner();
        }
        System.out.println();
	}

	@Override
	public void Translation(int x, int y) {
        for (Figure figure : ListeEnfantsFigure)
        {
        	figure.Translation(x, y);
        }
	}

    public void add(Figure figure)
    {
    	ListeEnfantsFigure.add(figure);
    }

    public void remove(Figure figure)
    {
    	ListeEnfantsFigure.remove(figure);
    }
}
