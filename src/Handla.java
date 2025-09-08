import java.util.Scanner;
public class Handla {
    static int milkTotal = 0;
    static int breadTotal = 0;
    static int eggTotal = 0;
    static int butterTotal = 0;
    static int TotalAntalProdukter = milkTotal + breadTotal +eggTotal +butterTotal;
    Scanner scan = new Scanner(System.in);
    static void handla(Scanner scan) {
        boolean handlaMer = true;

        while (handlaMer) {
        Produkter.visaProdukter();
        System.out.println("Välj produktnummer att köpa 1-4, 0 för att avsluta.");
        int val = scan.nextInt();

        switch (val) {
            case 1:
                eggTotal++;
                System.out.println("Du la till ett egg i varukorgen");
                break;
            case 2:
                milkTotal++;
                System.out.println("Du la till ett paket mjölk i varukorgen");
                break;
            case 3:
                breadTotal++;
                System.out.println("Du la till en påse bröd i varukorgen");
                break;
            case 4:
                butterTotal++;
                System.out.println("Du la till ett paket smör i varukorgen");
                break;
            case 0:
                handlaMer = false;
                break;
            default:
                System.out.println("Du valde ett alternativ som inte är tillgänligt! ");
                break;

            }
        }
        System.out.println("Du har valt att handla: " +TotalAntalProdukter);
    }
}
//System.out.println("--- Produkter ---");
//            System.out.println("Ägg || " + egg + " Kr");
//            System.out.println("Mjölk || " + milk + " Kr");
//            System.out.println("Bröd || " + bread + " Kr");
//            System.out.println("Smör || " + butter + " Kr");