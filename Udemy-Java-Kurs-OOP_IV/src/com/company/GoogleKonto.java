package com.company;

import java.util.Scanner;

public class GoogleKonto {

  // Eigenschaften / Attribute
  private String benutzerName;
  private String passwort;

  // KONSTRUKTOR
  public GoogleKonto(String benutzerName, String passwort) {
    this.benutzerName = benutzerName;
    this.passwort = passwort;
  }


  // METHODEN
  // GETTER-METHODEN
  public String getBenutzerName() {
    return benutzerName;
  }

  public String getPasswort() {
    return passwort;
  }


  // SETTER-METHODEN
  public void setBenutzerName(String benutzerName) { // Setzt einen neuen Benutzernamen.

    this.benutzerName = benutzerName;
  }

  public void setPasswort(String passwort) { // Setzt ein neues Passwort. Ein Objekt ruft diese auf und möchte das PW ändern.
    if (passwort.equals(this.passwort)){ // Vergleicht, ob das eingegebene PW gleich dem des vorhandenen ist.
      System.out.println("Passwort stimmt und kann hier geändert werden.");
      System.out.println("Bitte neues Passwort eingeben... ");
      Scanner scan = new Scanner(System.in);
      String newPW = scan.nextLine();
      this.passwort = newPW;
      System.out.println("Das neue Passwort lautet: " + this.passwort);

  } else {
      System.out.println("Passwort falsch, kann nicht geändert werden.");
    }
  }

  /** Vorteil von Gettern und Settern:
   * Zunächst liefert eine Getter-Methode den Wert einer Variable und eine Setter-Methode verändert den Wert
   * dieser Variable.
   * Darüber hinaus können wir in diesen Methoden, die ganz normale Methoden sind, Verfahren definieren und den
   * Zugriff einschränken und die Eingaben auf Sinnhaftigkeit überprüfen. Zum Beispiel hat ein Programmierer
   * die Berechtigung, Passwörter zu ändern.
   *
   * Aus den obigen Gründen setzt man Variablen i.d.R. private und regelt den Zugriff über Getter-/Setter-Methoden.
   */

  // Wir können Verfahren definieren
}
