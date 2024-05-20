import java.util.ArrayList;
import java.util.Scanner


public class Cart {
    public static void main(String[] args) {
        ArrayList<Prodotto> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //Richiesta tipo di prodotto
        boolean cicle = true;
        while (cicle) {
            System.out.println("Che tipo di prodotto vuoi inserire" +
                    " (1: Smartphone, 2: Televisore, 3: Cuffie)? ");
            int choise = scanner.nextInt();
            scanner.nextLine();

            if (choise == 0) {
                cicle = false;
                continue;
            }

            System.out.println("Inserisci il codice:");
            int code = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            System.out.println("Inserisci il nome:");
            String name = scanner.nextLine();

            System.out.println("Inserisci la descrizione:");
            String description = scanner.nextLine();

            System.out.println("Inserisci il prezzo:");
            double price = scanner.nextDouble();
            scanner.nextLine();
        }
    }
}