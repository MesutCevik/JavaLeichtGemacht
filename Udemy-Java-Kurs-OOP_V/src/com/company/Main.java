package com.company;

public class Main {

    public static void main(String[] args) {

        // Mit dem Konstruktor GalaxyJ3() ein neues GalaxyJ3 erzeugen und die Obektvariablen direkt mit Werten belegen.
        GalaxyJ3 peterGalaxy = new GalaxyJ3(500, "Smartphone");
        peterGalaxy.powerOn();





        // Tier tier1 = new Tier("Tier1", 30, 30);
        /** BEMERKUNG:
         * Eigentlich wollen wir aus der Klasse "Tier" keine Objekte erstellen. Denn die Klasse Tier beschreibt nur
         * allgemein die Eigenschaften und die Verhaltensweisen eines Tieres. Ein allgemeines Tier interessiert uns
         * nicht, wir wollen konkrete Tiere als Objekte abbilden.
         *
         * Wie ein Tier konkret aussieht und welche Verhaltensweisen es haben soll, wollen wir in einer Subklasse,
         * z.B. Hund, beschreiben.
         *
         * Dafür setzen wir die Klasse "Tier" auf abstract.  es die abstract Klasse.
         * Aus einer abstrakten Klasse (mit dem Schlüsselwort "abstact") können keine Objekte erzeugt werden.
         * Die Erstellung von Objekten geschieht über andere, also Subklassen.
         *
         * Mit einer abstrakten Klasse sagen wir, was getan werden muss, aber nicht wie es getan werden muss. Letzteres
         * erfolgt dann in einer oder mehreren Subklassen.
         */

    }
}
