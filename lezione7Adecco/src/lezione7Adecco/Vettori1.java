package lezione7Adecco;

public class Vettori1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vettInt = new int[10];

		for (int i = 0; i < vettInt.length; i++) {
			vettInt[i] = i*i+1/3;
		}
		for (int i = 0; i < vettInt.length; i++) {
			System.out.println(vettInt[i]);
		}

	}
}
