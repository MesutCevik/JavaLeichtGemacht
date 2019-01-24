package com.company;

/** HAT-BEZIEHUNG VON KLASSEN BZW. OBJEKTEN
 * "Computer hat einen Mainbord." ODER "Ein Objekt der Klasse "Computer" hat ein Objekt der Klasse "Mainboard".
 * Computer und Mainbord stehen in Beziehung zueinander.
 *
 * ASSOZIATION: Ein Objekt kennt ein anderes Objekt.
 */

public class Mainboard {

  // EINGENSCHAFTEN / ATTRIBUTE
  int ramSlots;
  int kartenSlots;
  int usbPorts;

  // KONSTRUKTOREN
  public Mainboard() { // FN1

  }

  public Mainboard(int ramSlots, int kartenSlots, int usbPorts) { // FN2
    this.ramSlots = ramSlots;
    this.kartenSlots = kartenSlots;
    this.usbPorts = usbPorts;

  }

  // METHODEN



}

// FN1:
// RECAP: Oben steht der Standard-Konstruktor, den Java normalerweise automatisch anleg. Sobald ein individueller
// Konstruktor definiert wird, beachtet Java den Standard-Konstruktor nicht mehr.

/** FN2:
 * Individueller Konstruktor: Beim Aufruf dieses Konstruktors können wir Parameter übergeben, mit denen die VAR
 * eines Objekts dieser Klasse befüllt werden, wenn das Objekt generiert wird. Dann können wir über dieses Objekt
 * Methoden aus dieser Klasse aufrufen und die Variablen-Werte bearbeiten.
 * Mit "this.ramSlot = ramSlot;" weisen wir einen Parameter wert einer VAR zu, welcher in einem Objekt dieser Klasse
 * eingerichtet wird. this = Geh in das Objekt hinein, das gerade erstellt wird mit diesem Konstruktur, rufe dort
 * die VAR ramSlot auf und weise dieser den Wert des übergebenen Parameters "ramSlot" zu.
  */

// EINGENSCHAFTEN / ATTRIBUTE
// KONSTRUKTOREN
// METHODEN
