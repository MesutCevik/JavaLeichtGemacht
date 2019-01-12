package com.company;

public class SchleifeWhile {

  public static void main(String[] args) {

    // Kontrollstrukturen steuern den Programmablaufplan.

    // while = solange

    /* Allgemeiner Aufbau einer while-Schleife:
     *
     * while(Bedingung){
     *
     *      Anweisungsblock
     *
     * }
     *
     * MERKE: Die Bedingung kann entweder true (wahr) oder false (nicht wahr) sein.
     *
     * Solange die Bedingung einer while-Schleife true ist, soll der Code im Anweisungsblock ausgeführt werden.
     */

    int count = 1; // Zählervariable bzw. Iterationsvariable.

//    while (count != 6) { // Falls der Wert der VAR count ungleich 6 ist, dann gehe in den Anweisungsblock und führe
//    den Code dort aus.
//      System.out.println("Ich bin: " + count);
//      count++;
//    }

    while(true){
      System.out.println("Hi!");
       if(count == 13){
         break; // Unterbreche diese unendliche while-Schleife, falls diese Bedingung erfüllt ist (true).
       }
       count++;
    }
  }
}
