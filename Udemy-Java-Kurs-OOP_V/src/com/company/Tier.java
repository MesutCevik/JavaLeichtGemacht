package com.company;

// SUPERKLASSE / ELTERNKLASSE

public abstract class Tier {


  // EINGENSCHAFTEN / ATTRIBUTE
  // Diese Eigenschaften haben alle Tierarten.
  String name;
  int gewicht;
  int groesse;


  // KONSTRUKTOREN
  public Tier(){

  }

  public Tier(String name, int groesse, int gewicht) {
    this.name = name;
    this.groesse = groesse;
    this.gewicht = gewicht;
  }

  // METHODEN
  public abstract void essen();

  // Ein Tier soll atmen (was es tun soll), aber wir beschreiben nicht, wie es atmen soll (nicht wie).
  // Nachfolgend haben wir nur einen Methodenkopf festgelegt, aber keinen Code-Block hinzugefügt.
  public abstract void atmen();

  public String getName(){
    return name;
  }
}
