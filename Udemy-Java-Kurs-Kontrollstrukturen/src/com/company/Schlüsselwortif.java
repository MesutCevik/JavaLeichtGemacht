package com.company;

public class Schlüsselwortif {
  public static void main(String[] args) {
    // write your code here

    /* Kontrollstrukturen steuern den Programmablaufplan
    * D.h. man kann mit Kontrollstrukturen den Programmablauf steuern.
    *
    * if - falls
    * else - ansonsten
     */

    int score = 4000;

    if(score == 5000){ // Die Bedingung in () muss immer true sein, damit Anweisungsblock ausgeführt wird.
      System.out.println("Herzlichen Glückwunsch, neuer Rekord!");

      // Anweisungsblock (Der Block zwischen den geschweiften Klammern)
    } else {
      System.out.println("Schade, dein Score reicht leider nicht!");
    }

    int lebenPlayer = 0;

    if (lebenPlayer == 0){ // Die Bedingung in () ist true, also wird der Code im Anweisungsblock ausgeführt.
      System.out.println("Spiel verloren!");
    }

    boolean gegnerHit = false;
    int highscore = 0;

    if (gegnerHit == true){ // Diese Bedingung ist aktuell false, da gegnerHit = false.
      System.out.println("Gegner getroffen!");
      highscore += 10;
      System.out.println("Highscore: "+highscore);
    } else {
      System.out.println("Daneben getroffen!");
    }
  }
}
