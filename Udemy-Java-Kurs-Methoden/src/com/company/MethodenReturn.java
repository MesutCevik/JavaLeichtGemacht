package com.company;

public class MethodenReturn {

  public static void main(String[] args) {
    int summe = taschenrechner(15, 7, '-');
    System.out.println(summe);
  }

  public static int taschenrechner(int zahl1, int zahl2, char operator) {
    int summe;

    if (operator == '+') { // Falls der Operator ein + ist, dann führe den Anweisungsblock aus!
      summe = zahl1 + zahl2;
    } else {
      summe = zahl1 - zahl2;
      /** BEACHTE:
       * Warum kann es die VAR "summe" in der if-else-Kontrollstruktur mehrfach geben?
       * Die VAR "summe" wird jedes mal innerhalb des Anweisungsblocks einer der if-else Bedingungen deklariert und
       * bekommt Werte zugewiesen. Daher steht sie auch nur innerhalb dieses Anweisungsblocks zur Verfügung und kann
       * in anderen Programmteilen nicht genutzt werden. Sie ist sozusagen eine lokale VAR und steht nur innerhalb des
       * Anweisungsblocks zur Verfügung, innerhalb der es deklariert wurde.
       * Wenn wir aber den Inhalt der VAR "summe" übergreifend, also auch außerhalb eines einzelnen Anweisungsblocks
       * nutzen wollen, dann müssen wir es übergreifender - globaler - definieren. D.h. wir machen es globaler und
       * definieren es z.B. auf der Ebene der Methode "Taschenrechner" definieren. Dann steht sie für die gesamte
       * Methode zur Verfügung und ist auch sichtbar.
       */
    }
    return summe; // Der return-Befehl gibt die Möglichkeit, den Wert der VAR "summe" zurück zu geben.

    // Sobald die Methode ausgeführt wurde, d.h. der Code im Anweisungsblock (innerhalb der geschweiften Klammer)
    // abgearbeitet und ein Wert zurückgegeben wurde, werden alle Daten in den Variablen aus dem Arbeitsspeicher
    // gelöscht. Weil alle Daten nach der Ausführung einer Methode gelöscht werden, gibt es den Befehl return, werlcher
    // den in der Methode errechten Wert zurück an den Aufrufer der Methode gibt.
  }
}
