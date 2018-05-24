package ex1;

public class Programme {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		
		Ligne l1 = new Ligne();
		Ligne l2 =new Ligne();
		
		Cercle c1 = new Cercle();
		Cercle c2 = new Cercle();
		
		CompositeFigure cf1 = new CompositeFigure();
		cf1.add(p1);
		cf1.add(p2);
		cf1.add(c1);
		cf1.add(c2);
		
		CompositeFigure cf2 = new CompositeFigure();
		cf2.add(l1);
		cf2.add(l2);
		cf2.add(cf1);
		cf2.Dessiner();
		
		cf2.remove(cf1);
		cf2.Dessiner();
	}

}
