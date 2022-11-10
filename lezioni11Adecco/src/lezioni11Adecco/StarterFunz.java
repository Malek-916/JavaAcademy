package lezioni11Adecco;

public class StarterFunz {
public static void main(String[] args) {
	EsFunzioni f = new EsFunzioni();
	
	int num = 90;
	System.out.println("Divisori di " + num + " sono in totale: "+ f.quantiDivisoriNumero(num)  +"\n#############");
	
	String [] vett = {"ciao", "yo", "mi" , "he" , "hello", "bello"};
	
	for (String s: f.filtroParoleconTreOpiuLettereV2(vett)) {
		System.out.print(s + " "); 
	}

}
	

	
}
