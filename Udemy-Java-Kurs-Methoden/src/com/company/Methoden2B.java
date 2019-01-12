package com.company;

public class Methoden2B {
  public static void main(String[] args) {

/** METHODE
 * <Modifikator Rückgabedatentyp Methodenname ( Datentyp Parameter1, Datentyp Parameter2 )>
 *
 * Ein Modifikator gibt den Sichtbereich der Methode an, es gibt public, private und protected.
 *
 * MERKE: Eine Methode erledigt eine bestimmte Aufgabe!
 *
 * ACHTUNG: Eine Methode (Funktion) kann nicht in einer anderen Methode (Funktion) erstellt werden!
 */

//    for (int i = 0; i <= 10; i++)
//      System.out.println("Gegner Nr. " + i + ": ")erstelleGegner();

    erstelleGegner("Peter", 100);
    erstelleGegner("Olaf", 80);

  }

  // void = leer
  // return = Rückgabe


//  public static void erstelleGegner() {
//    String gegenerName = "Olaf";
//    int gegenerLeben = 100;
//    System.out.println("Gegner wurde erstellt.");
//  }

  public static void erstelleGegner(String name, int lebenspunkte) {
    String gegnerName = name;
    int gegnerLeben = lebenspunkte;
    System.out.println("Gegner wurde erstellt: " + gegnerName + ", Lebenspunkte: " + gegnerLeben);

    /** ERKLÄRUNG:
     * Wenn wir die Methode erstelleGegner in der main-Methode aufrufen, können wir Parameter übergeben, welche in
     * dieser Methode verarbeitet/genutzt werden können. Die Parameter werden innerhalb der runden Klammern
     * (Parameterliste) übergeben und müssen den Typen entsprechen, die in der Methoden-Definition für die jeweiligen
     * Parameter festgelegt sind.
     *
     * Hier in dieser Methode können die Parameter "name" und "lebenspunkte" übergeben werden. Ersterer ist ein String,
     * der letztere eine Ganzzahl (int). Die Werte, welche mit diesen Parametern übergeben werden, werden im
     * Anweisungsblock verwendet: Sie werden zuerst den Variablen "gegnerName" und "gegnerLeben" zugewiesen. Danach
     * werden die Inhalte dieser Parameter in der Konsole ausgegeben.
     *
     */
  }


}
