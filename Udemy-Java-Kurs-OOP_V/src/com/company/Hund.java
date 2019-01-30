package com.company;

public class Hund extends Tier {

  // EINGENSCHAFTEN / ATTRIBUTE
  int zaehne;


  // KONSTRUKTOREN
  public Hund(String name, int groesse, int gewicht, int zaehne) {
    super(name, groesse, gewicht);
    this.zaehne = zaehne;
  }

  // METHODEN
  public void bellen() {
    System.out.println("Wauuu, wauu, wauu, wauu, wufff wufff wuff!");
  }

  @Override
  public void essen() {
    System.out.println("Der Hund muss sein Essen noch kauen.");
  }

  @Override
  public void atmen() {
    System.out.println("Der Hund atmet über die Lunge."); // Wie atmet der Hund? Über die Lunge.
  }
}
