package lezione10Adecco;

import java.util.Random;

public class Car {

	private int cilindrata;
	private String targa;

	public Car() {
		setCilindrata(900);
		setTarga(targaRandomizzata());
	}

	public Car(int cilindrata) {
		setCilindrata(cilindrata);
		setTarga(targaRandomizzata());
	}

	@Override
	public String toString() {
		return "Car [cilindrata=" + cilindrata + ", targa=" + targa + "]";
	}

	public String targaRandomizzata() {

		Random rand = new Random();
		char[] allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
//		
		String targa = "";

		for (int i = 0; i < 7; i++) {

			targa += allowedChars[rand.nextInt(allowedChars.length)] + "";
		}
		return targa;
	}

	public Car(int cilindrata, String targa) {
		setCilindrata(cilindrata);
		setTarga(targa);
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public String getTarga() {
		return targa;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

}
