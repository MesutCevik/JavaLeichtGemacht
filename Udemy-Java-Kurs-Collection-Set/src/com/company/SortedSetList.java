package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSetList {

  public static void main(String[] args) {

    List<String> list1 = new ArrayList<String>();

    // DATENEINGABE
    // ArrayList
    list1.add("Peter");
    list1.add("Adrian");
    list1.add("Michi");
    list1.add("Peter");
    list1.add("Bernt");

    System.out.println("\nNicht sortierte Liste: ");
    for (String stringName:list1) {
      System.out.println(stringName);
    }

    // Nutze die Sortier-Methode sort() aus der Klasse "Collections" für die Liste "list1".
    Collections.sort(list1);

    System.out.println("\nSortierte Liste: ");
    for (String stringName:list1) {
      System.out.println(stringName);
    }

    List<Kontakt> list2 = new ArrayList<Kontakt>();
    list2.add(new Kontakt("Peter", "01759279390"));
    list2.add(new Kontakt("Chris", "01779567987"));
    list2.add(new Kontakt("Peter", "01587659123"));

    System.out.println("\n\n\nListe unsortiert: ");

    for (Kontakt kontakt : list2) {
      System.out.println("Name: " + kontakt.getName() + ", Telefonnummer: " + kontakt.getTelefonNummer());
    }
  }
 }

