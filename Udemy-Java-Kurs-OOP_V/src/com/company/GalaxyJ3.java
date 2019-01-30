package com.company;

public class GalaxyJ3 extends Samsung implements ITelefon {

  // EIGENSCHAFTEN / ATTRIBUTE


  // KONSTRUKTOR
  public GalaxyJ3(double preis, String produktTyp) {
    super(preis, produktTyp); // Übergibt die preis und produktTyp Parameter an die Superclass.
  }


  //  METHODEN (geerbte abstrakte Methoden hier implementieren, d.h. vollenden!)
  @Override
  public void powerOn() {
    System.out.println("Das GalaJ3 geht an der rechten Seite an und man muss den Power Button 3 Sekunden halten.");
  }

  @Override
  public boolean esKlingelt() {
    return false;
  }

  @Override
  public boolean anrufen() {
    return false;
  }
}
