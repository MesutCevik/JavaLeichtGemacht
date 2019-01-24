package com.company;

public class Main {

    public static void main(String[] args) {

        // VARIANTE 1: OBJEKT ERZEUGEN MIT DEM STANDARD-KONSTRUKTOR
        // Dem Konstruktor werden keine Parameterwerte übergeben. Daher wird 1. das Objekt mit new und Konstuktor
        // erzeugt. 2. Dann werden die Parameterwerte dem Objekt übergeben. 3. Anschließend werden Methoden aufgerufen.
        Schaf binga = new Schaf();
        binga.mengeWolle = 7;
        binga.rasieren();


         /** VARIANTE 2: OBJEKT ERZEUGEN MIT DEM INDIVIDUELLEN KONSTRUKTOR
         Dem Konstruktor werden die Parameterwerte (Eigenschaften) direkt beim Aufruf übergeben. Danach können
         Methoden aufgerufen werden.
         Z1: Ein Objekt mit Eigenschaften der Superklasse erzeugen u. direkt mit Werten befüllen.
         Z2: Eine Methode der Superklasse aufrufen.
         Z3: Eine Methode der Subklasse "Hund" aufurfen.*/
        Hund bello = new Hund("Bello", 3, 5, 42);
        bello.essen();
        bello.bellen();


        // VARIANTE 2: OBJEKT ERZEUGEN MIT DEM INDIVIDUELLEN KONSTRUKTOR
        Kuh olga = new Kuh("Olga", 150, 600, 4);
        olga.essen();


        // AUTO BEISPIELE
        BMW x1 = new BMW(130, 4, "Kompakt-SUV", true);
        System.out.println("Toll! Wir haben einen BMW erstellt!");

        Audi a3 = new Audi(180, 4, "Kompaktklasse", false);
        a3.starten();
    }
}
