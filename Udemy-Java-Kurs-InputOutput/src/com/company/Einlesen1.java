package com.company;

import java.util.Scanner;

public class Einlesen1 {
  public static void main(String[] args) {

    /* Klasse und Objekt
    * Klasse = Ein komplexer Datentyp, in der mehr als nur eine Information gespeichert werden.
    *
    * Anders ausgedrückt: Eine Klasse ist ein komplexer Datentyp, eine Schablone, mit der wir mit Hilfe des new-Operators Objekte erzeugen.
    *
    * Ein Objekt ist ein komplexer Container, in dem mehr als eine Information gespeichert ist.
    */

    /* Ein Objekt aus einer Klasse erstellen
    * Der "new"-Operator erstellt ein Objekt aus einer Klasse. Die gewählte Klasse stellt dabei eine Schablone dar,
    * mit der ein Objekt mit bestimmten Eigenschaften erstellt wird.
    *
    * Zeile 1: Zuerst wird eine Variable "scan" vom Typ Scanner erstellt. Scanner ist ein komplexer Datentyp,
    * eine Klasse. Eine Klasse ist wie eine Schablone, von der Objekte erstellt werden können.
    * Dann generiert der "new"-Operator ein Objekt der Klasse "Scanner" und weist es der Variable "scan" zu. Erst jetzt
    * kann mit dieser Variable auf das neue Objekt bzw. seine Inhalte zugegriffen werden.
    *
    * Zeile 2: Dem User wird ein Text ausgegeben und damit aufgefordert, eine Zahl einzutippen.
    * Die Eingabe des Users wird im Scanner-Objekt erfasst und damit in der Variable "scan" gespeichert.
    *
    * Zeile 3: Damit auf den Inhalt des Scanner-Objekts "scan" zugegriffen werden kann, wird der "."-Operator genutzt.
    * Mit dem "."-Operator (Punkt-Operator) wird in das Objekt "scan" reingegangen und darin mit der Methode
    * "nextDouble()" auf den eben vom User eingegebenen Wert zugegriffen. Die Eingabe des Users wird als double
    * ausgelesen und der Variable "zahl" zugewiesen.
    *
    * Zeile 4: Gibt den Inhalt der Variable "zahl" aus.
    */

    Scanner scan = new Scanner(System.in);
    System.out.println("Bitte eine Zahl eintippen ...");
    double zahl = scan.nextDouble();
    System.out.println(("Ihre Zahl lautet: " + zahl));

    /* Erklärung:
    * Zeile 1: Der new-Operator generiert ein neues Objekt von der Scanner-Klasse und weist es der Variable "scan2" zu.
    * Zeile 2: Es wird ein Text ausgegeben, mit dem der User aufgefordert wird, einen String (seinen Namen) einzutippen.
    * Zeile 3: Zuerst wird die String-Variable "zeichenkette" deklariert. Dann wird ihm mit dem "."-Operator
    * ein Wert aus dem Scanner-Objekt "scan2" initial zugewiesen, also initialisiert. Dabei wird mit dem "."-Operator
    * für das Scanner-Objekt scan2 die Methode "next()" ausgeführt. Diese Methode holt aus scan2 den nächsten
    * String-Wert, also eine Zeichenkette.
    * Zeile 4: Der Inhalt der Variable "zeichenkette" wird ausgegeben.
    */

    Scanner scan2 = new Scanner(System.in);
    System.out.println("Geben Sie Ihren Namen ein: ");
    String zeichenkette = scan2.next();
    System.out.println("Ihr Name lautet: "+zeichenkette);

    /*
    * Zeile 1: Ein Text wird ausgegeben, welchen der User auffordert, seinen Alter einzugeben.
    * Zeile 2: Zuerst wird die Integer-Variable "alter" deklariert. Dann wird beim Scanner-Objekt "scan2" mit dem
    * "."-Operator die Methode "nextInt()" angewendet, um den nächsten Integer-Wert auszulesen. Dieser wird dann
    * der Varialbe "alter" initial zugewiesen (initialisiert).
    * Zeile 3: Gibt den Wert der Integer-Variable "alter" aus.
     */
    System.out.println("Geben Sie Ihr Alter ein: ");
    int alter = scan2.nextInt();
    System.out.println("Ihr Alter ist: "+alter);

    System.out.println("Ihr Name: "+zeichenkette+", Ihr alter: "+alter);


    /* Die String-Klasse

    * Die String-Klasse ist ebenfalls ein komplexer Datentyp, aber ein besonderer. Daher funktioniert diese Klasse
    * bei der Erzeugung von Objekten auch ohne den new-Operator:
    *   String zeichenkette = "Ich bin eine tolle Zeichenkette";
    * Hier steht nach dem "=" kein new-Operator, weil sie den nicht gebraucht wird.
    *
    * Eigentlich müsste es so sein:
    *   String zeichenkette = new String("Ich bin eine tolle Zeichenkette");
     */
  }
}