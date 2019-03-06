package com.company;

import java.util.*;
import java.util.zip.ZipInputStream;


class Person implements Comparable<Person> { // NUR EINE KLASSE KANN PUBLIC SEIN.

  // EIGENSCHAFTEN / ATTRIBUTE
  private String vorName;

  // KONSTRUKTOR
  public Person(String vorName) {
    this.vorName = vorName;
  }

  // METHODEN
  @Override
  public String toString() {
    return "Person: " + vorName;
  }

  //  Die folgenden Methoden werden überschrieben, weil wir Objekte, die wir aus eigenen Klasse erstellen, in Sets und Maps
  //  sortieren wollen:
  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }


  @Override
  public int compareTo(Person o) {

    int laenge1 = vorName.length(); // Länge von vorName des Person-Objekts, welcher diese Methode aufruft.
    int laenge2 = o.vorName.length(); // Länge von vorName des Person-Objekts, mit der verglichen werden soll.

    if (laenge1 > laenge2) {
      return 1; // Wenn andersherum, dann hier -1 ...
    } else if (laenge1 < laenge2) {
      return -1; // ... und hier 1.
    } else {
      return vorName.compareTo(o.vorName);
    // Schmeißt nur eine 0, wenn Inhalt gleich ist. Ungleiche Strings, aber gleicher Länge
    }

    // ACHTUNG: Wenn nach der LÄNGE von Wörtern verglichen wird, dann fallen gleich lange Elemente aus!!!

  /** Ursprünglicher Code in der überschriebenen compareTo():
   *   public int compareTo(Person o) {
   *     return vorName.compareTo(o.vorName); // (Vorwärts-)Sortierung
   *     // return -(vorName.compareTo(o.vorName)); // Rückwärtssortierung, Alternative
   *   }
   * Erklärung:
   * Wir wollen die Personen-Objekte nach dem vorNamen sortieren. Und da vorNamen vom Datentyp String sind, können wir
   * hier einfach vorName des die Methode aufrufenden Obj. mit dem vorNamen des Obj. "o" vergleichen.
   * Als return gibt compareTo() 0, 1 oder -1.a
   */
}
}


public class Zusammenfassung {

