package com.company;

import java.util.*;

// Man kann mehrere Klassen in einer Datei erstellen, aber nur eine kann "public" (Modifikator) sein.
class Person {
  // EIGENSCHAFTEN / ATTRIBUTE
  private int id;
  private String name;

  // KONSTRUKTOR
  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // METHODE:
  /*
  Die Methode toString() macht alles zu String. Sie ist in der Klasse Object definiert.
  Aufgabe dieser Methode: Jedes Objekt - egal wie komplex - immer in einem String wiedergeben.
  HINTERGRUNG: Jede Klasse erbt automatisch die Methoden von der Klasse "Object", egal ob wir mit extends aus dieser
  Klasse etwas erben lassen oder nicht. Als aller erstes kommt immer Object. Objekts is die Superklasse.
  Unter anderem wird auch die Methoden toString() geerbt.
  Genauso hat auch diese neue Klasse "Person" von Objekts geerbt, u.a. auch die toString-Methode.
  */

  public String toString() {
    return "ID: " + this.id + ", Name: " + this.name;
  }

  // Die folgenden Methoden eauals() und hashCode() werden benötigt, weil ansonsten bei eigens erstellten Klassen in
  // einem Set oder in einer Map nicht verglichen werden können. Dann werden Values doppelt hinzugefügt, was bei Set
  // u. Map nicht sein darf.j Daher werden diese überschrieben
  // equals(): Indicates whether some other object is "equal to" this one. Vergleicht zwei Strings.
  // hashCode(): Returns a hash code value for the object. Zwei Hash-Werte können identisch sein. Daher werden in der
  // equals()-Methode 2 Werte verglichen, wenn zwei Hash-Werte gleich sind. (?!?!)
  // ERGO: Diese beiden Methoden sorgen dafür, dass in Sets und Maps zwei Werte miteinander verglichen werden können.

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    if (id != person.id) return false;
    return name != null ? name.equals(person.name) : person.name == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }
}


public class Main {

