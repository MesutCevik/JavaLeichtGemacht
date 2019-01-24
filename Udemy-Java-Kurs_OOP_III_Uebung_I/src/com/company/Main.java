package com.company;

public class Main {

    public static void main(String[] args) {

        Mainboard mainboardAsus = new Mainboard(4, 2, 4);
        Computer computerPeter = new Computer("Intel", mainboardAsus, 400);

        System.out.println(computerPeter.mainboard.usbPorts);

        Computer computerOlga = new Computer(2, 1, 2, "AMD", 350);
        System.out.println(computerOlga.mainboard.ramSlots);

    }
}


/** Aufgabe: Erstelle 2 Objekte mit hat-Beziehung
 * Objekt 1:
 * computerPeter: cpu = "Intel", preis = "400"
 * computerPeter hat ein mainboardAsus: ramSlots = 4, kartenSlots = 2, usbPorts = 4
 *
 * Objekt 2:
 * computerOlga: cpu = "AMD", preis: "350"
 * computerOlga hat ein mainboardAsrock: ramSlots = 2, kartenSlots = 1, usbPorts = 2
 */
