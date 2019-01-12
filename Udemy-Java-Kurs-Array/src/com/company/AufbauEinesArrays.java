package com.company;

public class AufbauEinesArrays {

  public static void main(String[] args) {

    /** Variablen Deklaration
     * So deklariert man eine Variable: Datentyp Name = Wert;
     */
    int zahl = 50;
    double zahl1 = 34.34;


    // Array Deklaration
    // So deklariert man einen Array: Datentyp[] Name = new Datentyp[Anzahl]
    int[] zahlenArray = new int[7];
    zahlenArray[3] = 0; // An der Position 3 den Wert 30 speichern. Der Wert des Inhalts vom Typ int.
    zahlenArray[5] = 500;
    zahlenArray[0] = 40;

    /** 1. MÖGLICHKEIT UM EINEN ARRAY ZU ERSTELLEN
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

    /** 2. MÖGLICHKEIT UM EINEN ARRAY ZU ERSTELLEN
     * Einem Array sofort nach der Deklaration Werte zuweisen.
     * Die Eingabe der Werte erfolgt direkt nach dem Zuweisungsoperator '=' in {} und in der gewünschten
     * (Index-)Reihenfolge.
     */

    // Datenstruktur der VAR personA: Index 0 = "Peter", Index 1 = "Müller", Index 2 = "35".
    String[] personA = {"Peter", "Müller", "35"};
    System.out.println("Name: " + personA[0]);

    // Zugriff auf einen Wert in einem Array:
    // Name[Index des gewünschten Werts]
  }

}
