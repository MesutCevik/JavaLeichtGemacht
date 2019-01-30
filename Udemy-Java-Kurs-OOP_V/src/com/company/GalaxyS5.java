package com.company;

public class GalaxyS5 extends Samsung implements ITelefon {
  // EINGENSCHAFTEN / ATTRIBUTE
  private String farbe;

  // KONSTRUKTOREN


  // METHODEN

  @Override
  public void powerOn() {

  }

  @Override
  public boolean esKlingelt() {
    return false;
  }

  @Override
  public boolean anrufen() {
    return false;
  }



}
