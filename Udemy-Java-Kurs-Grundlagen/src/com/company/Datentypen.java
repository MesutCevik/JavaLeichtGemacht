package com.company;

public class Datentypen {
  public static void main(String[] args) {
    // write your code here
    System.out.println("Datentypen!");

    /* Primitive Datentypen:
     * Für primitive Datentypen kann nur ein Wert in einer Variable zugewiesen werden.
     * ... für Ganzzahlen:
     * byte
     * short
     * int
     * long
     *
     * ... für Flieskommazahlen:
     * double
     * float
     *
     * ... für Boolean:
     * boolean
     *
     * ... für Zeichen:
     * char
     *
     * declaration: <Datentyp> <Variablen-Name>;
     * initialization: <Variablen-Name> = <Wert>;
     * declaration and initilization together: <Datentyp> <Variablen-Name> = <Wert>;
     *
     * '=' >> Zuweisungsoperator
     * Das Zeichen '=' ist ein Operator, mit der ein Wert einer Variable zugewiesen wird.
     * Der Zuweisungsoperator weist den Wert auf seiner rechten Seite der Variable auf seiner
     * linken Seite zu.
     */

    // Ganzzahlen jeweils einer Variable zuweisen.
    int number = 45; // Am häufigsten verwendet.
    long number2 = 923;

    // Flieskommezahlen/Dezimalzahlen jeweils einer Variable zuweisen.
    double number3 = 7483.13; // Am häufigsten verwendet.
    float number4 = 3978.54f;

    // Boolean einer Variable zuweisen.
    boolean userClick= true;

    // Zeichen einer Variable zuweisen.
    char zeichen = 'a';


    // Beispiele für die Veränderung der Werte einer Variable zur Laufzeit eines Programms:
    int highscoreSpieler1 = 0; // Eine Variable deklarieren und einen Initialwert zuweisen.
    System.out.println("Aktueller Highscore Spieler1: "+highscoreSpieler1);

    highscoreSpieler1 = 10; // Einer vorhandenen Variable einen neuen Wert zuweisen.
    System.out.println("Aktueller Highscore Spieler1: "+highscoreSpieler1);

    highscoreSpieler1 = 30;
    System.out.println("Aktueller Highscore Spieler1: "+highscoreSpieler1);

  }

}
