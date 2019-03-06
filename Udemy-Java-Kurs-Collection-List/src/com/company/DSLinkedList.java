package com.company;

import java.util.*;

public class DSLinkedList {

  public static void main(String[] args) {

    // DATENSTRUKTUR ERSTELLEN
    // List<Integer> liste = new ArrayList<Integer>(); // ArrayList
    List<Integer> liste = new LinkedList<Integer>(); // LinkedList
    // <Integer> = Generischer Typ E. Integer sind Wrapper.


    // DATENEINGABE
    for (int i = 0; i < 10000000; i++) {
      liste.add(i);
    }


    // ZEIT MESSEN
    // 1. Zeitmessung: Erfasst die aktuelle Zeit Millisekunden-genau.
    // final: Der Wert, der in timeStart gespeichert wird, kann bis zum Ende dieses Progs. nicht meht geändert werden.
    // Wende die Klasse System und dort die "static" Methode currentTimeMillis() an. Dies gibt einen long zurück.
    final long timeStart = System.currentTimeMillis();

    // Hier starten wir den Suchvorgang für den Index 1.999.999 in der LinkedList "liste".
    DSLinkedList.getZahl(1999999, liste);

    // 2. Zeitmessung: Die Zeit nach dem Suchen.
    final long timeEnd = System.currentTimeMillis();

    // Ausgabe in der Konsole.
    System.out.println("Das Suchen hat gedauert: " + (timeEnd - timeStart) + " Millisekunden.");
  }

  // Außerhalb der main-Methode:
  // GET-METHODE
  // Damit wir diese Methode aufrufen können, ohne ein Objekt dieser Klasse zu erstellen, setzen wir es "static".
  // Klassenmethode.
  public static void getZahl(int meinIndex, List<Integer> liste) {
    System.out.println(liste.get(meinIndex));
  }




}
