package DSUebung;

public class Vergleiche {

  public static void main(String[] args){

    String name = "Christian";
    String name1 = "Peter";
    String name2 = new String("Christian");


    // Wie die beiden Strings miteinander vergleichen?
    if(name.equals(name2)) {
      System.out.println("Name passt!");
    } else {
      System.out.println("Name passt nicht!");
    }

  }
}
