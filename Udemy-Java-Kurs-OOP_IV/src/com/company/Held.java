package com.company;

public class Held {

  // EIGENSCHAFTEN / ATTRIBUTE
  public String name;
  private int lebenspunkte;

  // KONSTRUKTOR
  public Held(int lebenspunkte) {
    if(lebenspunkte <= 100 && lebenspunkte >0){ // Bedinungen, um Konstruktor auszuführen.
    this.lebenspunkte = lebenspunkte;
    } else {
      this.lebenspunkte = 90;
    }
  }

  /**
   * Die VAR lebenspunkte ist nur innerhalb dieser Klasse (Held) sichtbar. Von daher kann sie nur aus dieser Klasse
   * abgerufen werden und sein Wert verändert werden.
   * Auf der anderer Seite bewirkt "privat", dass darauf z.B. aus der Main-Klasse nicht darauf
   * zugegriffen werden kann.
   * Kein anderer Programmierer, kann auf diese VAR zugreifen und seinen Wert verändern.
    */


  // METHODEN
  /** Eine Methode hat eine Aufgabe auszuführen.
   * Da beim VAR lebenspunkte der Zugriffsmodifikator auf private gesetzt ist, können wir eine Methode definieren,
   * welcher die Aufgabe hat, den Wert von VAR lebenspunkte auszugeben.
   *
   * this.lebenspunkte:
   * Es soll der Wert der VAR lebenspunkte ausgeben, welcher dem Held-Objekt gehört, welches diese Getter-Methode aufruft.
   * Da es mehrere Held-Objekte geben kann, soll der Wert der Variable lebenspunkte dieses einen Held-Objekts
   * ausgegeben werden, der diese Methode getLebenspunkte()  aufruft.
   */

  // GETTER-METHODE >> Getter - "Holer"
  public void getLebenspunkte() {
    System.out.println(this.lebenspunkte);
  }

  // SETTER-METHODE >> Setter - "Setzer"
  public void setLebenspunkte(int schaden){
    this.lebenspunkte -= schaden; // Ziehe von den lebenspunkten den Wert der VAR schaden ab.
    System.out.println(this.lebenspunkte);

  }
}


// EIGENSCHAFTEN / ATTRIBUTE
// KONSTRUKTOR
// METHODEN
