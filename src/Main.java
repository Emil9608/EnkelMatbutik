import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean running = true;
        while (running) {
            storeMenu.showMenu();
            System.out.println("Välj ett alternativ");
            int val = scan.nextInt();

            switch (val) {
                case 1:
                    Produkter.visaProdukter();
                    System.out.println("Tryck på enter för att gå tillbaka till menyn...");
                    scan.nextLine();
                    scan.nextLine();
                    break;

                case 2:
                    Handla.handla(scan);
                    break;

                case 3:
                    Handla.handlaTotal();
                    break;

                case 4:
                    Handla.varukorg();
                    break;

                case 5:
                    running = false;
                    System.out.println("Programmet avslutas...");
                    break;
            }
        }
    }
}
