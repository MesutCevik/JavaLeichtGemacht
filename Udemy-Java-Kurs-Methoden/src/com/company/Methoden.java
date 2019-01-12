package com.company;

public class Methoden {

  public static void main(String[] args){

/** METHODE
 * <Modifikator Rückgabedatentyp Methodenname ( Datentyp Parameter1, Datentyp Parameter2 )>
 *
 * Ein Modifikator gibt den Sichtbereich der Methode an, es gibt public, private und protected.
 *
 *        void = leer
 *
 * ACHTUNG: Eine Methode (Funktion) kann nicht in einer anderen Methode (Funktion) erstellt werden!
 *
  */

    ausgabe();
    summe();
  }

  // MEINE ERSTE METHODE IN JAVA.
  public static void ausgabe(){

    System.out.println("Ich bin eine Methode.");
  }

  //MEINE ZWEITE METHODE IN JAVA.
  public static void summe(){
    int a, b, summe; // Deklarieren von zwei VAR, a und b.
    a = 5; // Initialisieren.
    b = 5; // Initialisieren.

    summe = a + b;
    System.out.println(summe);
  }
}
