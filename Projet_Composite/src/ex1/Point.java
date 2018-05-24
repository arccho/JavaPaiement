package ex1;

public class Point implements Figure {

	@Override
	public void Dessiner() {
		System.out.println("dessiner point");
	}

	@Override
	public void Translation(int x, int y) {
		System.out.println("translater point");
	}

}
