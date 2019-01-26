package com.company;

public class Main {

    public static void main(String[] args) {

        Mainboard mainboardAsus = new Mainboard(4, 2, 4);
        Computer computerPeter = new Computer("Intel", mainboardAsus, 400);

        System.out.println(computerPeter.mainboard.usbPorts);

        Computer computerOlga = new Computer(2, 1, 2, "AMD", 350);
        System.out.println(computerOlga.mainboard.ramSlots);


        Auto bmw = new Auto("BMW", "GoodYear", "Winterreifen");
        System.out.println(bmw.ausgabeDaten());

        Auto vw = new Auto("VW", "Michelin", "Sommerreifen");
        System.out.println(vw.ausgabeDaten());
    }
}


/** Erklärung zu: System.out.println(computerOlga.mainboard.ramSlots);
 * Beim Ausgeben in der Konsole geben wir genau an, den Wert welcher Variable wir ausgeben wollen.
 * computerOlga = Objekt, welcher mit dem Konstruktor einer Klasse erzeugt wurde.
 * '.'-Operator = Damit gehen wir in das Objekt computerOlga rein.
 * mainboard = Wir greifen auf die Variable "mainboard" des Objekcts computerOlga zu. Diese Variable ist selber eine
 * komplexe Variable in der weitere Variablen enthalten sind. Anders ausgedrückt, mainboard ist ein Objekt, im Objekt
 * Computer.
 * '.'-Operator = Damit gehen wir in das Objekt mainboard rein.
 * ramSlots = Wir greifen im mainbord-Objekt auf die Variable ramSlots zu und geben den Inhalt aus.
 */

/** Übung - Aufgabe 2:
 * 1) Die Methode ausgabeDaten() soll die autoMarke sowie die reifenMarke und den reifenTyp ausgeben können.
 * 2) In der Main-Klasse 2 Objekte vom Typ Auto erstellen (Variablenname bmw und vw)
 * 2.1) Objekt 1: autoMarke: BMW, reifenMarke: GoodYear, reifenTyp: Winterreifen.
 * 2.2) Objekt 2: autoMarke: VW, reifenMarke: Michelin, reifenTyp: Sommerreifen.
 * 3) Dei Objekte bmw und vw sollen die Methode ausgabeDaten() aufrufen.
 */


/** Übung - Aufgabe 1:
 * 1) Klasse Auto erstellen
 * 2) Klasse Reifen erstellen
 * 3) In der Klasse Reifen einen Konstruktor anlegen, der das Objekt mit Werten belegen kann.
 * 4) In der Klasse Auto einen Konstruktor anlegen, der das Objekt mit Werten belegen kann.
 *
 * Klasse kennt Klasse
 * ODER
 * Objekt hat eine anderes Objekt
 *
 * a) Auto:
 * Variablen: autoMarke: String, reifen: Reifen
 * Konstruktor: Auto() und Auto(...)
 * Methode: ausgabeDaten()
 *
 * b) Reifen
 * Varaiblen: reifenMarke: String, reifenTyp: String
 * Konstruktor: Reifen(), Reifen(...)
 */





/** Beispiel 1: Erstelle 2 Objekte mit hat-Beziehung
 * Objekt 1:
 * computerPeter: cpu = "Intel", preis = "400"
 * computerPeter hat ein mainboardAsus: ramSlots = 4, kartenSlots = 2, usbPorts = 4
 *
 * Objekt 2:
 * computerOlga: cpu = "AMD", preis: "350"
 * computerOlga hat ein mainboardAsrock: ramSlots = 2, kartenSlots = 1, usbPorts = 2
 */
