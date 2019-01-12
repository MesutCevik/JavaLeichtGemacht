package com.company;

public class WasIstEinArray {

  public static void main(String[] args) {

    /** Variablen Deklaration
     * So deklariert man eine Variable:
     *
     * Datentyp Name = Wert;
     */
    int zahl = 50;

    /** Array Deklaration
     * So deklariert man einen Array:
     *
     * Datentyp[] Name = new Datentyp[Anzahl];
     *
     * Array ist eine Datenstruktur. Eine Datenstruktur definiert, in welcher Struktur Daten (Werte)
     * in einer Variablen zu speichern sind.
     *
     * Also werden in einem Array Daten (Werte) in einer bestimmten Struktur gespeichert.
     * >> Arrays sind statisch, d.h. die Größe des Arrays ist bei der Erstellung bekannt.
     * >> Es können beliebige Datentypen gespeichert werden, sie müssen aber alle vom gleichen Typ sein!
     * >> Zuordnung der Werte erfolgt durch Indizes, die immer bei 0 beginnt.
     * >> Die Reihenfolge der Werte ist durch den Index festgeschrieben.
     *
     * Die [] vor dem Datentyp signalisieren, dass es sich hier im einen Array handelt.
     * Die Anzahl in [] bewirkt, dass wieviel Werte das Array bzw. sein repräsentierende Variable speichern soll.
     * Damit wird entsprechend großer Arbeitsspeicher für diese Variable reserviert.
     */

     /** Der oben definierte Array "zahlenArray" erlaubt es, insgesamt 7 Werte vom Typ int zu speichern.
     * Hier repräsentiert die Variable "zahlenArray" eine Datenstruktur.
     *  Also hier von 0 bis einschließlich 6.
     */

    int[] zahlenArray = new int[7];
    zahlenArray[3] = 50; // An der Position 3 den Wert 30 speichern. Der Wert des Inhalts vom Typ int.
    zahlenArray[5] = 500;
    zahlenArray[0] = 40;
  }
}
