package ex1;

public class Ligne implements Figure {

	@Override
	public void Dessiner() {
		System.out.println("dessiner ligne");
	}

	@Override
	public void Translation(int x, int y) {
		System.out.println("translater ligne");
	}

}
