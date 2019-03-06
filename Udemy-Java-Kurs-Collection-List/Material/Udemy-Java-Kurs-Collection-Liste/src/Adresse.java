
public class Adresse {

	// Eigenschaften / Attribute
	private String name;
	private String straße;
	private String stadt;

	// Konstruktor
	public Adresse() {

	}

	public Adresse(String name, String straße, String stadt) {
		super();
		this.name = name;
		this.straße = straße;
		this.stadt = stadt;
	}

	// Methoden
	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getStraße() {
		return straße;
	}

	public void setStraße(String straße) {
		this.straße = straße;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
