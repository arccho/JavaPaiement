package ex3;

import java.util.LinkedList;

public class ListeDePoupees extends LinkedList<Poupee> {
	
	private LinkedList<Poupee> listeP;
	
	public ListeDePoupees() {
		listeP = new LinkedList<Poupee>();
	}
	
	@Override
	public boolean add(Poupee p) {
		if(listeP.isEmpty()) {
			listeP.addLast(p);
			return true;
		}
		else if (listeP.getLast().getTaille() < p.getTaille() && p.isOpen() && p.isEmpty()) {
			listeP.addLast(p);
			return true;
		}
		else {
			return false;
		}
	}

}
