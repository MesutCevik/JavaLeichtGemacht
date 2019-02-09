package DSUebung;

public class Kontakt {

  // EIGENSCHAFTEN / ATTRIBUTE
  private String name;
  private String telefonNummer;


  // KONSTRUKTOREN
  public Kontakt(String name, String telefonNummer) {
    this.name = name;
    this.telefonNummer = telefonNummer;
  }


  // METHODEN
  // METHODEN - GETTER-SETTER-METHODEN
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTelefonNummer() {
    return telefonNummer;
  }

  public void setTelefonNummer(String telefonNummer) {
    this.telefonNummer = telefonNummer;
  }

  // METHODEN - KLASSENMETHODEN (static!)
  public static Kontakt erstelleKontakt(String name, String telefonNummer){
    return new Kontakt(name, telefonNummer);
  }
}
