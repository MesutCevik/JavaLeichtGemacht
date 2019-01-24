package com.company;

// SUPERKLASSE / ELTERNKLASSE

public class Tier {


  // EINGENSCHAFTEN / ATTRIBUTE
  // Diese Eigenschaften haben alle Tierarten.
  String name;
  int gewicht;
  int groesse;


  // KONSTRUKTOREN
  public Tier(String name, int groesse, int gewicht) {
    this.name = name;
    this.groesse = groesse;
    this.gewicht = gewicht;
  }

  // METHODEN
  public void essen() {
    System.out.println("Das Tier hat gegessen.");

  }

}
