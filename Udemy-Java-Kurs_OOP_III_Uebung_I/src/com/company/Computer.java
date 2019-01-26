package com.company;

public class Computer {

  // EINGENSCHAFTEN / ATTRIBUTE
  String cpu;
  Mainboard mainboard; // Die indiv. definierte Klasse Mainboard ist hiermit der Klasse Computer bekannt.
  int preis;

  // KONSTRUKTOREN
  // A) STANDARD-KONSTRUKTOR
  public Computer(){

  }

  // B) INDIVIDUELLER-KONSTRUKTOR
  public Computer(String cpu, Mainboard mainboard, int preis) {
    this.cpu = cpu; // this.<Attribut> = <Parameter>
    this.mainboard = mainboard;
    this.preis = preis;
  }

  // C) INDIVIDUELLER-KONSTRUKTOR
  public Computer(int ramSlots, int kartenSlots, int usbPorts, String cpu, int preis) {
    mainboard = new Mainboard(ramSlots, kartenSlots, usbPorts);
    this.cpu = cpu;
    this.preis = preis;
  }

  // METHODEN
  // In dieser Klasse sind keine Methoden definiert.

}

/** zu c) INDIVIDUELLER-KONSTRUKTOR
 * Diesem Konstruktor werden als Parameterwerte einerseits Werte für die primitiven Variabeln cpu und preis übergeben.
 * Andererseits werden auch Parameterwerte für ein weiteres Objekt - dem Mainboard - übergeben.
 * Denn ein Objekt, welcher mit diesem Konstruktor erstellt wird, hat ein anderes Objekt, das Mainboard.
 *
 */


// EINGENSCHAFTEN / ATTRIBUTE
// KONSTRUKTOREN
// METHODEN


