package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Adressbuch {

  public static void main(String[] args) {

    // EIGENSCHAFTEN / ATTRIBUTE
    Adresse peterAdresse = new Adresse("Peter", "Fritzlangen 4", "Berlin");
    Adresse hansAdresse = new Adresse("Hand", "Berlinerstraße 6", "Leipzig");
    Adresse michaelAdresse = new Adresse("Michael", "Leipzigerstraße 40", "Hamburg");

    // Mit folgender Anweisung erstellen wir eine ArrayList, in die Daten von allen Typen gespeichert werden können.
    //      ArrayList adressenListe = new ArrayList<>();
    // Aber das wollen wir nicht, wir wollen nur Daten vom Typ "Adresse" speichern. Also geben wir direkt nach dem
    // Schlüsselwort ArrayList einen Generic in spitzen Klammern an: <Adresse>
    //      ArrayList<Adresse> adressenListe = new ArrayList<Adresse>();

    ArrayList<Adresse> adressenListe = new ArrayList<Adresse>(); // dynamisch!
    Adresse [] adressenArray = {peterAdresse, hansAdresse, michaelAdresse}; // statisch! Deklaration + Initialisierung.
    // ALTERNATIVE: Adresse [] addressenArray = new Adresse[3]; Nur Deklaration, aber mit Größenangabe: 3.
    // 1. ArrayList, 2. Array. Array mit drei Werten.
    // NACHTEIL von Array: Bei der Deklaration oder Initialisierung muss die feste Größe angegeben werden, also
    // die Anzahl der Felder, in die Werte gespeichert werden. Daher: statisch!

    // EINGABE IN LISTE
    adressenListe.add(peterAdresse);
    adressenListe.add(hansAdresse);
    adressenListe.add(michaelAdresse);

    Scanner scanner = new Scanner(System.in); // User Eingabe ermöglichen.
    String name = scanner.nextLine(); // Klasse Adresse hat 3 Var vom Typ String. Diese wollen wir speichern.
    String strasse = scanner.nextLine(); // nextLine() liest die Tastatureingabe des Users.
    String stadt = scanner.nextLine();

    // Z1: Neues Objekt erstellen, um die oben eingelesenen Daten zu speichern aus den Var name, strasse, stadt.
    // Z2: Füge in die ArrayList adressenListe den Inhalt des neuen Objekts hinzu. Die Eingaben haben feste Indexe.
    Adresse adresse4 = new Adresse(name, strasse, stadt);
    adressenListe.add(adresse4);

    // Füge in das Array adressenArray an 3. Postion den Inhalt von adresse4.
    // DAS FUNKTIONIERT NICHT, weil bei der Erstellung des Arrays nur 3 Felder fest vorgegeben haben.
    adressenArray[3] = adresse4;

    System.out.println("ArrayList");
    // AUSGABE DER LISTE
    for (Adresse adresse:adressenListe) {
      System.out.println("Name: " + adresse.getName() + ", Straße: " + adresse.getStrasse() + ", Stadt: " + adresse.getStadt());
    }
    /** for-each-Schleife:
     * Oben ist die Variable "adresse" ein Platzhalter, welcher nacheinander alle Elemente aus der ArrayList
     * "adressenListe" annimmt, damit dafür der Anweisungsblock ausgeführt wird.
     * 1. Durchgang: adresse = peterAdresse.
     * 2. Durchgang: adresse = hansAdresse.
     * 3. Durchgang: adresse = michaelAdresse.
     */

    System.out.println(" "); // Leerzeile
    System.out.println("Array");
    for (Adresse adresse: adressenArray) {
      System.out.println("Name: " + adresse.getName() + ", Straße: " + adresse.getStrasse() + ", Stadt: " + adresse.getStadt());

    }

  }

}
