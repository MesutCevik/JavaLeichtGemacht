package com.company;

// Die abstrakten Methoden, welche in der abstrakten Klasse enthalten sind, müssen hier konkret definiert werden!!!

public class Vogel extends Tier {
  @Override
  public void essen() {
    System.out.println("Der Vogel pickt sein essen auf.");
  }

  @Override
  public void atmen() {

  }
}
