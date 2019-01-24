package com.company;

public class BMW extends Auto {

  // EINGENSCHAFTEN / ATTRIBUTE
  boolean xDrive;




  // KONSTRUKTOR
  public BMW(int ps, int tuerenAnzahl, String fahrzeugTyp, boolean xDrive) { // Konstruktor mit definierten Parametern, über die Werte übernommen werden. Beim Aufruf des Konstruktors müssen zu allen Parametern Werte übergeben werden.
    super("BMW", ps, tuerenAnzahl, fahrzeugTyp); // // Parameterwerte an die Superklasse übergeben. Ruft den Konstruktor der Superklasse auf und übergibt dessen Konstruktor diese Parameterwerte.
    this.xDrive = xDrive;
  }

  /** Besonderheit beim ersten Parameter "marke".
   * Wir wollen beim erzeugen eines Objekts mit dem BMW-Konstruktor im Parameter "marke" immer den Wert "BMW" setzen.
   * Dazu löschen wir in Z1 den Paramet (mit Datentyp-Angabe) und in Z2 gebem wir zum Schlüsselwort "super" einen
   * festen Wert für den Parameter "marke": "BMW".
   * Damit stellen wir sicher, dass jedes mal, wenn ein BMW-Objekt erstellt wird, als Parameter "marke" der Wert BMW steht.   *
   */

  // METHODEN

  @Override
  public void starten() {
    super.starten(); // Eine Methode in der Superklasse aufrufen: Hier die Methode "starten" aufrufen, welcher ausgibt: "Das Auto startet."
    System.out.println("Nämlich der BMW startet.");
  }
}
