package com.company;

public abstract class Samsung {

  // EINGENSCHAFTEN / ATTRIBUTE
  private double preis;
  private String produktTyp;

  // KONSTRUKTOREN
  public Samsung(){

  }

  public Samsung(double preis, String produktTyp) {
    super();
    this.setPreis(preis);
    this.setProduktTyp(produktTyp);
  }

  /**
   * Oben rufen wir die Setter-Methoden auf, statt einer normalen Zuweisung der Parameterwerte zu den korospondierenden
   * Variablen. Dadurch umgehen wir die Setter-Methoden nicht und stellen mit deren Nutzung sicher, dass in die
   * Variablen der Objekte nur die Werte zugewiesen werden, die von den Settern zugewiesen werden.
   *
   */

  // METHODEN UND METHODENSIGNATUREN
  public double getPreis() {
    return preis;
  }

  public void setPreis(double preis) {
    this.preis = preis;
  }

  public String getProduktTyp() {
    return produktTyp;
  }

  public void setProduktTyp(String produktTyp) {
    this.produktTyp = produktTyp;
  }
}
