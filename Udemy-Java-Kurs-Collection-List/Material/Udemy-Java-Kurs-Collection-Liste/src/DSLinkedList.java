import java.util.*;

public class DSLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Datenstruktur erstellen
		List<Integer> liste = new ArrayList<Integer>();

		// Dateneingabe
		for (int i = 0; i < 10000000; i++) {
			liste.add(i);
		}

		// Zeit messen
		final long timeStart = System.currentTimeMillis();
		DSLinkedList.getZahl(1999999, liste);
		final long timeEnd = System.currentTimeMillis();
		System.out.println("Das Suchen hat gedauert: " + (timeEnd - timeStart) + " Millisek.");
	}

	// get - Methode
	public static void getZahl(int index, List<Integer> liste) {
		System.out.println(liste.get(index));
	}

}
