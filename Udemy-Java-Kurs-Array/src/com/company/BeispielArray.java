package com.company;

import java.util.Scanner;

public class BeispielArray {

  public static void main(String[] args) {

    // Array Deklaration
    // Datentyp[] Name = new Datentyp[Anzahl];

    int[] lottoZahlen = new int[6];
    // lottoZahlen[0] = 30;
    // lottoZahlen[14] = 14;

    // for(Anfangswert; Abbruchbedingung; Zähler)
    for (int i = 0; i < lottoZahlen.length; i++) {
      Scanner scan = new Scanner(System.in);
      int zahlUser = scan.nextInt();
      lottoZahlen[i] = zahlUser;

      /** Erklärung zur for-Schleife:
       * 2. Zeile: rechts: ein neues Scanner Objekt wird generiert, links: das neue Objekt wird der VAR scan zugewiesen.
       * 3. Zeile: Dem Scanner-Objekt "scan" steht die Methode nextInt() zur Verfügung. Darauf wird mit dem .-Operator
       * zugegriffen. Die Methode nextInt() liest in "scan" die User-Eingabe. Des weiteren  wird der eingelesene Wert
       * in der VAR "zahlUser" gepeichert.
       * 4. Zeile: Den Wert der primitiven VAR "zahlUser" (die nur 1 Wert speichern kann), in das mit dem Index i
       * angegebene Feld im Array "lottoZahlen[]". Denn letzteres ist eine komplexe VAR, die mehrere Daten speichert.
       */
    }

    // for-Schleife, um die eingelesenen Lottozahlen der Reihe nach aus dem Array lottoZahlen[] auszugeben.
    for (int i = 0; i < lottoZahlen.length; i++) {
      System.out.println(lottoZahlen[i]);
    }


    /** Ein Array ist eine Klasse in Java. Und eine Klasse ist wie ein komplexer Datentyp, bei denen man mit
     * dem .-Operator können wir einen komplexen Datentypen reingehen und den gewünschten Wert rausholen.
     * Oben greifen wir beim Array "lottoZahlen" (ein komplexer Datentyp) mit dem .-Operator auf die Methode "length"
     * zu, um die Länge dieses Arrays zu holen.
     */

    // Merke: Indes = Anzahl der Elemente - 1
    // Index hier ist: 0, 1, 2, 3, 4, 5
  }
}
