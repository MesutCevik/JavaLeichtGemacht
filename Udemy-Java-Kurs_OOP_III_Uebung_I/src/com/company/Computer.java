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


}

// EINGENSCHAFTEN / ATTRIBUTE
// KONSTRUKTOREN
// METHODEN


