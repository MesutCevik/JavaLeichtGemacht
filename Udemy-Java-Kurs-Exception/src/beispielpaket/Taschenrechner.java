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

  // Mit der Mehtode "NichtDurchNulltTeielenException wollen wir nur Fehler auffangen, welche vom User gemacht wurden.
  // Wir wollen nicht unsere Eigenen Fehler auffangen.
  public static void dividiere(int userZahl1, int userZahl2) throws NichtDurchNullTeilenException {
    if (userZahl2 == 0) {
      // Schmeiße jetzt eine neue Exception von der Klasse "NichtDurchNullTeilenException" aus!
      throw new NichtDurchNullTeilenException("Hey, Du darfst keine Null eintippen!");
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
   * (a) throws = ich drohe an, eine Exception zu schmeißen! Ich könnte eine Fehlermeldung schmeißen.
   *      Im Methodensignatur / Methodenkopf von dividiere() signalisiert das Schlüsselwort "throws", dass eine
   *      Exception geworfen werden kann. In der Methoden-Deklaration muss daher stehen: throws Exception
   *
   * (b) throw = ich schmeiße jetzt eine Exception!
   *      Im Code-Block/Anweisungsblock sorgt das Schlüsselwort "throw" dafür, dass eine Exception ausgeworfen wird,
   *      wenn die if-Bedingung wahr ist.
   *      Mit dem new-Operator wird eine neues Exception-Objekt erstellt und geworfen.
   *
   *
   *
   * "Exception" ist eine eigene Superklasse. Wir können auch eigene Exceptions erstellen.
   */

}
