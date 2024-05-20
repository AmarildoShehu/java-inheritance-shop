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

            //scelta prodotto corrispondente
            switch (choise) {
                case 1:
                    System.out.println("Inserisci l'Imei: ");
                    String imei = scanner.nextLine();

                    System.out.println("inserisci la quantità di memoria : ");
                    int memoryLocated =scanner.nextInt();
                    scanner.nextLine();

                    cart.add(new Smartphone(code, name, description,
                            price, iva, imei, memoryLocated));
                    break;

                case 2:
                    System.out.println("Inserisci le dimensioni: ");
                    String tvSize = scanner.nextLine();

                    System.out.println("Smart TV (true / false) : ");
                    boolean smartTv =scanner.nextBoolean();
                    scanner.nextLine();

                    cart.add(new Television(code, name, description,
                            price, iva, tvSize, smartTv));
                    break;

                case 3:
                    System.out.println("Inserisci il colore: ");
                    String color = scanner.nextLine();

                    System.out.println("Wirelles (true / false) : ");
                    boolean wireless =scanner.nextBoolean();
                    scanner.nextLine();

                    cart.add(new Headphone(code, name, description,
                            price, iva, color, wireless));
                    break;

                default:
                    System.out.println("Scelta sbagliata");

            }
        }

        //Stampa
        System.out.println("Carello : ");
        for (Prodotto prodotto : cart) {
            System.out.println(prodotto);
        }
    }
}