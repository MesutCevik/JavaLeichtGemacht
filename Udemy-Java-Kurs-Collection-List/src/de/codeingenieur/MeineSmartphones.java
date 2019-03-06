package de.codeingenieur;

import DSUebung.Kontakt;
import DSUebung.Smartphone;

public class MeineSmartphones {

  public static void main(String[] args) {

    // Erstelle ein neues Smartphone Objekt! Deklaration + Initialisierung.
    // Beim Ausführen des Konstruktors Smartphone() wird eine Liste "meineKontakte" vom Typ "Kontakte" erstellt.
    Smartphone iPhone6 = new Smartphone();

    // "erstelleKontakt" ist eine Klassenmethode und kann ohne das Erstellen eines Objekts von der Klasse, in der es
    // definiert ist, aufgerufen werden. Es wird über den Namen der Klasse aufgerufen: Kontakt.erstelleKontakt().
    iPhone6.addKontakt(Kontakt.erstelleKontakt("Mesut", "0151987544"));
    iPhone6.addKontakt(Kontakt.erstelleKontakt("Hatice", "0151932675782"));
    iPhone6.addKontakt(Kontakt.erstelleKontakt("Emre", "017253345678"));
    iPhone6.addKontakt(Kontakt.erstelleKontakt("Elif", "01646543789"));
    iPhone6.addKontakt(Kontakt.erstelleKontakt("Frank", "016878652398"));

    // Bisher gelernter Weg, um ein Objekt von einer Klasse mit Werten zu erzeugen:
    // Ein Kontakt-Objekt erstellen mit dem Kontakt-Konstruktor und alle Parameterwerte übergeben.
    // Danach dieses Objekt in das andere Objekt einfügen.
    Kontakt frank = new Kontakt("Frank", "016878652398");
    iPhone6.addKontakt(frank);

    iPhone6.ausgabe();

    System.out.println("Suchen: ");
    iPhone6.findKontakt("Frank");

  }
}
