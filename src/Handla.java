import java.util.Scanner;
public class Handla {
    static int milkTotal = 0;
    static int breadTotal = 0;
    static int eggTotal = 0;
    static int butterTotal = 0;

    static Scanner scan = new Scanner(System.in);
    static void handla() {
        boolean handlaMer = true;

        while (handlaMer) {
        Produkter.visaProdukter();
        System.out.println("Välj produktnummer att köpa 1-4, 0 för att gå tillbaka till menyn.");
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
    }

    static void handlaTotal() {
        /* int milk = 15;
        int bread = 25;
        int egg = 30;
        int butter = 45; */

        int milkPrice = 15*milkTotal;
        int breadPrice = 25*breadTotal;
        int eggPrice = 30*eggTotal;
        int butterPrice = 45*butterTotal;

        System.out.println("---Varukorg--- \n"
                + eggTotal + " st äggpaket, " +eggPrice+ " Kr\n"
                + milkTotal + " st mjölkpaket, " +milkPrice+ " Kr\n"
                + breadTotal + " st brödpaket, " +breadPrice+  " Kr\n"
                + butterTotal + " st smörpaket, " +butterPrice+ " Kr\n");
    }

    static void varukorg() {
         int milkPrice = 15*milkTotal;
         int breadPrice = 25*breadTotal;
         int eggPrice = 30*eggTotal;
         int butterPrice = 45*butterTotal;
         int totalPrice = milkPrice+breadPrice+eggPrice+butterPrice;

        if (milkTotal < 1 && breadTotal < 1 && eggTotal < 1 && butterTotal < 1) {
            System.out.println("Lägg till varor först");
        } else {
            System.out.println("Du har valt att handla: \n"
                    + eggTotal + " st äggpaket, " +eggPrice+ " Kr\n"
                    + milkTotal + " st mjölkpaket, " +milkPrice+ " Kr\n"
                    + breadTotal + " st brödpaket, " +breadPrice+  " Kr\n"
                    + butterTotal + " st smörpaket, " +butterPrice+ " Kr\n");

            System.out.println("Ditt total pris blir " +totalPrice+ " Kr");
            System.out.println("Tryck enter för att gå vidare: ");
            scan.nextLine();
            }
        }
    }