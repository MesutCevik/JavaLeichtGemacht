package com.company;

import java.util.ArrayList;

public class DSArrayList {

  public static void main(String[] args) {

    /*
     * ArrayList = "Wie ein Array, nur dynamisch"
     *
     * Was sind die Datestrukturen überhaupt?
     * Datenstrukturen dienen zur Zwischenspeicherung von Daten.
     */


    // Eine ArrayList erstellen:

    // (A) Mit der folgenden Zeile deklarieren wir eine ArrayList Liste und legen eine Datenstruktur fest, in der alles
    // Mögliche (jedes Objekt) gespeichert werden kann. Wir schränken nichts ein.
    // Das könnte uns das Verstehen und Arbeit mit dieser Liste erschweren!!!
    ArrayList einkaufsListe = new ArrayList();

    // (B) Wenn wir in unserer ArrayList nur Namen speichern wollen, müssen wir mit Generics einen Datentyp festlegen.
    //  Daher legen wir mit <String> einen generischen Datentyp fest.
    //  Folglich können in diese ArrayList nur Daten vom Typ String gespeichert werden.
    ArrayList<String> namensListe = new ArrayList<String>();

    // Dateneingabe:
    einkaufsListe.add("Wasser"); // hat Index 0
    einkaufsListe.add("Brot"); // hat Index 1

    // einkaufsListe.add(new Integer(4)); // Hmmm, eine Ganzzahl (hier in einer Wrapper-Klasse) in einer Einkaufsliste
    // passt nicht.
    // FRAGE: Wie können wir sicherstellen, dass in diese ArrayList ganz bestimmte Objekt-Typen reinkommen können?
    // Antwort: Generics!

    namensListe.add("Hans");
    namensListe.add("Peter");
    // namensListe.add(new Double(4.5));
    // Da wir oben die Datenstruktur festgelegt und String vorgegeben haben, funzt das nicht.

    // Datenausgabe (mehrere Möglichkeiten):
    // (a.) Normale for-Schleife mit einem Iterator i:
    for (int i = 0; i < namensListe.size(); i++) { // i += 2 : i jeweils um 2 erhöhen:
      System.out.println("Name: " + namensListe.get(i));
    }

    // (b.) foreach-Schleife
    // Geh in die Datenstruktur namensListe rein und gehe über jedes Element darin und führe den Anweisungsblock aus.
    // For each element do this. Unten ist string ein Variablenname!!!
    // Bei der foreach-Schleife ist man direkt in der Datenstruktur drin und bearbeitet die einzelnen Elemente durch.
    for (String string: namensListe) {
      System.out.println("Die Länge des Namens ist: " + string.length());
    }
  }

}
