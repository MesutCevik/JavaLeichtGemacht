package com.company;

/** MAIN-KLASSE -->> WICHTIG
 * Jedes Programm braucht eine main-Klasse (eine Hauptklasse), von der aus das ganze Programm eines Projekts gesteuert
 * wird. In dieser Hauptklasse ist eine main-Methode definiert, welche die Objekte aus den Klassen des Projekts
 * generiert.
 *
 * ALSO: Die main-Klasse fungiert als Operationsbasis für das ganze Programm, von dort werden die einzelnen Prozesse im
 * Programm gesteuert.
 */

public class Main { // übersetzt: Haupt-Klasse

  public static void main(String[] args) {

    /** MAIN-METHODE
     * In jedem Projekt wird mindestens eine Java-Klasse erforderlich, in der die main - Methode definiert ist:
     * public static void main (String[]args){ ... }
     * In dieser Methode entsteht ein Java-Projekt.
     *
     * Sinnvollerweise werden Objekte von Klassen in der main-Methode erstellt. Dann kann im weiteren Verlauf des
     * Programms mit diesen Objekten gearbeitet werden.
     * ERINNERE: Die main-Mathode ist der Startpunkt eines jeden Programms.
     *
     * (ANDERE) METHODEN >> wichtig!
     * In der Objektorientierten Programmierung (OOP) werden Methoden immer von deren Objekten aufgerufen.
     * Daher wie folgt vorgehen:
     * (1.) Ein Objekt einer Klasse erzeugen.
     * (2.) Von diesem Objekt aus die Methoden aufrufen.
     */

    // BISHER: VARIABLEN deklarieren und initialisieren: Datentyp Name = Wert;
     // In der Konsole wird lediglich 50 ausgegeben, da in dieser primitiven VAR nur ein Wert gespeichert ist.
     int zahl = 50;
     System.out.println(zahl);

     // JETZT: OBJEKTE deklarieren und initialisieren: Datentyp variablenName = new Konstruktor();
    // ERSTELLUNG EINES OBJEKTS anhand einer Klasse mit dem Konstruktor für diese Klasse.
    // MERKE:
    Auto bmw = new Auto();
    bmw.preis = 5000;
    bmw.marke = "BMW";
    System.out.println(bmw); //  Gibt die Speicheradresse des Objekts "bmw" aus (Indentity Hash-Codde. Siehe unten!
    System.out.println("Preis: " + bmw.preis + ", Marke: " + bmw.marke);

    /** Bedeutung der Befehlszeile: Auto bmw = new Auto()
     * bmw => Name der Variable, in der das neue Objekt zugewiesen/gespeichert werden soll, damit wir darüber auf
     * das Objekt zugreifen können. Diese VAR ist ein komplexer Datentyp und kann mehrere Daten/Werte speichern.
     * Diese Variable wird auch Referenzvariable genannt, weil es auf den Speicherplatz mit dem Objekt verweist.
     * Wenn die Referenzvariable println ausgegeben wird, dann wir die Adresse des Speicherplatzes angezeigt. Damit
     * einzelne Inhalte angezeigt werden, muss in diese VAR mit dem .-Operator zugegriffen werden.
     *
     * Auto => Datentyp der Variable "bmw"!!! Wie ist der Datentyp "Auto" definiert? Es ist eine Klasse!!! Aus dieser
     * Klasse werden wir ein Objekt erstellen. Die Variablen in der Klasse bestimmen die Eigenschaften/Attribute
     * des Objekts.
     *
     * '=' => Der übliche Zuweisungsoperator, damit der Wert rechts davon in die VAR links davon zugewiesen wird.
     *
     * new => Schlüsselwort bzw. new-Operator mit der ein neues Objekt erzeugt wird. Es reserviert einen Platz
     * im Arbeitsspeicher des Computers Platz für das zu generierende Objekt.
     *
     * Konstruktor() => Initialisiert ein Objekt mit Werten (im obigen Fall noch nicht, da () leer ist.
     * Der Konstruktor muss genauso heißen wie die Klasse selbst, also: Auto()
     * Mit dem Aufruf des Konstruktors erstellen wir ein Objekt. Ohne Parameterwerte wird ein Standard Objekt Auto
     * erstellt. Wenn beim Aufrufen des Konstrukturs ihm auch Parameterwerte übergeben werden, so wird ein individuelles
     * Objekt erstellt.
     */

    /** REFERENZVARIABLE
     *
     * Java ist eine Objekt-orientierte Programmiersprache (kurz: OOP), bei der es darum geht, Klassen zu definieren
     * und daraus Objekte zu erstellen. OOP orientiert sich an der reellen Welt und den Objekten dort.
     * Eine Klasse kann man sich wie einen Bauplan vorstellen, nach der man immer wieder neue Objekte erzeugen kann.
     * Welche Eigenschaften ein Objekt haben kann, ist in der Klasse definiert.
     * Objekte sind wie aus der realen Welt abgeleitet. Beispiele: Auto, Haus, Tier, Menschen usw.
     *
     * Eine Klasse kann auch als ein komplexer Datentyp verstanden werden, in der mehrere Daten/Werte unterschiedlicher
     * Datentypen gespeichert werden können. Daher können wir in der Definition einer Klasse mehrere Variablen
     * festlegen, welche als Eigenschaften (in der Programmierung Attribute genannt) das Objekt bestimmten.
     *
     * Das generierte Objekt einer Klasse wird einer Variable zugewiesen. In dieser Variable sind keine Werte
     * gespeichert, sondern nur eine Adresse, welcher auf das Objekt referenziert. Und an dieser Adresse sind
     * die ganzen Variablen bzw. deren Werte gespeichert, die zum Objekt gehören.
     * Daher wird die Variable eines Objekts "Referenzvariable" genannt und die darin gespeicherte Adresse
     * "Referenzadresse".
     *
     * Wenn man den Inhalt der Referenzvariable in der Konsole ausgibt, erhält man seinen Indentity-Hash-Code,
     * der einzigartig für jedes Objekt einer Klasse ist und damit die Speicheradresse ist.
     * MERKE: Der Identity-Hash-Code ist wie ein Strichcode auf Produkten im Supermarkt.
     *
     * Auf die einzelnen Werte eines Objekts wird über seine Referenzvariable zugriffen. Dabei wird mit dem .-Operator
     * auf den Speicherort zugegriffen und dort die gewünschten Daten abgerufen, zum Beispiel: bmw.preis
     *
     * Was ist in der Variable "bmw" gespeichert?
     *
     * Oben wurde ein Objekt der Klasse "Auto" erzeugt und der Variable "bmw" zugewiesen. "bmw" ist damit
     * die Referenzvariable und verweist auf einen Speicherplatz mit allen Daten dieses Objekts.
     * Wenn man den Inhalt dieser Variable in der Konsole ausgibt, erhält man den Indentity-Hash-Code von dieser
     * Variable: com.company.Auto@2d6a9952. Das ist sozusagen die Adresse zum Platz im Arbeitsspeicher des Rechners.
     * Dort finden wir die Daten zu den (Klassen-) Variablen "preis" und "marke", welche wir mit dem .-Operator
     * abrufen können.
     */

    // A. STANDARD-KONSTRUKTOR AUFRUFEN (ohne Parameterwerte):
    Auto vw = new Auto(); // Ein Objekt der Klasse Auto wird generiert: vw.
    vw.preis = 5000; // Der VAR "preis" im Objekt "vw" wird der Wert 5000 zugewiesen (initialisiert).
    vw.marke = "VW"; // Der VAR "marke" im Objekt "marke" wird der Wert "VW" zugewiesen (initialisiert).
    vw.vergleichePreis(2000);

    System.out.println(bmw); // Gibt die Speicheradresse der Referenzvariable "bmw" aus: com.company.Auto@2d6a9952
    System.out.println(bmw.preis); // Geht in die VAR/das Objekt "bmw" rein und holt den Wert der VAR "preis".
    System.out.println("Preis: " + vw.preis + ", Marke: " + vw.marke);

    // B. KONSTRUKTOR MIT PARAMETERWERTEN AUFRUFEN (Übergabe von Parameterwerten):
    // Ein Objekt der Klasse Auto wird erstellt: "audi" und erhält direkt Parameterwerte (Eigenschaften).
    Auto audi = new Auto(4, 5000, "Audi");
    System.out.println("Reifenanzahl: " + audi.reifen + ", Preis: " + audi.preis + ", Marke: " + audi.marke);

    // MERKE: In der Objektorientierten Programmierung (OOP) werden Methoden immer von Objekten aufgerufen.
    // Das Objekt audi von der Klasse Auto haben wir oben erzeugt. Jetzt nutzen wir die Methoden, die in der Klasse
    // Auto definiert sind.

    audi.gasgeben();
    audi.bremsen();
    audi.vergleichePreis(4000);

    Auto.ausgabe();

  }
}
