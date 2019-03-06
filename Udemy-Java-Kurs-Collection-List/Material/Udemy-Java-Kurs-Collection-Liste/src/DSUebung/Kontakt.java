package DSUebung;

public class Kontakt {

	// Eigenschaften / Atribute
	private String name;
	private String telefonNummer;

	// Konstruktor
	public Kontakt(String name, String telefonNummer) {
		this.name = name;
		this.telefonNummer = telefonNummer;
	}

	// Methoden
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

	public static Kontakt erstelleKontakt(String name, String telefonNummer) {
		return new Kontakt(name, telefonNummer);
	}
}