  public static void main(String[] args) {

    // Wichtigster Unterschied zwischen Set und List:
    // In einem Set kann kein Element (Objekt) doppelt vorkommen, da jedes Element als einzigartig gilt.

    /** Klassen, die ein Set realisieren:
     * 1) TreeSet
     * 2) HashSet
     * 3) LinkedHashSet
     */

    // DATENSTRUKTUREN ERZEUGEN
    // Recap: Wir nennen als Datentyp den Interface-Namen "List", weil wir den Konstruktor "ArrayList()" später ganz
    // einfach in "ListLink()" ändern können.
    List<String> list1 = new ArrayList<String>();

    // Recap: In Dreiecksklammern steht der Datentyp/Typ für die Elemente, die wir speichern wollen.
    // Wir nennen als Datentyp den Interface-Namen "Set", weil wir den Konstruktor "TreeSet()" später ganz einfach in
    // "HashSet()" od. "LinkedHashSet()" ändern können, weil alle 3 Klassen die Methoden des Interfaces "Set" implementieren.
//    Set<String> set1 = new TreeSet<String>();
    Set<Person> set2 = new HashSet<Person>();
//    Set<String> set3 = new LinkedHashSet<String>();

    // DATENEINGABE
    // ArrayList
//    list1.add("Peter");
//    list1.add("Adrian");
//    list1.add("Michi");
//    list1.add("Peter");
//    list1.add("Bernt");

    // TreeSet
//    set1.add("Peter");
//    set1.add("Adrian");
//    set1.add("Michi");
//    set1.add("Peter");
//    set1.add("Bernt");
    // Sortiert die Elemente bereits bei der Eingabe in die Datenstruktur, undzwar nach der natürlichen Ordnung.
    // Der doppelte Wert "Peter" wird nur einmal ausgegeben, weil TreeSet das Interface Set implementiert hat.
    // Die Ausgabe erfolgt in der natürlichen Ordnung (ABC..., 123...), also alphabetisch, numerisch sortiert.

    /** Diese Person-Objekte wollen wir in unsere Struktur HashSet "set2" hinzufügen und den Unterschied zwischen
     * Klassen wie String od. Integer, die Java bereits kennt, und den Klassen, die wir individuell erstellen, zu sehen.
     *
     * WIR SEHEN UND MERKEN:
     * Wir erstellen eine individuelle Klasse "Person" und erstellen daraus Objekte. Diese Objekte fügen wir mit
     * der add()-Methode dem HashSet "set2" hinzu (siehe unten!). Dabei werden auch doppelte Objekte in dei HashMap
     * hinzugefügt, was aber bei einem Set nicht sein darf.
     * Der Grund für dieses Verhalten ist, dass in der Klasse "Person" keine Mehtoden zum Vergleichen von Strings
     * vorhanden sind. Normalerweise haben Klassen wie String die Methoden HashCode() und equals() von der Superklasse
     * "Object" implementiert. Dies müssen wir auch in unserer individuell erstellten Klasse tun.
     * Daher überschreiben wir in der Klasse "Person" die Methoden HashCode() und equals() der Superklasse "Object".
     * Danach kann die add() beim Hinzufügen neuer Elemente diese nach Dopplungen vergleichen und erst gar nicht
     * speichern, wenn ein Objekt bereits vorhanden ist. Siehe Beispiel unten!!! 6 Objekte (Personen) von der Klasse
     * "Person" werden dem HashSet2 hinzugefügt. Übernommen werden nur 4, weil 2 Person-Objekte doppelt sind.
     *
     * ERGO: Willst Du Objekte aus deinen eigens erstellten Klassen in einem Set oder als Schlüssel in einer Map
     * verwenden, so müssen die Klassen die Methode hashCode() und equals() implementieren.
     * Einfach vom IDE erstellen lassen!!!
     */

    Person p1 = new Person(1, "Chris");
    Person p2 = new Person(2, "Peter");
    Person p3 = new Person(3, "Hans");
    Person p4 = new Person(4, "Petra");
    Person p5 = new Person(1, "Chris");
    Person p6 = new Person(4, "Petra");


    // HashSet
    set2.add(p1);
    set2.add(p2);
    set2.add(p3);
    set2.add(p4);
    set2.add(p5);
    set2.add(p6);
    // set2.add("Bernt");
    // Die Elemente sind niemals sortiert und können ihre Position beliebig oft wechseln. HashSets sind immer
    // ungeordnet. (Merke: "Alles ungeordnet rein in Schublade. Bei jedem Öffnen andere Sortierung").
    // Der doppelte Wert "Peter" wird nur einmal ausgegeben, weil HashSet das Interface Set implementiert hat.
    for (Person person : set2) {
      System.out.println(person);

    }


    // LinkedHashSet
//    set3.add("Peter");
//    set3.add("Adrian");
//    set3.add("Michi");
//    set3.add("Peter");
//    set3.add("Bernt");
    // Die eingegebenen Elemente werden in der selben Reihenfolge gespeichert, wie sie eingegeben wurden.
    // Der doppelte Wert "Peter" wird nur einmal ausgegeben, weil LinkedHashSet das Interface Set implementiert hat.
    // Das zweite Element "Peter" wird erst gar nicht gespeichert.
    // Jedes Element kennt den vorherigen und nachkommenden, sie sind also verkettet.


    // DATENAUSGABE
//    System.out.println("Ausgabe ArrayList: ");
//    Main.getElement(list1);
//    System.out.println("\nAusgabe TreeSet: ");
//    Main.getElement(set1);
//    System.out.println("\nAusgabe HashSet: ");
//    Main.getElement(set2);
//    System.out.println("\nAusgabe LinkedHashSet: ");
//    Main.getElement(set3);
//  }

    // Trick: Wir geben als Parameter das über List und Set geordnete Interface "Collection" an.
    // Damit wären wir bei der Ausgabe mit dieser Methode flexibel, wenn wir mal eine ArrayList, dann TreeSet usw.
    // ausgeben wollen.
    // Recap: "static": Damit wir getElement ausführen können, müssen wir kein Objekt dieser Klasse (Main) erstellen.
    // wir können diese Methode einfach mit Main.getElement(...); ausführen.
//  public static void getElement(Collection<String> collection) {
//    for (String stringAusCollection : collection) {
//      System.out.println(stringAusCollection);
//    }
  }

}
