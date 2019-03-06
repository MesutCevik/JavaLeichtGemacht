package com.company;

public class Main {

    public static void main(String[] args) {

        Computer cp1 = new Computer();
        System.out.println(cp1.mainboard);

        /**
         * Im obigen Beispiel geben wir in der Konsole die Variable "mainboard" aus. Aber wir haben noch kein Objekt
         * der Klasse Mainboard erstellt. Daher kommt als Ausgabewert "null" (sprich: nall) raus.
         * Übrigens: "mainborad" ist eine Referenzvariable, weil es ein komplexer Datentyp ist.
         * null = In der Variable cp1.mainboard ist keine Adresse von einem Objekt gespeichert.
         *
         * Wenn aber ein Objekt mainboard vo Typ Mainboard erzeugt haben, steht dann in mainboard (der Referenzvariable)
         * die Adresse zum Speicherot.
         */

        Mainboard board1 = new Mainboard();
        System.out.println(board1);

        /**
         * Wenn wir ein Objekt der Klasse Mainboard erstellen und anschließend den Inhalt der Referenzvariable "board1"
         * ausgeben, dannn erhalten wir die Adresse zum Speicherplatz der Inhalte: com.company.Mainboard@22a71081
         *
         * Wie bekommen wir eine Verbindung zwischen cp1 (dem Computer-Objekt) und board1 (einem Mainboard-Objekt) her?
         * Denn cp1 hat ja ein Mainboard. Siehe unten!
         */

        // Im nachfolgenden Code weisen wir der Variable "mainbord" des Objects cp1 die Variable "cp1" zu.
        // Anders ausgedrückt: Wir weisen das Mainboard-Objekt "board1" dem Attribut "mainboard" des Objekts "cp1" zu.
        // Beide Variablen sind vom gleichen Datentyp: Mainboard.
        // Bei der Konsolen-Ausgabe der Variable/des Attributs "mainboard" von cp2 kommt die Adresse zum Speicherplatz
        // von board1: com.company.Mainboard@22a71081


        cp1.mainboard = board1;
        System.out.println(cp1.mainboard);

        // 2. Beispiel:
        Mainboard board2 = new Mainboard();
        Computer cp2 = new Computer("Intel", board2, 500);

    }
}

/** RECAP 2:
 * Mainboard board2 = new Mainboard();
 * Computer cp2 = new Computer("Intel", board2, 500);
 *
 * ZEILE 1:
 * Mainboard (Datentyp) board2 (Variable ) = (Zuweisungsoperator) new (Schlüsselwort) Mainboard() (Konstruktor);
 * Oben ist ein Standard-Konstruktor, welcher keine Parameter benötigt, um ein Objekt dieser Klasse zu erzeugen.
 *
 * ZEILE 2:
 * Computer (Datentyp) cp2 (Variable ) = (Zuweisungsoperator) new (Schlüsselwort) Computer("Intel", board2, 500)
 * (Individueller Konstruktor mit Parametern)
 * Der indiv. Konstruktor erstellt mit den angegebenen Parameterwerten ein Objekt der entsprechenden Klasse.
 * WICHTIG 1: Als Parameter wird auch ein Objekt der Klasse Mainboard übergeben, da ein Computer-Objekt einen Mainboard
 * HAT!!!
 *
 * WICHTIG 2: Das erstellte Objekt, welcher einer Referenzvariable zugewiesen wird, nennt man auch eine "INSTANZ".
 * ES IST EINE INSTANZ DER ENTSPRECHENDEN KLASSE.
 */


/** RECAP 1:
 * Computer cp1 = new Computer();
 * System.out.println(cp1.mainboard);
 *
 * "Computer" = Datentyp bzw. Klasse der Variable "cp1".
 * "cp1" = Eigenschaft / Attribut. Hier ist cp1 eine Referenzvariable, weil es von einem komplexen Datentyp ist.
 * In "cp1" ist die Adresse (zum Speicherplatz) von diesem neu erstellten Objekt enthalten. Nicht die Inhalte selbst.
 * Über diese Adresse können wir auf alle Variablen und Methoden in diesem Objekt zugreifen.
 * "new" = Der "new"-Operator erstellt ein neues Objekt mit dem Konstruktor "Computer()".
 * "Computer()" = Der Konstruktor der Klasse "Computer". Dieser erzeugt ein Objekt von der Klasse "Computer".
 */
