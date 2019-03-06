**ArrayList versus LinkedList**

Was sind die Zusammenhänge zwischen ArrayList und LinkedList.
Diese beiden Klassen implementieren die Logik einer List (Liste), welches ein Interface ist.

List (Interface)
(1) ArrayList (Klasse, erbt von Interface List)
(2) LinkedList (Klasse, erbt von Interface List)

Allgemein die Logik von List (Liste):

- Eine Liste enthält Elemente (Objekte).
- Größe der Liste ist bei der Erstellung meist unbekannt.
- Ist dynamisch, d.h. es können Elemente (Objekte) hinzugefügt und entfernt werden.
-->> Das ist der große Vorteil von Listen gegenüber einem Array!!!
- Element (Objekte) können an beliebigen Stellen hinzugefügt werden.
- Gleiche Elemente (Objekte) dürfen doppelt, dreifach usw. vorhanden sein.
- Zuordnung der Elemente (Objekte) durch einen Index bei der Klasse ArrayList als auch bei der Klasse LinkedList.
-->> feste Reihenfolge der Elemente (Objekte).

LINKEDLIST
LinkedList wird auch genannt:
Verkettete Liste, Doppelt Verkettete Liste
 
Ein Element/Objekt kennt seinen vorherigen und nachgelagerten Nachbarn. Ein Objekt2 kennt Objekt1 und Objekt3.

Die Methoden, die für diese Klassen zur Verügung stehen, arbeiten anders.
Zum Beispiel:
(a) Methode get() >> get(3);
ArrayList: Gibt sehr schnell das Objekt an der in get angegebenen Index-Position an.
LinkedList: Arbeitet langsam: Fängt vom Index 0 an und arbeitet sich bis zum Index 3 vor und gibt dann den Wert aus.

(b) Methode add() >> add(7);
ArrayList: Fügt das neue Element an der gewünschten Position und verschiebt den Rest der Tabelle. Läuft langsam. 
LinkedList: Fügt das neue Element an der gewünschten Position und teilt dies den Element davor und danach mit.
Läuft schnell.

(b) Methode remove() >> remove(4);
ArrayList: Löscht das 4. Element und verschiebt aufwändig die gesamte Liste. Arbeitet langsam.
LinkedList: Löscht das 4. Element und teilt dies dem 3. und 5. Element mit.

**MERKE:**
**Wann ArrayList einsetzen?**
+ wenn Größe ungefähr bekannt ist.
+ wenn man viel in der Datenstruktur suchen muss (get).

- wenn man viel löschen möchte (remove).
- wenn man weniger hinzufügen möchte (add).

Wann LinkedList einsetzen?
+ wenn man viel löschen möchte (remove)
+ wenn man viel hinzufügen möchte (add)

- wenn man viel in der Struktur suchen muss (get)

Legende:
+ = spricht für die Klasse.
- = spricht gegen die Klasse.


Zum Thema **List** aus dem Beispiel zu "ArrayList versus LinkedList":

Erstelle eine LinkedList, welches Daten vom Typ "Integer" (ist eine Wrapper-Klasse) speichern kann:
**LinkedList<Integer> liste = new LinkedList<Integer>();**

Erstelle eine ArrayList, welches Daten vom Typ "Integer" (ist eine Wrapper-Klasse) speichern kann:
**ArrayList<Integer> liste = new ArrayList<Integer>();**

ERINNERE: 
ArrayList und LinkedList sind Klassen, welche das Interface List implementieren. ALSO sind ArrayList und LinkedList 
beides Listen. Jeder von ihnen legt die Liste ein wenig anders aus. Und die anwendbaren Methoden sind zwar die gleichen,
sie erledigen aber die Aufgaben darin anders, wie z.B. get().

"Da beide eine Liste darstellen, kann man List als Datentyp übernehmen. So kann man im Laufe eines Programmes immer 
noch von ArrayList zu LinkedList wechseln. Denk dran, die Methoden für beide Klassen sind dank des List Interfaces
gleich, sie haben also dieselben Methoden zur Verfügung wie add() und get(). Nur sind diese Methoden jeweils ein wenig 
anders implementiert (Anweisungsblock)."

Daher können wir die obigen Zeilen auch so schreiben, was uns die Arbeit extrem vereinfacht:

**List<Integer> liste = new LinkedList<Integer>();**
und
**List<Integer> liste = new ArrayList<Integer>();**

