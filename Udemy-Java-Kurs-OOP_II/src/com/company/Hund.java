package com.company;

/**
 * VERERBUNG mit dem Schlüsselwort extends = anbieten. (eigentlich bedeutet to extend sth. = etw. erweitern/ausdehnen):
 * Die Superklasse/Elternklasse "Tier" bietet seine Eigenschaften/Attribute den Subklassen/Kindsklassen "Hund" und
 * "Kuh"an.
 * <p>
 * SUBKLASSE / KINDSKLASSE
 * Mit dem Schlüsselwort "extends" erbt die Klasse "Hund" die Eigenschaften und Methoden von der Elternklasse "Tier".
 */

public class Hund extends Tier {

  // EINGENSCHAFTEN / ATTRIBUTE
  int zaehne;


  // KONSTRUKTOREN
  /**
   * Diese Klasse hat die Eigenschaften der Elternklasse geerbt. Daher müssen dieselben Parameter, die an den
   * Konstruktor der Elternklasse übergeben werden, auch an den Konstruktor der Klasse "Hund" übergeben werden.
   * <p>
   * Damit ein Objekt erzeugt wird, müssen die Parameterwerte an die Elterklasse "Tier" übergeben werden. Dazu setzt
   * man das Schlüsselwort "super" ein, welcher den Konstruktor der Superklasse aufruft und die genannten Variablen-
   * werte übergibt. Letzteren hatten wir die Parameterwerte übergeben.
   */
  public Hund(String name, int groesse, int gewicht, int zaehne) {
    super(name, groesse, gewicht); // Hier wird der Konstruktor der Superklasse aufgerufen.
    this.zaehne = zaehne; // Der Wert dieser Variable kommt mit dem Aufruf des Konstruktors.
  }

  // METHODEN
  public void bellen() {
    System.out.println("Wauuu, wauu, wauu, wauu, wufff wufff wuff!");
  }

  // Überschreiben einer Methode aus der Superklasse.
  // Da jedes Tier anders isst, werden wir hier die Methode "essen" aus der Superklasse anpassen bzw. überschreiben.
  @Override
  public void essen() {
    System.out.println("Der Hund muss sein Essen noch kauen.");
    super.essen(); // super kommt von der Superklasse.
  }
}

/** WEITERE NOTIZEN ZUR VEERBUNG
 * Wenn eine Subklasse (Kindsklasse) Eigenschaften von einer Superklasse (Elterklasse) erbt/bekommt, und die Superklasse
 * einen Konstruktor hat, der diese Eigenschaften mit Werten befüllt, um damit ein Objekt zu erzeugen, dann muss auch
 * der Konstruktor der Subklasse angepasst werden.
 * D.h. dem Konstruktor der Subklasse müssen Parameterwerte für die Eigenschaften übergeben werden, die von
 * der Superklasse geerbt wurden. Dies geschieht mit dem Schlüsselwort "super", welcher den Konstruktor der Superklasse
 * aufruft.
 *
 * ÜBERSCHREIBEN EINER METHODE AUS DER SUPERKLASSE
 * -->> Schlüsselwort @Override
 */