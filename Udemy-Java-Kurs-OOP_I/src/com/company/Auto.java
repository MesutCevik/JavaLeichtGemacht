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

  /** EIGENSCHAFTEN BZW. ATTRIBUTE
   * Die in einer Klasse deklarierten Variablen stellen die Eigenschaften/Attribute von Objekten dar, die anhand dieser
   * Klasse erzeugt werden.
   * Da diese Variablen erst dann erzeugt werden, wenn ein Objekt von dieser Klasse generiert wurde, nennt man sie auch
   * OBJEKTVARIABLEN.
   *
   * In der Programmierung nennent man Eigenschaften von z.B. Klassen auch Attribute.
   *
   */
  // Eine KLASSENVARIABLE überlebt auch ohne ein Objekt, sie lebt schon bei der Klassendefinition. Diese Art von
  // Variablen nennt man auch GLOBALE VARIABLEN. Ihr Wert steht allen Objekten genauso zur Verfügung. Beispiel folgt:
  static int reifenAnzahl = 4;

  int reifen;
  int preis;
  String marke;

  // Wenn wir in einer Klasse keinen Konstruktur definieren, dann erstellt Java einen Standard Konstruktor
  // im Hintergrund. Dann können trotz fehlen eines Konstruktors Opjekte von der Klasse erstellt werden, wenn die
  // Klasse an anderer Stelle im Projekt oder Programm aufgerufen wird.

  /** A. STANDARD-KONSTRUKTOR (KONSTRUKTOR OHNE PARAMETER)
   * MERKE: Der Konstruktor initialisiert ein Objekt mit Werten. Also es erzeugt ein Objekt mit Anfangswerten.
   * Java erstellt für jede Klasse automatisch einen Basis-Konstruktor, falls kein anderer Konstruktor definiert ist.
   * Wenn aber ein Konstruktor (normalerweise mit Parametern) definiert wird, dann wird Java diesen berücksichtigen.
   * Hier ist der Basis-Konstruktor explizit zu Anschauungszwecken definiert, obwohl weiter unten ein weiterer
   * Konstruktor für die Klasse "Auto" definiert ist, welcher aber beim Aufrufen Parameterwerte benötigt.
   */
  public Auto(){

  }

  /** B. KONSTRUKTOR MIT PARAMETERN:
   * Mit einem Konstruktor werden Objekte erzeugt und dabei die Eigenschaften / Attribute mit konkreten
   * Werten befüllt.
   * Der Konstruktor hat Parameter definiert, welche Werte für die in der Klasse festgelegten Variablen
   * (Eigenschaften / Attribute) annehmen und an ein erstelltes Objekt übergeben können.
   * Diese Parameter dienen dazu, beim Aufrufen des Konstruktors die mitgegebenen Parameterwerte in die Variablen eines
   * konkreten Objekts zu übergeben.
   *
   * Beispiel:
   * Mit dem individuellen Konstruktor von der Klasse "Auto" können wir Objekte erstellen. Beim Aufrufen
   * des Konstruktors müssen Parameterwerte für reifen, preis und marke übergeben werden. Nach dem das Objekt erstellt
   * wurde, werden den Variablen (Eigenschaften / Attributen) dieses Objekts die Parameterwerte übergeben. Dies
   * erfolgt mit dem "this"-Schlüsselwort, gefolgt von dem Punkt-Operator und dem Variablennamen.
   *
   * Das heißt, um ein Objekt von der Klasse Auto zu erstellen, muss dieser Konstruktor aufgerufen und ihm
   * die festgelegten Parameter übergeben werden. Erst wenn alle erforderlichen Parameterwerte übergeben wurden,
   * erstellt dieser Konstruktor mit diesen Werten ein Objekt generieren.
   *
   * Der folgende Konstruktor muss in der Main-Methode mit Parameterwerten aufgerufen werden, damit ein Objekt erzeugt
   * wird. Dabei müssen zu allen Paramatern Werte übergeben werden, welche in der Klasse für diesen Konstruktor
   * festgelegt wurden.
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


  /** KLASSENMETHODE -->> static
   * Diese Methoden brauchen kein Objekt, um bereitgestellt und ausgeführt zu werden. Klassenmethoden werden mit dem
   * Schlüsselwort "static" versehen. Sie können mit dem Namen eines generierten Objekts (wie üblich) aufgerufen werden.
   * Sie können auch allein mit dem Klassennamen aufgerufen werden. Beispiel: Auto.ausgabe();
   * Normalerweise so: bmw.ausgabe();
   *
   * Das bedeutet, wenn man eine Methode mit dem Schlüsselwort "static" definiert, dann ist diese Methode ohne ein
   * Objekt überlebensfähig. Sie steht also immer bereit und kann ausgeführt werden.
   * Klassenmethoden stehen allen Objekten, die anhand dieser Klasse erzeugt werden, zur Verfügung und führen immer
   * denselben Code/dieselben Aufgaben mit denselben Werten aus.
   */
  public static void ausgabe(){
    System.out.println("Ich bin eine Klassenmethode und brauche kein Objekt.");
  }

  /** METHODEN
   * Die in einer Klasse definierten Methoden nennt man OBJEKTMETHODEN!
   * Da diese Methoden erst dann erzeugt werden, wenn ein Objekt von dieser Klasse generiert wurde, nennt man sie auch
   * OBJEKTMETHODEN.
    */

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
