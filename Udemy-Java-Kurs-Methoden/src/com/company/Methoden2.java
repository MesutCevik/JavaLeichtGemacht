package com.company;

public class Methoden2 {

  public static void main(String[] args) {

/** METHODE
 * <Modifikator Rückgabedatentyp Methodenname ( Datentyp Parameter1, Datentyp Parameter2 )>
 *
 * Ein Modifikator gibt den Sichtbereich der Methode an, es gibt public, private und protected.
 *
 * MERKE: Eine Methode erledigt eine bestimmte Aufgabe!
 *
 * ACHTUNG: Eine Methode (Funktion) kann nicht in einer anderen Methode (Funktion) erstellt werden!
 *
 */

    // Manuelle-Methode um 5 Gegener zu erstellen:
    // Jeder Gegener muss einzeln als Code geschrieben werden.
//    String gegnerName = "Olaf";
//    int gegenerLeben = 100;
//
//    String gegnerName2 = "Peter";
//    int gegenerLeben2 = 100;
//
//    String gegnerName3 = "Mario";
//    int gegenerLeben3 = 100;
//
//    String gegnerName4 = "Bowser";
//    int gegenerLeben4 = 100;
//
//    String gegnerName5 = "Luigi";
//    int gegenerLeben5 = 100;

    /** Nachteil dieser Methode: Sehr aufwändig.
     *
     * Lösung:
     * Eine Methode schreiben, die immer einen Gegner erstellt. Dann können wir immer wieder
     * diese Methode aufrufen, um einen weitere Gegner zu erstellen.
     */

    for (int i = 0; i <= 10; i++) {
      erstelleGegner();
    }
  }

  public static void erstelleGegner() {
    String gegnerName = "Olaf";
    int gegnerLeben = 100;
    System.out.println("Gegner wurde erstellt.");
  }
}
