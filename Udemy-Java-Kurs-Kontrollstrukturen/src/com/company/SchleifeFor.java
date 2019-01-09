package com.company;

public class SchleifeFor {

  public static void main(String[] args){

// Kontrollstrukturen steuern den Programmablaufplan.

    // for = sei ...

    /* Allgemeiner Aufbau einer for-Schleife:
    *
    * for(Anfangswert; Abbruchbedingung; Zähler){
    * Anweisungsblock
    * }
    *
    * Anfangswert: Wo (bei welchen Wert) soll die Schleife beginnen?
    * Abbruchbedingung: Bis wohin soll die Schleife gehen?
    * Zähler: Erhöht den Wert der Iterationsvariable.
     */

    for (int i = 0; i < 10; i++){
      System.out.println(i);
    }

    for (int j = 1; j <=10; j++){
     if(j == 5){
       System.out.println("Hey du hast mich gefunden " + j);
     }
    }
  }
}
