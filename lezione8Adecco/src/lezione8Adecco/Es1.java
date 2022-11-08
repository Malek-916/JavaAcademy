package lezione8Adecco;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Es1 {
//	 *    Dato un ingresso ( SCANNER) 
//	 *    un numero che deve != 0
//	 *    (controllare con un semaforo)
//	 *    
//	 *    e dato un vettore di double gia'
//	 *    inizializzato.
//	 *    
//	 *    modificare il vettore moltiplicando
//	 *    tutti gli elementi del vettore
//	 *    per il numero inserito.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		DecimalFormat df = new DecimalFormat("0,00");
		int num;

		do {
			System.out.print("inserisci: ");
			num = scan.nextInt();
		} while (num == 0);

		scan.close();

		double[] vettDouble = new double[5];

//		for (int i = 0; i < vettoreDouble.length; i++) {
//			vettoreDouble[i] = rand.nextDouble(10);
//
//		}
//
//		for (int i = 0; i < vettoreDouble.length; i++) {
//			System.out.print(vettoreDouble[i] + " ");
//		}
//		System.out.println("");
//
//		for (int i = 0; i < vettoreDouble.length; i++) {
//
//			vettoreDouble[i] *= num;
//
//			vettoreDouble[i] = Double.valueOf( df.format(vettoreDouble[i])  );
//
//			System.out.print(vettoreDouble[i]);
//			// System.out.println(df.format(vettoreDouble[i]));
//		}
		for (int i = 0; i < vettDouble.length; i++) {
//			vettDouble[i] = random.nextDouble(100) ; // 0 -99
			
			System.out.println("Stampo il numero " + (i + 1) + " : " +    vettDouble[i]);
			
			vettDouble[i] *= num;
			

//			vettDouble[i] =  Double.valueOf(    df.format(vettDouble[i]  )    );	 
			vettDouble[i] =  Double.valueOf(    df.format(vettDouble[i]  )    );	 
			
			System.out.println("Stampo il numero " + (i + 1) + " : " +    vettDouble[i]);

			
			System.out.println("##################");
		}

	}

}
