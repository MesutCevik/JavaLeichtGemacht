package com.company;

/** JEDE KLASSE ERBT VON DER KLASSE "OBJECT" ATTRIBUTE UND METHODEN!!!
 * ALSO: Eigentlich steht in der Zeile unte: public class Auto extends Object { }
 * Ob wir das hinschreiben oder nicht, spielt keine Rolle. In Java ist das Standard.
 * Wegen der Erbschaft von "Object" sehen wir beim aufrufen von Methoden auch Variablen und Methoden von Object.
 */

public class Auto extends Object  {

  // EINGENSCHAFTEN / ATTRIBUTE
  String marke;
  int ps;
  int tuerenAnzahl;
  String fahrzeugTyp;


  // KONSTRUKTOREN

  public Auto(String marke, int ps, int tuerenAnzahl, String fahrzeugTyp) {
    super();
    this.marke = marke;
    this.ps = ps;
    this.tuerenAnzahl = tuerenAnzahl;
    this.fahrzeugTyp = fahrzeugTyp;
  }


  // METHODEN
  public void starten(){
    System.out.println("Das Auto startet.");
  }
}