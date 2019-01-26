package com.company;

public class Auto {

  // EIGENSCHAFTEN / ATTRIBUTE
  String autoMarke;
  Reifen reifen;


  // STANDARD-KONSTRUKTOR
  public Auto() {

  }

  // A) INDIVIDUELLER-KONSTRUKTOR
  public Auto(String autoMarke, Reifen reifen) {
    this.autoMarke = autoMarke;
    this.reifen = reifen;
  }

  // B) INDIVIDUELLER-KONSTRUKTOR
  public Auto(String autoMarke, String reifenMarke, String reifenTyp) {
    this.autoMarke = autoMarke;
    reifen = new Reifen(reifenMarke, reifenTyp);
  }

  // METHODEN
  public String ausgabeDaten() {
    String sb = "Automarke: " + this.autoMarke + ", Reifenmarke: " + this.reifen.reifenMarke + ", Reifentyp: " + this.reifen.reifenTyp;
    return sb;
  }

}
