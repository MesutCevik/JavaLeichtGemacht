package com.company;

public class BeispielMethoden {

  // MERKE: Es darf keine Methode in einer anderen Methode definiert werden.

  // Definieren der Methode main.
  public static void main(String[] args){

    // Lokale VAR innerhalb dieser main-Methode.
    int gegnerLeben = 100;
    System.out.println("Der Boss hat: " + gegnerLeben + " Lebenspunkte.");

    // Methoden werden über ihren Namen inkl. den runden Klammern aufgerufen.
    // Aufruf der Methode gegnerHit mit dem Parameter gegnerLeben + Speichern des gelieferten Ergebnisses in gegnerLeben.
    gegnerLeben = gegnerHit(gegnerLeben);
    System.out.println("Der Boss wurde getroffen, er hat noch: " + gegnerLeben + " Lebenspunkte.");

    // Gegner wurde ein weiteres mal getroffen.
    gegnerLeben = gegnerHit(gegnerLeben);
    System.out.println("Der Boss wurde getroffen, er hat noch: " + gegnerLeben + " Lebenspunkte.");

    // Gegner wurde ein weiteres mal getroffen.
    gegnerLeben = gegnerHit(gegnerLeben);
    System.out.println("Der Boss wurde getroffen, er hat noch: " + gegnerLeben + " Lebenspunkte.");

  }

  // Definieren der Methode gegnerHit.
  // AUFGABE dieser Methode: Sobald ein Geschoss den Gegener trifft, ziehe ihm 20 Lebenspunkte ab und geben
  // den aktuellen Wert seiner Lebenspunkte zurück.
  public static int gegnerHit(int aktuellLeben){

    /** Nochfolgend wird eine lokale VAR definiert:
     * Diese VAR steht nur innerhalb dieser Methode (innerhalb der geschweiften Klammern in dieser Methodendefinition)
     * zur Verfügung. Damit wir den errechneten Wert außerhalb dieser Methode nutzen können, muss der Wert
     * dem Aufrufer dieser Methode zurück gegeben werden (return!). Denn nach getaner Arbeit werden alle Daten
     * in den VAR dieser Methode vom Arbeitsspeicher gelöscht.
     */
    int neuGegnerLeben;

    neuGegnerLeben = aktuellLeben - 20; // Dieser Wert soll zurück gegeben werden.

    return neuGegnerLeben;
  }
}
