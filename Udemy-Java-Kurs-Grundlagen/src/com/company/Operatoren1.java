package com.company;

public class Operatoren1 {

  public static void main(String[] args) {
    // Was sind Operatoren?
    /*
    * Mit Operatoren kann man Variablen verändern oder allgemein mit ihnen arbeiten.
    */

    int varZahl = 5;

    int zahl1 = 10;
    int zahl2 = 5; // Hier deklarieren wir eine Variable und gleichzeitig initialisieren wir es,
    // in dem wir ihm einen initialen Wert zuweisen.

    int ergebnis; // Hier deklarieren wir eine Variable.

    ergebnis = zahl1 + zahl2; // 15
    System.out.println(ergebnis);

    ergebnis = zahl1 - zahl2; //5
    System.out.println(ergebnis);

    ergebnis = zahl1 * zahl2; //50
    System.out.println(ergebnis);

    ergebnis = zahl1 / zahl2; //2
    System.out.println(ergebnis);

    varZahl++; // 6
    System.out.println(varZahl);
    varZahl++; // 7
    System.out.println(varZahl);

    varZahl--; // 6
    System.out.println(varZahl);
    varZahl--; // 5
    System.out.println(varZahl);

    int lebenGegner = 100;
    int geschossEnergie = 20;

    lebenGegner = lebenGegner - 20; // 80
    System.out.println(lebenGegner);

    // Zuweisungsoperator

    // Subtraktionszuweisungsoperator: -=
    lebenGegner -= geschossEnergie;
    System.out.println("Leben Gegener: "+lebenGegner);

    // Additionszuweisungsoperator: +=
    lebenGegner += geschossEnergie;
    System.out.println("Leben Gegener: "+lebenGegner);




  }
}
