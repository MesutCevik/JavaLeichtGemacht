package com.company;

import java.util.*;

/**
 * compare = vergleiche
 * <p>
 * Die Logik dieser Methode braucht immer diese Rückgabetypen (returns), damit die Sortierung funktionieren muss.
 * Daher oben Logik erstellen:
 * 1   =   o1 > o2
 * -1  =   o1 < o2
 * 0   =   o1 = o2
 */


class SortiereAngestelltenID implements Comparator<Angestellter> {

  @Override
  public int compare(Angestellter o1, Angestellter o2) { // compare() = Vergleiche Objekt A mit Objekt B.

    if (o1.getId() > o2.getId()) { // Falls 1. Objekt vom Typ Angestellter größer als 2. Objekt, dann tue dies ...
      return 1;
    } else if (o1.getId() < o2.getId()) {
      return -1;
    } else {
      return 0;
    }
  }
}


class SortiereAngestelltenNamen implements Comparator<Angestellter> {

  // Hier haben wir den Vorteil, dass wir zwei Strings vergleichen. Daher kann das Objekt "o1" compareTo() aufrufen
  // und sich selbst mit dem o2-Objekt vergleichen.
  @Override
  public int compare(Angestellter o1, Angestellter o2) {

    return o1.getName().compareTo(o2.getName());
  }
}


class SortiereAngestelltenGeburtsjahr implements Comparator<Angestellter> {

  @Override
  public int compare(Angestellter o1, Angestellter o2) {

    if (o1.getGeburtsJahr() > o2.getGeburtsJahr()) {
      return 1;
    } else if (o1.getGeburtsJahr() < o2.getGeburtsJahr()) {
      return -1;
    } else {
      return 0;
    }
  }
}

  public class AngestelltenListe {

    public static void main(String[] args) {


      List<Angestellter> angestelltenListe = new ArrayList<>();


      // Einen Angestellten in unsere Liste "angestelltenListe" (siehe oben!) hinzufügen:
      // Wir erstellen 3 Objekte vom Typ "Angestellter" und fügen es in usnere Liste "angestelltenListe" vom
      // Typ "AngestelltenListe" hinzu!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      AngestelltenListe.addAngestellter(3, angestelltenListe);

      // ALTERNATIVE 1: Sortiere Angestellte nach dem Namen:
      // Collections.sort(angestelltenListe, new SortiereAngestelltenNamen());

      // ALTERNATIVE 2: Sortiere Angestellte nach der ID:
      // Collections.sort(angestelltenListe, new SortiereAngestelltenID());

      // ALTERNATIVE 3:Sortiere Angestellte nach dem Geburtsjahr:
      Collections.sort(angestelltenListe, new SortiereAngestelltenGeburtsjahr());




      AngestelltenListe.getAngestellter(angestelltenListe);
    }

    // Hier eine Methode erstellen, mit der neue Angestellte der Liste hinzugefügt werden können.
    // Zwei Parameter: 1) Wieviele Angestellte hinzufügen, 2) in welche Sammlung und welchem Typ hinzufügen, hier in
    // myCollection Objekte vom Typ <Angestellter>.
    public static void addAngestellter(int anzahl, Collection<Angestellter> myCollection) {

      // Dateneingaben vom User einholen:
      for (int i = 1; i <= anzahl; i++) {
        Scanner scanAngestellter = new Scanner(System.in);

        System.out.println("Bitte Namen eintippen: ");
        String name = scanAngestellter.next();

        System.out.println("Bitte ID eintippen: ");
        int id = scanAngestellter.nextInt();

        System.out.println("Bitte Geburtsjahr eintippen: ");
        int geburtsJahr = scanAngestellter.nextInt();

        // Ein Angestellter Objekt mit Namen "angestellter" erstellen:
        Angestellter angestellter = new Angestellter(id, name, geburtsJahr);

        // Hinzufügen des Angestellten in unsere Sammlung (Collection):
        myCollection.add(angestellter);
      }

    }

    public static void getAngestellter(Collection<Angestellter> myCollection) {

      for (Angestellter angestellter : myCollection) {
        System.out.print("Angestellter: ");
        System.out.println(angestellter);
        // Oben könnten wir unseren String selber zusammenbauen mit "..." + "..." usw., ODER wir definieren eine
        // toString-Methode in der Klasse Angestellter. Dann brauchen wir hier nur ein Objekt dieser Klasse auszugeben:
        // angestellter.
      }

    }

  }