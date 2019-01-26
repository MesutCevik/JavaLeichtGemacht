package com.company;

public class Laptop {

  // EIGENSCHAFTEN / ATTRIBUTE
  String marke;
  int ram;
  String cpu;
  double preis;


  // KONSTRUKTOREN
  public Laptop(String marke, int ram, String cpu, double preis){
    this.marke = marke;
    this.ram = ram;
    this.cpu = cpu;
    this. preis = preis;
  }

  // METHODEN
  public void starten(){
    System.out.println("Ich bin ein Laptop!");
  }

}

// EIGENSCHAFTEN / ATTRIBUTE
// KONSTRUKTOREN
// METHODEN


/** AUFGABE - Teil 2
 * 1. Überschreibe die Methode starten() aus der Klasse Laptop.
 *
 * 2. Die Methode starten() soll dann die Ausgabe "MacBook startet!" ausgeben.
 *
 * 3. Erstelle ein Objekt (Namen: macBook) vom Typ MacBook (Werte: Apple, 8GB, Intel i5, 1200€)
 *
 * 4. Rufe die Methode starten() dann über das Objekt auf.
 */


/** AUFGABE - Teil 1
 * 1. Erstelle die Klasse Laptop und MacBook.
 *
 * 2. Erstelle in der Klasse Laptop einen Konstruktor der die Parameter übernehmen kann.
 *
 * 3. Erstelle in der Klasse MacBook einen Konstruktor der mit Hilfe des Schlüsselwortes *** den Konstruktor von Laptop
 * aufruft.
 */