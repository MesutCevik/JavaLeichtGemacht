package com.company;

import javafx.scene.image.Image;

public class Artikel {

  // EIGENSCHAFTEN / ATTRIBUTE
  private String artikelName;
  private Image artikelBild;

  // KONTRUKTOREN
  public Artikel(String artikelName, Image artikelBild) {
    this.artikelName = artikelName;
    this.artikelBild = new Image(artikelBild);
  }

  // METHODEN
  public String getArtikelName() {
    return artikelName;
  }

  public void setArtikelName(String artikelName) {
    this.artikelName = artikelName;
  }

  public Image getArtikelBild() {
    return artikelBild;
  }

  public void setArtikelBild(Image artikelBild) {
    this.artikelBild = artikelBild;
  }
}
