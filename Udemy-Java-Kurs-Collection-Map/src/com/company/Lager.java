package com.company;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Lager extends Application {

  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    Artikel schrank1 = new Artikel("SchrankJuhu", "Schrank.png");
    Artikel regal1 = new Artikel("RegalJuhu", "Regal.png");

    Map<Integer, Artikel> lagerHalle = new HashMap<>();
    lagerHalle.put(1234, schrank1);
    lagerHalle.put(2345, regal1);

    ImageView imgSchrank = new ImageView(lagerHalle.get(1234).getArtikelBild());
    ImageView imgRegal = new ImageView(lagerHalle.get(2345).getArtikelBild());

    Button button1 = new Button("Zeige!");



  }
}
