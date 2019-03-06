
import java.util.ArrayList;
import java.util.Scanner;

public class Adressbuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Objekte erstellt
		Adresse peterAdresse = new Adresse("Peter", "Fritzlangen.4", "Berlin");
		Adresse hansAdresse = new Adresse("Hans", "Berlinerstraße.6", "Leipzig");
		Adresse michaelAdresse = new Adresse("Michael", "leipzigerstraße.40", "Hamburg");

		// Datenstrukturen
		ArrayList<Adresse> adressenListe = new ArrayList<Adresse>(); // Dynamisch
		Adresse[] adressenArray = { peterAdresse, hansAdresse, michaelAdresse }; // Statisch

		// Eingabe in Liste
		adressenListe.add(peterAdresse);
		adressenListe.add(hansAdresse);
		adressenListe.add(michaelAdresse);

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String straße = scanner.nextLine();
		String stadt = scanner.nextLine();

		Adresse adresse4 = new Adresse(name, straße, stadt);
		adressenListe.add(adresse4);
		adressenArray[3] = adresse4;

		System.out.println("ArrayList");

		// Ausgabe der Liste
		for (Adresse adresse : adressenListe) {
			System.out.println(
					"Name: " + adresse.getName() + " Straße: " + adresse.getStraße() + " Stadt: " + adresse.getStadt());
		}

		System.out.println("Array");
		for (Adresse adresse : adressenArray) {
			System.out.println(
					"Name: " + adresse.getName() + " Straße: " + adresse.getStraße() + " Stadt: " + adresse.getStadt());
		}
	}
}
