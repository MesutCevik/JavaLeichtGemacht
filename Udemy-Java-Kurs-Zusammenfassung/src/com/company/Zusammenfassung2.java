package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class VergleicheStringLaenge implements Comparator<String> {
  @Override
  public int compare(String o1, String o2) {

    int laenge1 = o1.length();
    int laenge2 = o2.length();

    if(laenge1 > laenge2) {
      return 1;
    } else if(laenge1 < laenge2) {
      return -1;
    } else {
      return 0;
    }

    /** compare = vergleiche
     *
     * Die Logik dieser Methode braucht immer diese Rückgabetypen (returns), damit die Sortierung funktionieren muss.
     * Daher oben Logik erstellen:
     * 1   =   o1 > o2
     * -1  =   o1 < o2
     * 0   =   o1 = o2
     */
  }
}

class UmgekehrteAlphabetischeReihenfolgeString implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    // Hier sagen wir, wie sortiert werden soll. Sortiere in umgekehrter natürlicher Folge.
    return -o1.compareTo(o2);
  }
}


public class Zusammenfassung2 {

  public static void main(String[] args){

    // Comparator = Vergleicher


    List<String> angestelltenListe = new ArrayList<>();

    angestelltenListe.add("Metehan");
    angestelltenListe.add("Emre");
    angestelltenListe.add("Christianson");
    angestelltenListe.add("Ali");
    angestelltenListe.add("Christian");
    angestelltenListe.add("Mesut");
    angestelltenListe.add("Ut");
    angestelltenListe.add("Karamollaoglu");


    Collections.sort(angestelltenListe, new VergleicheStringLaenge());
    for (String stringNamenAng : angestelltenListe) {
      System.out.println(stringNamenAng);
    }

    System.out.println("----------------");

    Collections.sort(angestelltenListe, new UmgekehrteAlphabetischeReihenfolgeString());
    /** Die Methode sort() ist von der Klasse String implementiert und es sortiert nach der natürlichen Ordnung.
     * Dies können wir nicht ändern. Wir können aber ein weiteres Argument übergeben, wie zu sortieren ist.
     * Dies können wir mit dem Comparator Interface realisieren:
     * >> Dazu erstellen wir eine Klasse,
     * >> welcher den Comparator Interface implementiert und
     * >> die Methode compare() individuell definiert, je nach dem, wonach wir sortieren wollen.
     * >> Dann muss mit Collections.sort(Arg1, Arg2=Comparator-Objekt) der Vergleich bzw. die Sortierung erfolgen.
     * Aber als 2. Argument erstellen wir ein Comparator-Objekt!!!
     *
     * Mit dem Comparator Interface können wir eigene Klasse und daraus eigene Objekte erstellen, wonach sortiert
     * werden soll!!!
     */


    for (String stringNamenAng : angestelltenListe) {
      System.out.println(stringNamenAng);
    }
  }

  /** MERKE:
   * Interface "Comparable" hat: compareTo(o1)
   *
   * Interface "Comparator" hat: compare(o1, o2)
   *
   * o = Objekt
   */


}
