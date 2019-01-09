package com.company;

public class Aufgabe2 {
  public static void main(String[] args){

    /*
    * Aufgabe:
    *
    * 1. Auto kostet: 3500
    * 2. Auto kostet: 2340,48
    *
    * 1. Daten in Variablen abspeichern.
    * 2. Kommazahl umwandeln zu einer Ganzzahl.
    * 3. Beide Ganzzahlen zu einem Gesamtbetrag verrechnen.
    * 4. Gesamtbetrag ausgeben mit Hilfe von System.out.println("").
    *
     */

    int auto1 = 3500;
    double auto2 = 2340.48;
    int gesamtbetragAutos;

    int auto2Ganzzahl = (int)auto2;
    gesamtbetragAutos = auto1 + auto2Ganzzahl;
    System.out.println("Gesamtbetrag für beide Autos: "+gesamtbetragAutos+" EUR.");

  }
}
