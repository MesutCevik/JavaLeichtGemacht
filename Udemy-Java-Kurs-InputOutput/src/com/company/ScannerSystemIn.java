package com.company;

import java.util.Scanner;

public class ScannerSystemIn {

  public static void main(String[] args){

    // Mit der Klasse Scanner hat man Methoden zur Verfügung, um Eingabe-Streams (InputStreams) einzulesen.
    // D.h. man kann damit Werte einlesen, wie z.B. Zahlen.

    Scanner scanner = new Scanner(System.in); // System.in = Input = Tastatur-Eingabe.
    int zahl = scanner.nextInt();
    System.out.println(zahl);

    scanner.close(); // Hat was mit System.in zu tun. Um die Ressource Tastatur (Input-Quelle) wieder frei zugeben.


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
