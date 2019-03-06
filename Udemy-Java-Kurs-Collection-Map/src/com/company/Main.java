package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    // Was ist ein Assoziativspeicher? Assoziation = hat-Beziehung
    // Der Inhalt hat eine Beziehung zum Schlüssel.

    // Jeder Inhalt hat seinen besonderen (einzigartigen) Schlüssel.
    // Es gibt keine doppelten Schlüssel. Wenn man einen vorhandenen Schlüssel erneut generieren möchte, dann wird
    // der alte überschrieben.

    // Der Key (Schlüssel) ist auch ein Objekt. Also, jeder Schlüssel ist selbst ein Objekt.

    // Map: 1) TreeMap, 2) HashMap, 3) LinkedHashMap

    // Erstellen einer Map - die Struktur:
    Map<Integer, String> map1 = new HashMap<>();
    /** Erkläungen:
     * K = Key (Schlüssel)
     * V = Value (Inhalt)
     * Integer -> Datentyp des Keys, String -> Datentyp des Werts.
     */

    // Anstatt add() steht den Map-Klassen der Befehl put() zur Verfügung.
    map1.put(1234, "Tisch Viru");
    map1.put(2345, "Stuhl Björki");

    // System.out.println("Wert: " + map1.get(1234));
    // System.out.println("Wert: " + map1.get(2345));

    for (Integer key: map1.keySet()) {
      System.out.println("Artikelnummer: " + key);
      String value = map1.get(key);
      System.out.println("Wert: " + value);
    }
    /**
     * Z1: keySet(): gibt einen Set mit allen Keys in der aktuellen Map.
     */

  }

}
