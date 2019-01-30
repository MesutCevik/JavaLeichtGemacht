package beispielpaket;

// Dies ist unsere eigene Exception-class. Dieser gibt eine indiv. Fehlermeldung raus.
// Tipp: class-Namen leserlich gestalten.

public class NichtDurchNullTeilenException extends Exception {

  public NichtDurchNullTeilenException(String message) {
    super(message); // "super" ruft den Konstruktor der Superklasse auf.
}

}
