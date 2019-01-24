package com.company;

public class MacBook extends Laptop {

  // EIGENSCHAFTEN / ATTRIBUTE
  boolean touchBar;


  // KONSTRUKTOREN
  public MacBook(String marke, int ram, String cpu, double preis, boolean touchBar) {
    super(marke, ram, cpu, preis);
    this.touchBar = touchBar;
  }


  // METHODEN

  @Override
  public void starten() {
    super.starten();
    System.out.println("MacBook startet!");
  }
}
