package com.company;

public class Computer {

  // EINGENSCHAFTEN / ATTRIBUTE
  String cpu;
  Mainboard mainboard; // Die class Computer hat in seinen Eigenschaften ein anderes Objekt: mainboard.
  int preis;

  /** ERKLÄRUNG: Erinnere!
   * VAR cpu hat einen Wert gespeichert, weil es ein primitiver Datentyp ist.
   * VAR cpu hat nur eine Adresse zum Speicherort dieses Ojbjekts gespeichert, und keinen Wert. (Referenzvariable)
   */

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


