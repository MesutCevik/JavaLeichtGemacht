package com.company;

public interface ITelefon {

  // EINGENSCHAFTEN / ATTRIBUTE --> nur Konstanten
  public static final String NETZANBIETER = "Telekom";

  // METHODENSIGNATUREN / METHODENKÖPFE
  public abstract void powerOn();

  public abstract boolean esKlingelt();

  public abstract boolean anrufen();

}
