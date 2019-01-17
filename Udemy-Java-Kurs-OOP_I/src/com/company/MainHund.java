package com.company;

public class MainHund {

  public static void main(String[] args) {

    // R1: Datentyp variablenName = new Konstruktor(Parameterwerte); // Generates an object of the class Hund.
    // R2: With the variable name we access the object "bello". Using the .-operator we can access everything
    // (variables and methods) in this object.
    Hund bello = new Hund(4, "Bello", "Hovawarth");
    bello.bellen();
    // MERKE: In der OOP sollten Methoden immer von Objekten aufgerufen werden, wie im obigen Beispiel: bello.bellen()
    // Grund: In der Methoden wird mit Variablen-Werten eines Objekts gearbeitet.

    Hund klara = new Hund(5, "Klara", "Hovawarth");
    klara.bellen();
  }


}
