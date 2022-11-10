package lezioni11Adecco;

public class StarterGatto {
 public static void main(String[] args) {
	 Gatto miccio = new Gatto("miccio","giallo", 2);
	 Persona p = new Persona("gigi", 18, miccio);
	 System.out.println(p);
}
}
