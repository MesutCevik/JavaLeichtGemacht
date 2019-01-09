package com.company;

import java.util.Scanner;

public class ScannerMethoden {

  public static void main(String[] args) {

    // Mit der Klasse Scanner hat man Methoden zur Verfügung, um Eingabe-Streams (InputStreams) einzulesen.
    // D.h. man kann damit Werte einlesen, wie z.B. Zahlen.

    Scanner scanner = new Scanner(System.in); // System.in = Input = Tastatur-Eingabe.

    // Beispiel
    String name = scanner.nextLine();
    char gender = scanner.next().charAt(0); // Wir nehmen nur den ersten Buchstaben vom einzelnen Wort in scanner.next()
    int age = scanner.nextInt();
    long number = scanner.nextLong();

    scanner.close();

    System.out.println("Name: "+name);
    System.out.println("Geschlecht: "+gender);
    System.out.println("Alter: "+age);
    System.out.println("Mobilfunknummer: "+number);


    /* Was kann mit einem Objekt der Scanner-Klasse eingelesen werden?
     *
     * nextInt() - Ganzzahl, Integer
     * nextFloat() - Float
     * nextDouble() - Double
     * nextLong() - Long
     * nextShort() - Short
     * next() - Einzelnes Wort
     * nextLine() - String, Zeichenkette
     * nextBoolean() - Boolean
     *

     */
  }
}
