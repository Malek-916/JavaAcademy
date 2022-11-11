package lezioni12Adecco;

public class Bevanda {
	
	private String name;
	private double costo;
	private double capienza;
	private boolean isAlcolic;
	
	public Bevanda() {
		this("Fanta", 0.33, 1, false);
	}
	
	
	@Override
	public String toString() {
		return "Bevanda [name=" + name + ", costo=" + costo + ", capienza=" + capienza + ", isAlcolic=" + isAlcolic
				+ "]";
	}

	public Bevanda(String name, double capienza, double costo, boolean isAlcolic) {
		setName(name);
		setCapienza(capienza);
		setCosto(costo);
		setAlcolic(isAlcolic);
	}

	public String getName() {
		return name;
	}

	public double getCapienza() {
		return capienza;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCapienza(double capienza) {
		this.capienza = capienza;
	}

	public double getCosto() {
		return costo;
	}

	public boolean isAlcolic() {
		return isAlcolic;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public void setAlcolic(boolean isAlcolic) {
		this.isAlcolic = isAlcolic;
	}
	

	
	
	
	
	

}
