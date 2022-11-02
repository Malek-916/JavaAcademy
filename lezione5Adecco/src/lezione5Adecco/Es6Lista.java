package lezione5Adecco;

import java.util.*;
//*  6.Scrivere un programma che chiede all'operatore 
//*  	3 numeri reali a, b, e c e calcola le
//		eventuali radici dell'equazione di secondo grado.
//*      (significa trovare x1 , x2)
public class Es6Lista {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int numC = scan.nextInt();
		
		double delta = Math.pow(numB, 2)-(4*numA*numC);
		double parteSotto = 2*numA;
		double risP = ( -numB + Math.sqrt(delta) ) / parteSotto ;
		double risM = ( -numB - Math.sqrt(delta) ) / parteSotto ;
		
		System.out.println(risP);
		System.out.println(risM);
	}

}
