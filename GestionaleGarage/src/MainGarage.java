import java.util.Scanner;
public class MainGarage {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Scanner scanner = new Scanner(System.in);

            System.out.println("inserisci 1-inserire");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    inserimento();
                    System.out.println("1-auto\n2-moto\n3-furgone");




        }


    }
    public static void inserimento() {


        System.out.println("1-auto\n2-moto\n3-furgone");

    }
}
