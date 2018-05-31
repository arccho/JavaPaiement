package ex3;

public class PoupeePleine implements Poupee {

	private int taille;
	
	public PoupeePleine(int taille) {
		this.taille = taille;
	}
	
	@Override
	public int getTaille() {
		return taille;
	}
	
	@Override
	public boolean isOpen() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

}
