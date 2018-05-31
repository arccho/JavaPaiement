package ex2;

import java.util.LinkedList;

public class MvLinkedList<Object> extends LinkedList<Object> {

	private LinkedList<Object> liste;
	
	public MvLinkedList() {
		liste = new LinkedList<Object>();
	}
	
	public void ajouteEnTete(Object o) {
		liste.addFirst(o);
	}
	
	public void ajouteEnQueue(Object o) {
		liste.addLast(o);
	}
	
	public Object get(int index) {
		return liste.get(index);
	}
}
