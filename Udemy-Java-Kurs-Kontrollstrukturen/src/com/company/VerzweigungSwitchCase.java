package com.company;

import java.util.Scanner;

public class VerzweigungSwitchCase {

  public static void main(String[] args) {

    /* Kontrollstrukturen steuern den Programmablaufplan
     * D.h. man kann mit Kontrollstrukturen den Programmablauf steuern.
     *
     * switch - Fallunterscheidung
     * case - Der Fall (einer der möglichen Fälle)
     *
     * (Bedingung) - Als Bedingung gilt nur ein int, char und ein String.
     * Anders ausgedrückt, die switch-Anweisung kann eine Bedinung nur überprüfen auf ein int, char oder ein String.
     */

    /* Mit der switch-Anweisung kann eine Fallunterscheidung vorgenommen werden, genauso wie eine if-else-Anweisung.
     * Vorteil: übersichtlicher als eine if-else-Anweisung, die umfangreich und mit jeweils umfangreichen Anweisungsblöcken.
     * zu switch: In den runden Klammern steht die Bedingung dieser Fallunterscheidung. Hier wird die Bedingung auf eine Zahl geprüft.
     * zu case 0: Fall, wenn die Bedingung eine 0 ist. Wenn dieser eintritt, dann führe die nachfolgenden Anweisungen aus.
     * zu break: Unterbreche diese Fallunterscheidung, wenn dieser Fall eingetreten ist. Ansonsten werden alle weiteren
     * cases/Fälle auch überprüft, was unnötig ist und Rechenpower frisst.
     */
    /*
    switch (5) {
      case 0: {
        System.out.println("Die Zahl ist eine 0.");
      }
      break;
      case 3: {
        System.out.println("Die Zahl ist eine 3.");
      }
      break;
      case 5: {
        System.out.println("Die Zahl ist eine 5.");
      }
      break;
    } */

    System.out.println("Wie wieviele Bundesländer hat Deutschland?");
    System.out.println("16 oder 3 oder 30 oder 15");

    Scanner scan = new Scanner(System.in);
    int eingabeUser = scan.nextInt();

    switch (eingabeUser){
      case 15: {
        System.out.println("Das ist falsch.");
      } break;
      case 30: {
        System.out.println("Das ist falsch.");
      } break;
      case 3: {
        System.out.println("Das ist falsch.");
      } break;
      case 16: {
        System.out.println("Das ist richtig :-)");
      } break;
      default: {// Standardausgabe, wenn keiner der obigen cases/Fälle eintritt. "default"-Befehl ist wie "else".
        System.out.println("Diese Zahl ist unbekannt.");
      }
    }

  }
}
