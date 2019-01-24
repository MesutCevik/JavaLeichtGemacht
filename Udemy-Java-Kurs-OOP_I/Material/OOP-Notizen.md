OBJEKTORIENTIERTE PROGRAMMIERUNG I****

F1: Was versteht man unter einem Datentyp?
**A1: Ein Datentyp beschreibt welche Werte eine Variable annehmen kann.**

F2: Welche Aufgabe hat das Schlüsselwort new?
**A2: Mit dem new-Operator erstellt man ein neues Objekt / eine neue Instanz.**
**Der new Operator erstellt ein neues Objekt. Die Adresse des Objektes wird in der Variable gespeichert.**

F3: Was ist eine Referenzvariable?
**A3: In einer Referenzvariable ist die Adresse zu einem Objekt / zu einer Instanz hinterlegt.
Anders als bei primitiven Variablen, ist in einer Referenzvariable nur die Adresse zum Objekt hinterlegt.**

SINN DER OOP
Man versucht reale Objekte in ein Programm zu holen, in dem eine Klasse definiert, nach der Objekt erzeugt werden.

OBJEKT
Auch genannt:
OBJEKT aus einer Klasse oder INSTANZ aus einer Klasse.


KONSTRUKTOR
Mit einem Konstruktor kann man ein Objekt mit Werten initialisieren.


NEW-OPERATOR
Der new-Operator erezugt ein neues Objekt / eine neue Instanz aus einer Klasse.


OBJEKTVARIABLEN UND OBJEKTMETHODEN

Die in einer Klasse deklarierten Variablen stellen die Eigenschaften/Attribute von Objekten dar, die anhand dieser 
Klasse erzeugt werden. In einer Klasse werden auch Methoden definiert, welche von Objekten dieser Klasse aufgerufen
werden.
Da die Variablen und Methoden einer Klasse erst dann erzeugt werden, wenn ein Objekt von dieser Klasse generiert wurde, 
nennt man sie auch OBJEKTVARIABLEN und OBJEKTMETHODEN.

Eine Klasse ist wie ein Bauplan, anhand der Objekte erstellt werden. Erst wenn in der main-Methode ein Objekt 
erstellt wird, werden den Objektvariablen Werte zugewiesen und die Objektmethoden zur Verfügung gestellt.
Also: Das Objekt wird mit den Variablenwerten erzeugt und über dieses Objekt können Methoden ausgeführt und 
die Variablen bearbeitet werden.


Beispiel:
1. Schritt: (in der main-Methode): Auto ford = new Auto();
2. Schritt: ford.bremsen();


KLASSENVARIABLEN UND KLASSENMETHODEN
Eine KLASSENVARIABLE überlebt auch ohne ein Objekt, sie lebt schon bei der Klassendefinition. Diese Art von Variablen 
nennt man auch GLOBALE VARIABLEN. Ihr Wert steht allen Objekten genauso zur Verfügung. 
Beispiel: static int reifenAnzahl = 4;

KLASSENMETHODEN brauchen kein Objekt, um bereitgestellt und ausgeführt zu werden. Klassenmethoden werden mit dem
chlüsselwort "static" versehen. Sie können mit dem Namen eines generierten Objekts (wie üblich) aufgerufen werden.
Sie können auch allein mit dem Klassennamen aufgerufen werden. Beispiel: Auto.ausgabe();
Normalerweise so: bmw.ausgabe();

Das bedeutet, wenn man eine Methode mit dem Schlüsselwort "static" definiert, dann ist diese Methode ohne ein Objekt 
überlebensfähig. Sie steht also immer bereit und kann ausgeführt werden. Klassenmethoden stehen allen Objekten, 
die anhand dieser Klasse erzeugt werden, zur Verfügung und führen immer denselben Code/dieselben Aufgaben mit denselben 
Werten aus. Beispiel:
  public static void ausgabe(){
    System.out.println("Ich bin eine Klassenmethode und brauche kein Objekt.");
  }
