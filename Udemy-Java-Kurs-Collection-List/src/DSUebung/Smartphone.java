package DSUebung;

import java.util.*;

public class Smartphone {

  // EIGENSCHAFTEN / ATTRIBUTE
  private List<Kontakt> meineKontakte; // List "meineKontaket" wird nur deklariert, aber nicht initialisiert!

  // KONSTRUKTOREN
  public Smartphone() {
    meineKontakte = new ArrayList<Kontakt>(); // List "meineKontaket" wird nun als eine neue ArrayList initialisiert!
  }

  // METHODEN
  public boolean addKontakt(Kontakt neuerKontakt) {
    for (Kontakt kontaktInListe : meineKontakte) {
      if (neuerKontakt.getName().equals(kontaktInListe.getName())) {
        System.out.println("Kontakt ist bereits vorhanden!");
        return false;
      }
    }
    this.meineKontakte.add(neuerKontakt);
    System.out.println("Kontakt wurde hinzugefügt!");
    return true;
  }

  /**
   * Erklärung für addKontakt()-Methode:
   * Z1: "kontakt" ist der Name des Parameters, der in die Methode einen Wert (ein Objekt vom Typ Kontakt) übergibt!
   * Z2: for-each-loop: Für jedes Element aus "meineKontakte" führe den folgenden Anweisungsblock aus. Speichere dabei
   * jedes Element in der Variable (hier Objekt vom Typ Kontakt) "kontaktInListe" zwischen.
   * Z3: Falls Name im Objekt "neuerKontakt" (getName()) gleich dem Namen in "kontaktInListe" (getName()) entspricht,
   * dann führe den folgenden Anweisungsblock aus.
   * Z4: Gebe in der Konsole den Text aus: "Kontakt ...".
   * Z5: Gib als boolean Wert "false" zurück ("Hey, das hat nicht geklappt!") Mit dem return an dieser Stelle verlassen
   * wir die foreach-Schleife und damit die addKontakt()-Methode!!! Andernfalls wird der for-each-loop zu Ende iteriert
   * und dann geht das Programm die restlichen Anweisungen durch.
   */

  public boolean findKontakt(String gesuchterName) {
    for (Kontakt kontaktInListe : meineKontakte) {
      if (gesuchterName.equals(kontaktInListe.getName())) {
        System.out.println("Gefunden ... Name: " + kontaktInListe.getName() + ", Telefonnummer: " + kontaktInListe.getTelefonNummer() + ".");
        return true;
      }
    }
    System.out.println("Gesuchter Name " + gesuchterName + " ist nicht vorhanden!");
    return false;
  }

  public boolean findTelNummer(String gesuchteTelNummer) {
    for (Kontakt kontaktInListe : meineKontakte) {
      if (gesuchteTelNummer.equals(kontaktInListe.getTelefonNummer())) {
        System.out.println("Gefunden ... Telefonummer " + gesuchteTelNummer + " gehört dem " + kontaktInListe.getName() + ".");
        return true;
      }
    }
    System.out.println("Gesuchte Telefonnummer " + gesuchteTelNummer + " ist nicht vorhanden!");
    return false;
  }

  public void ausgabe() {
    for (Kontakt kontaktInListe : meineKontakte) {
      System.out.println("Name: " + kontaktInListe.getName() + ", Telefonnummer: " + kontaktInListe.getTelefonNummer() + ".");
    }
  }
}
