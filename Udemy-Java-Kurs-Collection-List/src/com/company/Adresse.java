package com.company;

public class Adresse {

  // EIGENSCHAFTEN / ATTRIBUTE
  private String name;
  private String strasse;
  private String stadt;

  // KONSTRUKTOR
  /** MERKE: Zugriffsmodifier der Konstruktoren müssen public sein, damit diese von anderen Klassen und Methoden,
   * aber vor allem von der main-Methode in der Main-Klasse aufgerufen werden kann.
   */
  // STANDARD-KONSTRUKTOR
  public Adresse() {

  }

  // EXPLIZITER-KONSTRUKTOR


  public Adresse(String name, String strasse, String stadt) {
    super(); // Jede Klasse erbt automatisch von der Klasse "Object".
    this.name = name;
    this.strasse = strasse;
    this.stadt = stadt;
  }

  // METHODEN
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStrasse() {
    return strasse;
  }

  public void setStrasse(String strasse) {
    this.strasse = strasse;
  }

  public String getStadt() {
    return stadt;
  }

  public void setStadt(String stadt) {
    this.stadt = stadt;
  }
}
