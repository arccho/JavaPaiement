package ex1;

public class Cercle implements Figure {

	@Override
	public void Dessiner() {
		System.out.println("dessiner cercle");
	}

	@Override
	public void Translation(int x, int y) {
		System.out.println("translater cercle");
	}

}
