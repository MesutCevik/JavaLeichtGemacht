package com.company;

public class Computer {

  // EINGENSCHAFTEN / ATTRIBUTE
  String cpu;
  Mainboard mainboard;

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


  // METHODEN


}

// EINGENSCHAFTEN / ATTRIBUTE
// KONSTRUKTOREN
// METHODEN


