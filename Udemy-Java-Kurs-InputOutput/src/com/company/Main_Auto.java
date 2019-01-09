package com.company;

public class Main_Auto {
  public static void main(String[] args) {

    Auto bmw = new Auto();
    bmw.preis = 6000.50;
    bmw.reifen = 4;

    /* Zeile 1: Die Varialbe "bmw" vom Typ "Auto" wird deklariert. Dann wird dieser Variable der Wert, hier ein neues
     * Objekt von der Klasse "Auto" zugewiesen. D.h. in der Variable "bmw" ist ein Objekt der Klasse "Auto" gespeichert.
     * "bmw" ist eine komplexe Variable, der das erzeugte Objekt beinhaltet und der mehrere Informationen speichern kann.
     *
     * Mit dem .-Opertor können wir in dieses Objekt "bmw" reingehen und auf die darin gespeicherten Werte zugreifen.
     *
     * Zeile 2: Nun können wir mit dem .-Operator auf die Information "preis" zugreifen und ihm einen Wert zuweisen: 6000.50
     * (siehe oben 2. Zeile!)
     *
     * Zeile 3: Hier greifen wir mit dem .-Operator auf die Information "reifen" zu und weisen ihm den Wert 4 zu.
     */
  }
}
