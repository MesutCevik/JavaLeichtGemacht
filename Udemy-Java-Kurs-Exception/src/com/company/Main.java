package com.company;

// Gehe in das Package "beispielpaket" und hole dort die Methode "Taschenrechner", damit es in dieser Klasse genutzt wird.
import beispielpaket.Taschenrechner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Die Klasse Taschenrechner ist in einem anderen Package. Daher muss es erst importiert werden.

        // Da die Methode "plus" static ist, muss darauf über den Klassennamen, in der er sich befindet, aufgerufen werden.


        /** Try and Catch
         * Was passiert, wenn zum dividieren die Zahl 0 eingegeben wird? Denn in der Mathematik darf eine Zahl nicht durch 0 geteilt werden.
         *
         * try = versuche (Versuche einen Code auszuführen.)
         * catch = fange/einfangen (Wenn die Ausführung nicht klappt, dann fange es damit auf.)
         *
         * Also: Versuche den Code im Ausführungsblock auszuführen. Wenn es nicht klappt, wenn also ein Fehler auftritt, dann fange diesen auf.
         * Was soll aufgefangen werden? Die Ausnahme: Exception e. Fange den Fehler auf und packe es in die Variable e, was ein Exception Objekt ist.
         *
         * Exception ist die Superklasse aller Fehler, die es in Java gibt. "e" ist ein Objekt von dieser Superklasse, das automatisch erstellt wird,
         * wenn ein Fehler aufgetreten ist. Dann kann im folgenden Ausführungsblock der Fehler bearbeitet werden.
         *
         * EXCEPTION ist eine AUSNAHMEBEHANDLUNG, oder auch FEHLERBEHANDLUNG genannt.
         *
         */
            Scanner scan = new Scanner(System.in);

        try {
            // Die unten stehende scan Variable wäre eine lokale Variable und stünde nur innerhalb des Anweisungsblocks
            // (von try) zur Verfügung. Sie wäre aber für andere Teile des Programms nicht nutzbar. Daher wurde eine
            // globale Variable scan deklariert (siehe oben).
            // Scanner scan = new Scanner(System.in);
            System.out.println("Bitte Zahl1 eingeben: ");
            int userZahl1 = scan.nextInt();
            System.out.println("Bitte Zahl2 eingeben: ");
            int userZahl2 = scan.nextInt();

            Taschenrechner.dividiere(userZahl1, userZahl2);

        } catch (Exception e){
            System.out.println("Man kann nicht durch 0 teilen!");
            System.out.println("Bitte neue Zahl1 eingeben...");
            int neueEingabe1 = scan.nextInt();
            System.out.println("Bitte neue Zahl2 eingeben.");
            int neueEingabe2 = scan.nextInt();

            try {
                Taschenrechner.dividiere(neueEingabe1, neueEingabe2);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        System.out.println("Programm geht weiter.");
    }
}
