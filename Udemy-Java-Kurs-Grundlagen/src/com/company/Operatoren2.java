package com.company;

public class Operatoren2 {
  public static void main(String[] args) {
    /*
    * Die Vergleichsoperatoren werden oft im Zusammenhang mit if-else Konstruktionen verwendet.
    * Beispiel:
    *
    * if (Bedingung) {
    * Wenn die Bedingung true = also gleich wahr ist, dann wird alles zwischen { } ausgeführt.
    * }
    *
    * if = zu Deutsch "falls".
    * else = ansonsten
     */

    int lebenGegner = 0;
    boolean hit = false;

    int a = 3;
    int b = 3;
    boolean c; // 1. true, 2. flase

    c = a < b;
    System.out.println(c);

    if(lebenGegner == 0 || hit == true){ // Die if-Bedingung ist entweder (true) oder (false).
       System.out.println("Gegener zerstört.");
    }else {
      System.out.println("Gegener hat noch: " + lebenGegner + " Punkte.");
    }
  }
}