  public static void main(String[] args) {

    // STRUKTUREN


    // (A.) LIST / LISTE -> Einkaufsliste
    List<Person> list = new ArrayList<>();

    // Elemente hinzufügen. Siehe Methoden unten!!!
    // Liste sortieren, mit der sort()-Methode aus der Klasse "Collections". Diese Methode kann ohne ein Objekt
    // der Klasse zu erstellen, genutzt werden, das eine static-Methode ist. Siehe Methode unten!!!
    // Elemente ausgeben. Siehe Methoden unten!!!

    // Hier rufen wir die Methode auf, die wir ganz unten definiert haben:
    // Wir wollen 3 Personen erstellen und wo rein wollen wir es hinzufügen, in list.


    Zusammenfassung.addElements(3, list); // Elemente hinzufügen.
    Collections.sort(list); // Elemente sortieren.
    Zusammenfassung.getElements(list); // Elemente ausgeben

    // (B.) SET / MENGE -> Schublade voll mit Elementen -> Kein doppeltes Element!!!
    Set<Person> set = new TreeSet<>();

    Zusammenfassung.addElements(5, set);
    Zusammenfassung.getElements(set);

    // Elemente hinzufügen. Siehe Methoden unten!!!
    // Elemente sortieren, einfach mit der Klasse TreeSet (statt HashSet), die sortiert beim Elemente hinzufügen.
    // Elemente ausgeben. Siehe Methoden unten!!!


    // (C.) MAP / Verbindung zwischen 2 Elementen -> Artikel hat eine einzigartige Artikelnummer!!!
//    Map<Integer, String> map = new TreeMap<>(); // Zuerst HashMap<>() erzeugt.

    // Elemente hinzufügen, nicht add, put!!! Der new-Operator ist hier bei Integer nicht notwendig weil Java kennt es.
//    map.put(4, "Katze");
//    map.put(2, "Hund");
//    map.put(1, "Kaninchen");
//    map.put(3, "Aal");

    // Elemente sortieren. Bei der Datenstruktur "TreeMap" werden die Elemente automatisch sortiert, nach den Keys.
    // Dieser Sortiert-Automatismuss existiert deshalb, weil die Elemente  vom Typ Integer sind. Integer
    // (Wrapper-Klasse) hat das Interface "Comparable" implementiert, welches Elemente vergleich und sortiert mit
    // compoareTo()-Methode. Deswegen weiß TreeMap, wonach es sortieren soll.


    // Elemente ausgeben. Hier den Typ vom Key angeben und die Methode map.keySet() nutzen. Damit iterieren wir durch
    // die Keys in der Map. Anschließend anweisen, dass der Wert für dieses Wert ausgegeben werden soll.
    System.out.println("---------");

//    for (Integer keyMapElement:map.keySet()) {
//      System.out.println("Key: " + keyMapElement + ", Value: " + map.get(keyMapElement));
//      // Key ausgeben und dann gib mir den Inhalt des Keys, also den Value.
//    }

/**
 * Die Klassen String, Integer, Float usw. haben den Interface "Comparable" (Interface "Vergleiche") implementiert.
 * Comparable hat eine einzige Methode: compareTo(), welche in der Klasse "String" implementiert worden ist. Damit
 * können String-Objekte mit compareTo() verglichen werden.
 * Deswegen ist bekannt, wonach sortiert werden soll, wenn Objekte aus Java-bekannten Klassen generiert worden sind:
 *
 * a.) Collections.sort() weiß, wie er Objekte in einer List (ArrayList oder LinkedList) sortieren soll, wenn darin
 * z.B. String-Objekte gespeichert sind.
 * b.) Die Klasse "TreeSet" bei Set, weiß, wie er z.B. String-Objekte oder Integer-Objekte, die er gespeichert hat,
 * sortieren soll.
 * c.) Die Klasse "TreeMap" weiß ebenfalls, wie es String-/Integer-/Double...Objekte, die er als Key gespeichert hat,
 * sortieren soll.
 *
 * ERGO: Sortierungen funktionieren automatisch oder durch die vorhandene Methode compareTo(), wenn in Lists, Sets und
 * Maps Daten in bekannten Typen gespeichert werden, wie String oder Integer.
 *
 *
 * compareTo()-METHODE
 * compareTo() gibt nachfolgende Werte zurück, wenn das Objekt, welche diese Methode aufruft, mit dem Objekt in
 * runden Klammern verglichen werden soll: Peter.compareTo(Chris);
 * 0 = Beide Elemente (Objekte) gleich.
 * 1 = Objekt ist größer.
 * 2 = Objekt ist kleiner.
 */

  }

  // Um den Code zu optimieren, erstellen wir eine Hinzfügen von Personen-Methode:
  // "Collection" (ohne s) -> Oberste Interface von den Interfaces List und Set!!!!!! Collection - Sammlung!!!!
  // Hier geben wir Collection als Datentyp an, damit diese Methode für Lists als auch Sets gilt.
  // Erstelle anhand der Namens-Eingabe des Users ein Objekt vom Typ Person und speichere es in meineKollektion.
  public static void addElements(int anzahlPerson, Collection<Person> meineKollektion) {
    for (int i = 1; i <= anzahlPerson; i++) {
      Scanner scanName = new Scanner(System.in);
      System.out.println("Name eingeben: ");
      String eingabeName = scanName.next();
      // Im Folgenden ist "person" eine Referenzvariable, in der nur die Objekt-Adresse gespeichert ist.
      Person person = new Person(eingabeName);
      meineKollektion.add(person);
    }
  }

  public static void getElements(Collection<Person> meineKollektion) {
    for (Person person : meineKollektion) {
      System.out.print("Name der ");
      System.out.println(person);
    }
  }

}
