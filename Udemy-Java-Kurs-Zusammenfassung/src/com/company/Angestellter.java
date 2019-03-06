package com.company;

public class Angestellter {

  // EIGENSCHAFTEN / ATTRIBUTE
  private int id;
  private String name;
  private int geburtsJahr;

  // KONSTRUKTOR für Objekte dieser Klasse
  public Angestellter(int id, String name, int geburtsJahr){
    this.id = id;
    this.name = name;
    this.geburtsJahr = geburtsJahr;
  }

  // GETTER- UND SETTER-METHODEN
  // Diese Methoden brauchen wir, damit die Comparator-Klassen für die Sortierung der "Angestellter"-Objekte auf diese
  // Eigenschaften zugreifen können.
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGeburtsJahr() {
    return geburtsJahr;
  }

  public void setGeburtsJahr(int geburtsJahr) {
    this.geburtsJahr = geburtsJahr;
  }

  //TOSTRING-METHODE


  @Override
  public String toString() {
    return "id = " + id + ", name = " + name + ", geburtsJahr = " + geburtsJahr;
  }
}
