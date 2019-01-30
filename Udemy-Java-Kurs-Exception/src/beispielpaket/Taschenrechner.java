package beispielpaket;

public class Taschenrechner {

  // EINGENSCHAFTEN / ATTRIBUTE

  // KONSTRUKTOR

  // METHODEN
  public static void plus(int userZahl1, int userZahl2) {
    System.out.println("Ergebnis: " + (userZahl1 + userZahl2));
  }

  public static void minus(int userZahl1, int userZahl2) {
    System.out.println("Ergebnis: " + (userZahl1 - userZahl2));
  }

  public static void dividiere(int userZahl1, int userZahl2) throws Exception {
    if (userZahl2 == 0) {
      throw new Exception(); // Schmeiße jetzt eine neue Exception aus!
    } else {
      System.out.println("Ergebnis: " + (userZahl1 / userZahl2));
    }
  }

  /** ERKLÄRUNG zum Schlüsselwort "static":
   * Mit dem Schlüsselwort "static" werden aus den Methoden oben keine Objektmethoden gemacht sondern Klassenmethoden.
   * Das bedeutet, um diese Methoden nutzen zu können, muss kein Objekt der Klasse Taschenrechner erstellt werden.
   * Zum Aufrufen geht man über den Klassennamen "Taschenrechner" und dem .-Operator und greift auf die jeweilige Methode zu.
   */

  /** ERKLÄRUNG zu throw und trows
   * (a) throws = ich drohe eine Exception zu schmeißen! Ich könnte einen Fehler schmeißen.
   *
   * (b) throw = ich schmeiße jetzt eine Exception!
   *
   * throws =
   */

}
