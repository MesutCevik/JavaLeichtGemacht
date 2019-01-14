package com.company;

public class Main { // übersetzt: Haupt-Klasse

  public static void main(String[] args) {

    /** main-Methode
     * In jedem Projekt wird mindestens eine Java-Klasse erforderlich, in der die main - Methode definiert ist:
     * public static void main (String[]args){ ... }
     * In dieser Methode entsteht ein Java-Projekt.
     *
     * Sinnvollerweise werden Objekte von Klassen in der main-Methode erstellt. Dann kann im weiteren Verlauf des
     * Programms mit diesen Objekten gearbeitet werden.
     * ERINNERE: DIE main-Mathode ist der Startpunkt eines jeden Programms.
     */

    // Im Vergleich Variablen vs. Klassen
    int zahl = 50;
    System.out.println(zahl);
    // In der Konsole wird lediglich 50 ausgegeben, da in dieser primitiven VAR nur ein Wert gespeichert ist.

    // Wie wird ein Objekt erstellt?
    // Datentyp variablenName = new Konstruktor();
    Auto bmw = new Auto();
    bmw.preis = 5000;
    bmw.marke = "BMW";
    System.out.println(bmw); // Siehe Erklärung ganz unten!
    System.out.println("Preis: " + bmw.preis + ", Marke: " + bmw.marke);

    /** Bedeutung der obigen Befehlszeile:
     * Auto => Das ist die Klasse (Name der Klasse), von der ein Objekt erstellt werden soll.
     * bmw => Name der Variable, in der das neue Objekt zugewiesen/gespeichert werden soll, damit wir darüber
     * auf das Objekt zugreifen können.
     * '=' => Der übliche Zuweisungsoperator, damit der Wert rechts davon in die VAR links davon zugewiesen wird.
     * new => Schlüsselwort, mit der ein neues Objekt erzeugt wird. Es reserviert Arbeitsspeicher Platz für das Objekt.
     * Konstruktor() => Initialisiert ein Objekt mit Werten (im obigen Fall noch nicht, da () leer ist.
     * Der Konstruktor muss genauso heißen wie die Klasse selbst. Z.B. Auto()
     */

    /** REFERENZVARIABLE
     *
     * Java ist eine Objekt-orientierte Programmiersprache (kurz: OOP), bei der es darum geht, Klassen zu definieren
     * und daraus eine gewünschte Anzahl Objekte zu generieren.
     * Eine Klasse kann man sich wie einen Bauplan vorstellen, nach der man immer wieder neue Objekte erzeugen kann.
     * Welche Eigenschaften ein Objekt haben kann, sind in der Klasse definiert.
     *
     * Eine Klasse kann auch als ein komplexer Datentyp verstanden werden, in der mehrere Daten/Werte unterschiedlicher
     * Datentypen gespeichert werden können.
     *
     * Das generierte Objekt einer Klasse wird einer Variable zugewiesen. In dieser Variable sind keine Werte
     * gespeichert, sondern nur eine Adresse, welcher auf das Objekt referenziert. Und an dieser Adresse sind
     * die ganzen Variablen bzw. deren Werte gespeichert, die zum Objekt. Die Werte sind in Variablen gespeichert, die bei der
     * Erstellung der Klasse definiert wurden.
     * Daher wird die Variable eines Objekts "Referenzvariable" genannt und die darin gespeicherte Adresse
     * "Referenzadresse".
     *
     * Wenn man den Inhalt der Referenzvariable in der Konsole ausgibt, erhält man seinen Indentity-Hash-Code,
     * der einzigartig für jedes Objekt einer Klasse ist.
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


    Auto audi = new Auto();
    audi.preis = 6000;
    audi.marke = "Audi";

    System.out.println("Preis: " + audi.preis + ", Marke: " + audi.marke);

    Auto vw = new Auto();
    vw.preis = 3000;
    vw.marke = "VW";

    System.out.println("Preis: " + vw.preis + ", Marke: " + vw.marke);

  }
}
