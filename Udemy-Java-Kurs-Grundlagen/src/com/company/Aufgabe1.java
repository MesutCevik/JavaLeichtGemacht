package com.company;

public class Aufgabe1 {
  public static void main(String[] args){
    /*
    * Aufgabe:
    * 1. Auto: 3500
    * 2. Alter: 18
    * 3. Vorname: Peter
    * 4. Nachname: Müller
    *
    * 1. Überlege Dir welchen Datentyp diese Informatoionen repräsentieren.
    * 2. Lege Variablen fest und speicher diese Werte in den Variablen ab.
    * 3. Gebe die Werte mit Hilfe von System.out.println(""); aus.
    *
     */

    int auto = 3500;
    int alter = 18;
    String vorname = "Peter";
    String nachname = "Müller";

    System.out.println("Main Name ist "+vorname+ " "+nachname+", ich bin "+alter+" alt und fahre ein Auto im Wert von "
            +auto+" Euro.");

  }
}
