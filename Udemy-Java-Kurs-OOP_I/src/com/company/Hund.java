package com.company;

public class Hund {

  // FEATURES / ATTRIBUTES (Variablen der Klasse)
  int alter;
  String name;
  String rasse;


  // CONSTRUCTOR
  // A. Standard constructor
  // Java creates automatically a standard constrctor as the following one. Once a custom constructor is defined,
  // Java will not use the standard constructor.
  public Hund() {
  }

  // B. Custom constructor (is different because of the parameters)
  public Hund(int alter, String name, String rasse) {
    this.alter = alter;
    this.name = name;
    this.rasse = rasse;
  }
  /* Explanation:
   * R1: Constructors access, constructors name (must be the same as the class name) and parameters.
   * R2: The keyword "this" means: go into the object and access the variable "alter". Assign to this variable
   * the value of the parameter "alter", which will be given with the execution of the constructor.
   * R3 + R4 the same as above.
   */

  // METHODS
  public void bellen() {
    System.out.println("Der Hund: " + this.name + " bellt.");
    /* Explanation:
     * Keyword this.name: Je nach dem welcher Hund diese Methode aufruft, soll hier der Name des aufrufenden Hundes
     * ausgegeben werden.
     * this.name: "Dieses Objekt (this), welches die Methode bellen() aufruft, hat eine Variable "name". Greife auf
     * diese VAR zu und hole dessen Wert.
     */
  }

}