package com.company;

public class AufbauEinesArrays {

  public static void main(String[] args) {

    /** Variablen Deklaration
     * So deklariert man eine Variable: Datentyp Name = Wert;
     */
    int zahl = 50;
    double zahl1 = 34.34;


    // Array Deklaration
    // Zeile 1: So deklariert man einen Array: Datentyp[] Name = new Datentyp[Anzahl]
    // Zeile 2 ff.: So weist man einem Array-Feld einen Wert zu: Name[Index des Feldes] = Wert
    int[] zahlenArray = new int[7];
    zahlenArray[3] = 0; // An der Index-Position 3 der VAR zahlenArray speichere den Wert 30 (vom Typ int).
    zahlenArray[5] = 500;
    zahlenArray[0] = 40;

    // MERKE

    /** ARRAY ERSTELLEN - VARIANTE 1
     * Zuerst einen Array deklarieren (mit Datentyp und Variablennamen). Dabei wird auch die Datenstruktur festgelegt,
     * d.h. die Menge der Felder wird angegeben, in denen Daten gespeichert werden sollen.
     * Danach werden konkrete Werte den einzelnen Feldern der Array-Datenstruktur direkt zugewiesen. Nach dem Variablen-
     * Namen des Arrays wird direkt in [] die Indexposition des Feldes angegeben, in die ein Wert zugewiesen wird.
     * Der zugewiesene Wert steht rechts vom Zuweisungsoperator '=' ohne Klammern.
     *
     * 1. Zeile deklariert nur den Array, welcher Daten (Werte) vom Typ int speichern kann und eine Aufnahmekapazität
     * für 7 Werte hat.
     * 2. Zeile und ff. weisen über den angegebenen Index dem Array jeweils einzelne Werte zu.
     * Erinnere: '=' ist der Zuweisungsoperator, der alles, was auf seiner rechten Seite steht
     * der VAR auf der linken Seite zuweist.
     */

    double[] zahlenArray1 = new double[7]; // Hier nur das Array erstellt/deklariert.
    zahlenArray1[1] = 34.23; // Ab hier werden jeweils Werte zugewiesen.
    zahlenArray1[4] = 50.45;
    zahlenArray1[6] = 0.98;
    System.out.println("Der fünfte Wert: " + zahlenArray1[4]);

    /** ARRAY ERSTELLEN - VARIANTE 2
     * Einen Array deklarieren und gleichzeitig Daten (Werte) zuweisen. Die Werte werden rechts vom Zuweisungsoperator
     * '=' in geschweifte Klammern {} geschrieben. Dabei erfolgt die Zuweisung in der gewünschten (Index-)Reihenfolge.
     * Bei dieser Variante wird die Datenstruktur des Arrays automatisch festgelegt, entsprechend der Anzahl und
     * Reihenfolge der zugewiesenen Werte.
     *
     * 1. Zeile deklariert einen Array vom Datentyp String und gibt der Variable, in der die Werte gespeichert werden
     * sollen, den Namen "personA". Rechts vom Zuweisungsoperator '=' werden in geschweifte Klammern sowie in der
     * gewünschten (Index-)Reihenfolge die Strings angegeben. Die Datenstruktur dieses String-Arrays hat 3 Felder.
     */

    // Datenstruktur der VAR personA: Index 0 = "Peter", Index 1 = "Müller", Index 2 = "35".
    String[] personA = {"Peter", "Müller", "35"};
    System.out.println("Name: " + personA[0]);

    // Zugriff auf einen Wert in einem Array:
    // Name[Index des gewünschten Werts]
  }
}
