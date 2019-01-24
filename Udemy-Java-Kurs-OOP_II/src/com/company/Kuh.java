package com.company;

// VERERBUNG mit dem Schlüsselwort extends = anbieten

// SUBKLASSE / KINDSKLASSE
// Mit dem Schlüsselwort "extends" erbt die Klasse "Hund" die Eigenschaften und Methoden von der Elternklasse "Tier".

public class Kuh extends Tier {

  // EINGENSCHAFTEN / ATTRIBUTE
  int hufe;

  // KONSTRUKTOREN
  public Kuh(String name, int groesse, int gewicht, int hufe){
    super (name, groesse, gewicht); // Hier wird der Konstruktor der Superklasse aufgerufen beim erstellen eines Objekts Kuh.
    this.hufe = hufe;
  }

  @Override
  public void essen() {
    super.essen();
    System.out.println("Die Kuh muss das Essen immer wieder kauen.");
  }

  // METHODEN

}

