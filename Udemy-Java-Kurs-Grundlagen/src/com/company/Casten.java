package com.company;

public class Casten {
  public static void main(String[] args){
    /* Was ist eine Typumwandlung/Casten?
    *
    * Eine Umwandlung von einem Datentypen in einen anderen Datentypen.
     */

    int userAlter = (int) 18.5; // (int) = Das ist ein Cast-Operator.
    System.out.println(userAlter);
    // Das ist das "explizite Casting".

    // Implizites und explizites Casten

    /* Implizites Casten:
    * Eine Zahl aus einem kleineren Datentyp wird in eine Zahl aus einem größeren Datentypen umgewandelt.
    * Von klein nach groß. Kein Datenverlust.
    * Umwandlung findet bei Zuweisung statt. D.h. der Cast-Operator ist nicht notwendig.
    */



    int zahl1 = 30;
    double zahl2 = zahl1; // Hier kein Fehler, da kein Datenverlust (implizites Casten).
    System.out.println(zahl2);

    /* Explizites Casten:
    * Eine Zahl aus einem größeren Datentyp wird in eine Zahl aus einem größeren Datentypen umgewandelt.
    * Von groß nach klein. Datenverlust wird in Kauf genommen.
    * Umwandlung findet mit Hilfe des cast (Datentyp)-Operators statt. (Zuweisungsoperator)
    */

    // 1. Auto = 3450,45 €, 2. Auto = 2690,94
    int autoPreis1 = (int)3450.45;
    int autoPreis2 = (int)2690.94;

    int gesamtPreis = autoPreis1 + autoPreis2;
    System.out.println(gesamtPreis);

  }
}
