package com.company;

public class intFloatDouble {
  public static void main(String[] args) {

    int varZahl1 = 10/3;
    float varZahl2 = 10f/3f;
    double varZahl3 = 10d/3d;

    /* Was ist der Unterschied zwischen float und double?
    * Der Wertebereich ist unterschiedlich. Ein double hat deutlich mehr Nachkommastellen als ein float.
    * Genau gesagt hat ein double einen doppelt so vielen Wertebereich wie ein float. Deswegen wird es double genannt.
    *
    * Ein double braucht 8 Byte Speicherplatz, ein float braucht lediglich die Hälfte, 4 Byte.
    *
    * Verwende im Regelfall:
    * ... für Ganzzahlen --->>> int
    * ... für Dezimalzahlen --->>> double
     */
    System.out.println("int "+varZahl1);
    System.out.println("float "+varZahl2);
    System.out.println("double "+varZahl3);

  }
}