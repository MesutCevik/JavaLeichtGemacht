package com.company;

public class Laptop {

  // EIGENSCHAFTEN / ATTRIBUTE
  int ram;
  double preis;
  String marke;

  // KONSTRUKTOR
  public Laptop(int ram, double preis, String marke) {
    this.ram = ram;
    this.preis = preis;
    this.marke = marke;
  }

  // METHODE
  public void getLaptopText() {
    System.out.println("Laptop: RAM: " + this.ram + " GByte, Preis: " + this.preis + " EUR, Marke: " + this.marke + ".");
  }

  // toString


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Mein Laptop: ");

    return sb.toString();
  }

  public static void main(String[] args) {
    Laptop myLaptop = new Laptop(32, 3259.99, "HewlettPackard");
    System.out.println("Mein neues Laptop: RAM = " + myLaptop.ram + " GByte, Preis: " + myLaptop.preis + " EUR, Marke: " + myLaptop.marke);
    myLaptop.getLaptopText();

    Laptop samsungLaptop = new Laptop(8, 600, "Samsung");
    samsungLaptop.getLaptopText();

    Laptop medionLaptop = new Laptop(4, 400, "Medion");
    medionLaptop.getLaptopText();

  }
}

/**
 * 1. Aufgabe zu Klassen und Objekte
 * <p>
 * Erstelle eine Klasse mit dem Namen Laptop.
 * Diese Klasse soll folgende Eigenschaften haben:
 * --> ram;
 * --> preis;
 * --> marke;
 * <p>
 * Definiere einen Konstruktor der diese 3 Eigenschaften beim Erstellen eines Objektes,
 * dieses Objekt direkt mit Werten befüllt.
 * <p>
 * Definiere eine Methode, die diese 3 Eigenschaften beim Aufrufen der Methode in der Konsole ausgibt.
 *
 * 2. Aufgabe zu Klassen und Objekte
 *
 * Erstelle aus der eben erstellten Klasse 2 Objekte:
 * (1) samsungLaptop: ram: 8GB, preis 600 EUR, marke: Samsung
 * (2) medionLaptop: ram: 4GB, preis 400 EUR, marke: Medion
 *
 * Und rufe die Methode getData() mit dem Objekt samsungLaptop und medionLaptop auf.
 *
 */