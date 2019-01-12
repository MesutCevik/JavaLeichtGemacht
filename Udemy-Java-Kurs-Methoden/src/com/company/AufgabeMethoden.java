package com.company;

/**
 * Aufgabe:
 * 1. Wert: 3.547, 2. Wert: 6.357
 *
 * Definiere (erstelle) eine Methode, die als Aufgabe hat, diese zwei Werte zu multiplizieren.
 * Diese Werte sollen dabei als Parameter an die Methode übergeben werden.
 *
 * Der errechnete Wert soll dabei zurück gegeben werden, so dass wir den Wert in der Konsole ausgeben können.
 */

public class AufgabeMethoden {

  public static void main(String[] args) {

    // Definition der Variablen.
    double zahl1 = 3.547;
    double zahl2 = 6.354;

    // Aufrufen der Methode.
    double ergebnis = multiplikationsRechner(zahl1, zahl2);
    System.out.println("Das Ergebnis der Multiplikation (das Produkt): " + ergebnis);

  }

  // Definition der Methode.
  public static double multiplikationsRechner(double zahl1, double zahl2) {
    double ergebnis = zahl1 * zahl2;

    return ergebnis;
  }
}
