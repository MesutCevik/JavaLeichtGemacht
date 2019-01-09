package com.company;

public class ZeichenBool {
  public static void main(String[] args) {

    /* Primitive Datentypen:
     * Bei primitiven Datentypen kann nur ein Wert einer Variable zugewiesen werden, d.h. abgespeichert werden.
     * ... für Ganzzahlen:
     * byte
     * short
     * int
     * long
     *
     * ... für Flieskommazahlen:
     * double
     * float
     *
     * ... für Boolean:
     * boolean
     *
     * ... für Zeichen:
     * char
     *
     * Komplexe Datentypen:
     * Bei komplexen Datentypen können mehrere Werte gleichzeitig in einer Variablen abgespeichert werden.
     * String (Zeichenkette)
     *
     * declaration: <Datentyp> <Variablen-Name>;
     * initialization: <Variablen-Name> = <Wert>;
     * declaration and initilization together: <Datentyp> <Variablen-Name> = <Wert>;
     *
     * '=' >> Zuweisungsoperator
     * Das Zeichen '=' ist ein Operator, mit der ein Wert einer Variable zugewiesen wird.
     * Der Zuweisungsoperator weist den Wert auf seiner rechten Seite der Variable auf seiner
     * linken Seite zu.
     */

    char varZeichen = '\u00A9';
    System.out.println("Das Bild unterliegt dem "+varZeichen);

    // Werte, die eine Boolean Variable annehmen kann: true = wahr, false = nicht wahr
    boolean userClick = false;

  }
}
