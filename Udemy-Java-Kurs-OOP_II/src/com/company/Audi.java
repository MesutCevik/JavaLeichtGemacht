package com.company;

public class Audi extends Auto{

  // EINGENSCHAFTEN / ATTRIBUTE
  boolean quattro;


  // KONSTRUKTOR
  public Audi(int ps, int tuerenAnzahl, String fahrzeugTyp, boolean quattro) {
    super("Audi", ps, tuerenAnzahl, fahrzeugTyp);
    this.quattro = quattro;
  }


  // METHODEN
  @Override
  public void starten() {
    super.starten();
    System.out.println("Ja und zwar ein Audi startet.");
  }

}
