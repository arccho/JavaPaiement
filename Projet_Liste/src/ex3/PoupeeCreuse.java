package ex3;

public class PoupeeCreuse implements Poupee{

	private ListeDePoupees listePoupees;
	private int taille;
	private boolean open;
	
	public PoupeeCreuse(int taille, boolean open) {
		this.taille = taille;
		this.open = open;
		listePoupees = new ListeDePoupees();
	}
	
	public void add(Poupee p)
    {
		listePoupees.add(p);
    }

    public void remove(Poupee p)
    {
    	listePoupees.remove(p);
    }
    
    public void ouvrir() {
    	open = true;
    }
    
    public void fermer() {
    	open = false;
    }
    
	@Override
	public boolean isOpen() {
		return open;
	}

	@Override
	public int getTaille() {
		return taille;
	}

	@Override
	public boolean isEmpty() {
		return listePoupees.isEmpty();
	}
}
