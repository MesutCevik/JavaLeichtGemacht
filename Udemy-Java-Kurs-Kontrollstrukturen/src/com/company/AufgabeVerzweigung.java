package com.company;

import java.util.Scanner;

public class AufgabeVerzweigung {

  public static void main(String[] args){
    System.out.println("Wie viele Bundesländer hat Deutschland?");
    System.out.println("15 oder 3 oder 16 oder 30");

    // Der "new"-Operator erstellt von der Klasse "Scanner" ein neues Objekt und speichert es in der Variable "scan".
    // Damit wird die Variable "scan" zu einem Objekt der Klasse Scanner. Man kann auch sagen, dass es zu einer
    // komplexen Variable wird, in der mehr als eine Information gespeichert werden kann.
    Scanner scan = new Scanner(System.in);

    // Mit dem "."-Operator gehen wir in die Variable (bzw. das Objekt) "scan" rein. Dort holen wir mit der Methode
    // "nextInt()" die User-Eingabe einer Ganzzahl/Integer raus und speichern es in einer Integer-Variable.
    int eingabeUser = scan.nextInt();

    // Hier kommt eine Verzweigung der möglichen Antwort des Users. Gestaltet mit einer if-else-Kontrollstruktur.
    if (eingabeUser == 15){
      System.out.println("Das ist falsch.");
    } else if (eingabeUser == 3){
      System.out.println("Das ist falsch.");
    } else if (eingabeUser == 16){
      System.out.println("Das ist richtig!!!");
      System.out.println("Wie heißt der Bundespräsident?");
    } else if (eingabeUser == 30){
      System.out.println("Das ist falsch.");
    }
  }
}
