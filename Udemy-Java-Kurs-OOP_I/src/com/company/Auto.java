package com.company;

// In dieser Klasse brauchen wir keine main-Methode, weil in der Klasse "Main" bereits eine main-Methode definiert ist.
// Von dort wird dieses Programm bzw. Projekt gestartet werden.

/** Hier definieren wir eine Klasse "Auto".
 * >> Komplexer Datentyp, in der mehrere Daten gespeichert werden können.
 * >> Ein Bauplan, anhand der Objekte mit bestimmten Eigenschaften generiert werden können.
 * >> Eine Klasse kann Variablen enthalten, die wir beim erstellen von Objekten nutzen und mit Werten versehen können.
 *
 *
 * Wie wird ein Objekt erstellt? Siehe in die Datei Main.class!
 */

public class Auto {

  // Variablen der Klasse Auto: Das sind die Parameter dieser Klasse.
  // Sie bestimmen die Eigenschaften eines zu erzeugenden Objekts dieser Klasse.
  // Man nennt diese Variablen auch Eigenschaften oder Attribute der Klasse.

  int reifen;
  int preis;
  String marke;

  // Wenn wir in einer Klasse keinen Konstruktur definieren, dann erstellt Java einen Standard Konstruktor
  // im Hintergrund. Dann können trotz fehlen eines Konstruktors Opjekte von der Klasse erstellt werden, wenn die
  // Klasse an anderer Stelle im Projekt oder Programm aufgerufen wird.

  /** A. STANDARD-KONSTRUKTOR (KONSTRUKTOR OHNE PARAMETER)
   * MERKE: Der Konstruktor initialisiert ein Objekt mit Werten. Mit Anfangswerten festsetzen.
   * Java erstellt für jede Klasse automatisch einen Basis-Konstruktor, falls kein anderer Konstruktor definiert ist.
   * Wenn aber ein Konstruktor (normalerweise mit Parametern) definiert wird, dann wird Java diesen berücksichtigen.
   * Hier ist der Basis-Konstruktor explizit zu Anschauungszwecken definiert, obwohl weiter unten ein weiterer
   * Konstruktor für die Klasse "Auto" definiert ist, welcher aber beim Aufrufen Parameterwerte benötigt.
   */
  public Auto(){

  }

  /** B. KONSTRUKTOR MIT PARAMETERN:
   * Mit diesem Konstruktor von der Klasse "Auto" können wir Objekte erstellen. Mit dem Aufrufen des Konstruktors
   * werden Parameterwerte übergeben werden. Dann wird beim Erstellen des Objekts dieser direkt mit Werten befüllt.
   * Die Werte werden an VAR übergeben, die in der Auto-Klasse als VAR Eigenschaften bzw. definiert wurden.
   *
   * Das heißt, um ein Objekt von der Klasse Auto zu erstellen, muss dieser Konstruktor aufgerufen und ihm
   * die festgelegten Parameter übergeben werden. Erst wenn alle erforderlichen Parameterwerte übergeben wurden,
   * erstellt dieser Konstruktor mit diesen Werten ein Objekt generieren.
   *
   * Beispiel: Dem folgenden Konstruktor müssen beim Aufrufen die Parameterwerte für reifen, preis und marke übergen
   * werden, damit ein Auto-Objekt initialisiert wird:
   */
  public Auto(int reifen, int preis, String marke){ // Diesem Konstruktor können wir Werte für die 3 VAR übergeben.
    this.reifen = reifen;
    this.preis = preis;
    this.marke = marke;
  }
  /** this
   * Das Schlüsselwort "this" veranlasst: Diese Objekt, das gerade mit dem new-Operator und dem Konstruktor erstellt
   * wurde, soll in der VAR reifen den Wert vom Parameter "reifen" erhalten/zugewiesen bekommen. Der Parameterwert
   * "reifen" wurde dem Konstruktor übergeben.
   * Also die Objekt-Variable "reifen" (links von =) soll den Parameterwert "reifen" (rechts von =) erhalten.
   *
   * BEACHTE: Der Wert in "reifen" wird nicht der Variable "reifen" in der Klassen-Definition zugewiesen.
   *
   * Anders gesagt "this": Dieses Objekt, was gerade mit dem Konstruktor erstellt wurde, soll diese Variable (reifen)
   * mit dem im Parameter "reifen" übergebenen Wert initialisiert bekommen.
   * Jede VAR in der Konstruktor-Beschreibung wird für ein einzelnes Objekt initialisiert (mit einem
   * ersten Wert befüllt), dass vom Konstruktor erstellt wird. Mit dieser Initialisierung wird nicht der oben
   * defnierten Klassenvariablen Werte zugwiesen!!!
   */


  // Methoden
  public void gasgeben(){
    System.out.println("Das Auto mit der Marke: " + this.marke + " gibt gas und fährt jetzt los.");
  }

  public void bremsen(){
    System.out.println("Das Auto mit der Marke: " + this.marke + " bremst!");
  }

  public void vergleichePreis(int preis){
    if (this.preis <= preis) {
      System.out.println("Der " + this.marke + " ist billiger.");
    } else {
      System.out.println("Der " + this.marke + " ist teurer.");
    }
  }

  /**
   * Das Schlüsselwort "this" besagt: Gehe in das Objekt, das von der Klasse Auto erstellt wurde, rein und hole von
   * der Variable "marke" den Wert raus.
   *
   * WICHTIG: In der OOP sollen Methoden immer von Objekten aufgerufen werden.
   */

}
