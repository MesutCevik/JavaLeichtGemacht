package com.company;

import java.util.Scanner;

public class UnterschiedForWhile {

  public static void main(String[] args){

//    for (Anfangswert; Abbruchbedingung; Zähler){
//      Anweisungsblock
//    }
//
//    while (Bedingung){
//      Anweisungsblock
//    }

    /** For- und While-Schleifen:
     * GEMEINSAMKEITEN
     * Sie arbeiten beide als Schleifen und wiederholen die Ausführung eines Anweisungsblocks solange,
     * solange eine Bedingung erfüllt (while) oder nicht erfüllt (for) ist.
     *
     * UNTERSCHIEDE
     * for-Schleife: In der Bedingung sind gegeb en: Anfangswert, Abbruchbedingung und Zähler.
     * while-Schleife: Nur eine Bedingung gegeben. Ein Zähler muss außerhalb erstellen und innerhalb
     * des Anweisungsblocks (hoch) zählen.
     *
     * Eine for-Schleife setzt man ein, wenn man weiß, wie oft ein Anweisungsblock ausgeführt werden soll.
     * Eine while-Schleife setzt man dann ein, wenn man nicht weiß, wie oft der Anweisungsblock ausgeführt werden soll.
     */

//    for(int i = 1; i<= 5; i++){
//      System.out.println("Asteroid wurde erstellt: Nr. " + i);
//    }

    Scanner scan = new Scanner(System.in);
    System.out.println("Drücke 1 für Schwierigkeitsgrad leicht \n Drücke 2 für Schwierigkeitsgrad mittel");

    int userEingabe = scan.nextInt();
    int anzahlGegner = 0;

    if (userEingabe == 1){
      anzahlGegner = 10;
    } else if (userEingabe == 2){
      anzahlGegner = 15;
    }

    while(anzahlGegner != 0){
      System.out.println("Geger erstellt!");
      anzahlGegner--; // Dekrementieren der VAR anzahlGegener.
    }
  }
}
