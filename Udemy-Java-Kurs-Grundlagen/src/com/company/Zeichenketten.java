package com.company;

public class Zeichenketten {
  public static void main(String[] args) {

    /* Komplexer Datentyp:
     * String (Zeichenkette)
     *
     * Ein String besteht aus vielen einzelnen Zeichen (characters).
     * Vom Datentyp String können mehrere Zeichen (characters) gleichzeitig in eine Variable abgespeichert werden.
     *
     * String ist auch eine Klasse, aus denen Objekte erzeugt werden können. Dazu später mehr Infos.
     *
     * Auch Strings werden wie primitive Datentypen deklariert und initialisiert:
     * <Datentyp> <Variablenname> = <Wert>;
     * String meineZeichenkette = "Dies ist meine tolle Zeichenkette."
     */


    // Mit dem primitiven Datentyp "char" können wir immer nur ein Zeichen in einer Variable speichern.
    char varZeichen = '!';

    /* Wenn wir mehrere Zeichen - Zeichenketten - in einer Variable speichern wollen, dann müssen wir uns des komplexen
    * Datentyps "String" bedienen.
    * String ist ein komplexer Datentyp.
    * Komplexe Datentypen sind Klassen aus denen Objekte erzeugt werden können.
    */

    String meineZeichenkette = "Toll! Ich bin eine super Zeichenkette.";
    System.out.println(meineZeichenkette);

    String name = "Peter";
    String alter = "25";

    System.out.println("Dein Name ist " + name + " und dein Alter ist " + alter + ".");

  }
}