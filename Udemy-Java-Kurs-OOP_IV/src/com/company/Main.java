package com.company;

public class Main {

  public static void main(String[] args) {

    /** Held-Objekt 1:
     * Z1: Erstelle ein neues Held-Objekt mit dem Standardkonstruktor, da kein indiv. Konstruktor definiert wurde.
     * Z2: Da wir keinen indiv. Konstruktor definiert haben, welcher unsere VAR mit Werten befüllt, gehen wir hier in
     * player1 rein und weißen der VAR lebenspunkte einen Wert hinzu; wir initialisieren es mit einem Anfangswert.
     *
     *     Held player1 = new Held();
     *     player1.lebenspunkte = 100;
     *     System.out.println("Der Held player1 hat " + player1.getLebenspunkte() + " Lebenspunkte.");
     */


     /** Held-Objekt 2:
     * Z2: Angenommen, bei der Erzeugung eines Held-Objekts (player2) würde der User den Wert für lebenspunkte
     * festlegen. Wenn der User aber eine negative Zahl dafür eingibt, entsteht ein logischer Fehler. Es können keine
     * negativen Lebenspunkte geben.
     * Wie kann man solche sinnlosen Eingaben des Users verhindern?  >> Zugriffsmodifikator auf private setzen!!!
     *
     * Held player2 = new Held(-100);
     * player2.lebenspunkte = -100;
     * System.out.println("Der Held player2 hat " + player2.getLebenspunkte() + " Lebenspunkte.");
     */


    // Held-Objekt 3:
    Held player3 = new Held(46);
    player3.getLebenspunkte();

    int schaden = 10;

    player3.setLebenspunkte(schaden);


    GoogleKonto peter = new GoogleKonto("peter123", "1234");

    peter.setPasswort("1234");






  }
}
