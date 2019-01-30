package com.company;

import java.util.ArrayList;

public class Adressbuch {

  public static void main(String[] args) {

    // EIGENSCHAFTEN / ATTRIBUTE
    Adresse peterAdresse = new Adresse("Peter", "Fritzlangen 4", "Berlin");
    Adresse hansAdresse = new Adresse("Hand", "Berlinerstraße 6", "Leipzig");
    Adresse michaelAdresse = new Adresse("Michael", "Leipzigerstraße 40", "Hamburg");

    // Mit folgender Anweisung können wir in die ArrayList Daten von allen Typen speichern.
    // ArrayList adressenListe = new ArrayList<>();
    // Aber das wollen wir nicht, wir wollen nur Daten vom Typ "Adresse" speichern. Also geben wir direkt nach dem
    // Schlüsselwort ArrayList einen Generic in spitzen Klammern an: <Adresse>

    ArrayList<Adresse> adressenListe = new ArrayList<Adresse>();

    // EINGABE IN LISTE
    adressenListe.add(peterAdresse);
    adressenListe.add(hansAdresse);
    adressenListe.add(michaelAdresse);

    // AUSGABE IN LISTE
    for (Adresse adresse:adressenListe) {
      System.out.println("Name: " + adresse.getName() + ", Straße: " + adresse.getStrasse() + ", Stadt: " + adresse.getStadt());
    }
    /** for-each-Schleife:
     * 1. Durchgang: adresse = peterAdresse.
     * 2. Durchgang: adresse = hansAdresse.
     * 3. Durchgang: adresse = michaelAdresse.
     */
  }

}
