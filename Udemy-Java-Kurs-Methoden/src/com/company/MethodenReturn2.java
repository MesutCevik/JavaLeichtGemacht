package com.company;

public class MethodenReturn2 {
  public static void main(String[] args) {

    int a = summe1(); // Hier wird die Methode summe1() aufgerufen. Der gelieferte Wert wird der int a-VAR zugewiesen.
    System.out.println("Der Wert aus der Methode summe1() ist: " + a);

    int summe = a - 5;
    System.out.println("Der Wert in summe ist: " + summe);

    summe2();
  }

  public static int summe1() {
    int a, b, summe;
    a = 5;
    b = 5;

    summe = a + b;

    return summe;
  }

  public static void summe2() {
    int a, b, summe;
    a = 5;
    b = 5;

    summe = a + b;
    System.out.println("Dies ist die summe aus der void-Methode summe2(): " + summe);

    /**
     * Diese Methode ist void und liefert daher keinen Wert an den Aufrufer zurück.
     * D.h. wenn diese Methode aufgerufen wird, arbeitet sie den Code im Anweisungsblock ab und beendet seine Arbeit.
     * Anschließend werden alle Variablenwerte aus dem Arbeitsspeicher gelöst.
     * ALSO: Damit der errechnete Wert innerhalb des Programms weitergenutzt werden kann,
     * muss es mit return zurück gegeben werden.
     */
  }
}
