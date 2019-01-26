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
 * Ein individueller Konstruktor (ein Konstruktor mit Parametern) wird mit Parameterwerten aufgerufen. Mit diesen
 * Parametern werden die Variablen eines erzeugten Objekts befüllt, die Variablen sind in der Klasse als Eigenschaften /
 * Attribute definiert.
 * Für diese Befüllung wird im Body des Konstruktors definiert, welcher Parameterwert welcher Variable eines erzeugten
 * Objekts zugewiesen wird. Dies geschieht mit diesen Code:
 * >>> this.preis = preis;
 * Mit dem Schlüsselwort "this", dem '.'-Operator und dem ausgewählten Variablen wird festgelegt, welche Variable dieses
 * Objekts, welcher gerade erzeugt wird, welchen Parameterwert erhalten soll.
 * Der Zuweisungsoperator '=' und der Parametername weisen dann den Parameterwert der Variable zu.
 *
 * Methoden aus dieser Klasse aufrufen und die Variablen-Werte bearbeiten.
 * Mit "this.ramSlot = ramSlot;" weisen wir einen Parameterwert einer VAR zu, welcher in einem Objekt dieser Klasse
 * eingerichtet wird. this = Geh in das Objekt hinein, das gerade erstellt wird mit diesem Konstruktur, rufe dort
 * die VAR ramSlot auf und weise dieser den Wert des übergebenen Parameters "ramSlot" zu.
  */

// Recap: Initialisieren = Einer Variable einen initialen Wert übergeben.
// EINGENSCHAFTEN / ATTRIBUTE
// KONSTRUKTOREN
// METHODEN
