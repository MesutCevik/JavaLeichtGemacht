package com.company;

import java.util.Scanner;

public class Einlesen2 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    // Aufgabe
    /*
    * Erstelle erneut ein Objekt der Klasse Scanner und
    * lese 2 Werte mit Hilfe dieser Klasse ein.
    *
    * 1. ist eine Ganzzahl, die Zahl soll dein Alter sein.
    * 2. ist eine Zeichenkette (String), dein Name.
    *
    * Am Ende soll dein Alter und dein Name in der Konsole ausgegeben werden.
    * System.out.println("Name: " + ... + " Alter: " + ...)
     */

    Scanner scan1 = new Scanner(System.in);
    // System.out.println("Bitte gib Deinen Namen ein: ");
    String name = scan1.next();
    // System.out.println("Bitte gib Deinen Alter ein: ");
    int alter = scan1.nextInt();

    System.out.println("Name: " + name + ", Alter: " + alter);

    // HINWEIS: Der Scanner funktioniert auch ohne die explizite Abfrage beim User mit System.out.println()!!!

  }
}
