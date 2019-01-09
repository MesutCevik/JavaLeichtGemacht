package com.company;

public class VerzweigungIfElse {

  public static void main(String[] args){

    // Kontrollstrukturen steuern den Programmablaufplan

    // if - falls
    // else - ansonsten

    int i = 10;
    if (i == 1){
      System.out.println("Zahl in i ist: " + i);
    } else if(i >= 1) {
      System.out.println("Zahl in i ist: " + i);
    } else if(i <=1) {
      System.out.println("Zahl in i ist: " + i);
    } else {
      System.out.println("Zahl unbekannt!");
    }
    // Mit der obigen Kontrollstruktur kann man eine Liste aufbauen und verschiedene Bedinungen prüfen.
    // Je nach dem was die Prüfungen ergeben haben, wird eine andere Aktion ausgeführt (der Code im Anweisungsblock).

    // Weiteres Beispiel:
    int score = 8000;
    int lebenPlayer = 3;

    if (score == 1000){
      System.out.println("Du hast 1 von 3 Sternen erhalten.");
    } else if (score == 5000){
      System.out.println("Du hast 2 von 3 Sternen erhalten.");
    } else if (score > 5000){
      System.out.println("Du hast 3 von 3 Sternen erhalten.");
      lebenPlayer += 1; // Der Variable lebenPlayer wird mit dem Zuweisungsoperator += 1 Leben hinzugefügt.
      System.out.println("Deine Leben betragen jetzt: " + lebenPlayer+".");

    }

  }
}
