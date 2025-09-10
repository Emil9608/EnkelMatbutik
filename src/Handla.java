import java.util.Scanner;
public class Handla {
    static int milkTotal = 0;
    static int breadTotal = 0;
    static int eggTotal = 0;
    static int butterTotal = 0;

    static Scanner scan = new Scanner(System.in);
     void handla() {                //static
        boolean handlaMer = true;

        while (handlaMer) {
        Produkter.visaProdukter();
        System.out.println("Välj produktnummer att köpa 1-4, 0 för att gå tillbaka till menyn.");
        int val = scan.nextInt();
       /* if (val  0){
            System.out.println("Du får inte skriva in ett negativt värde");

        else { */
            switch (val) {
                case 1:
                    System.out.println("Hur många paket ska du handla?");
                    eggTotal = scan.nextInt();
                    System.out.println("Du la till " + eggTotal + " i varukorgen");
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Hur många paket ska du handla?");
                    milkTotal = scan.nextInt();
                    System.out.println("Du la till " + milkTotal + " paket mjölk i varukorgen");
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Hur många limpor ska du handla?");
                    breadTotal = scan.nextInt();
                    System.out.println("Du la till " + breadTotal + " limpor i varukorgen");
                    System.out.println();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Hur många paket ska du handla?");
                    butterTotal = scan.nextInt();
                    System.out.println("Du la till " + butterTotal + " paket smör i varukorgen");
                    System.out.println();
                    System.out.println();
                    break;
                case 0:
                    handlaMer = false;
                    break;
                default:
                    System.out.println("Du valde ett alternativ som inte är tillgängligt!");
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
            System.out.println("Lägg till varor först, klicka Enter för att gå tillbaks till menyn...");
        }  else {

            System.out.println("---Varukorg--- \n"
                    + eggTotal + " st äggpaket, " + eggPrice + " Kr\n"
                    + milkTotal + " st mjölkpaket, " + milkPrice + " Kr\n"
                    + breadTotal + " st brödpaket, " + breadPrice + " Kr\n"
                    + butterTotal + " st smörpaket, " + butterPrice + " Kr\n");

            String Utcheckning = "Ja";
            System.out.println("Vill du gå vidare med ditt köp? ja / nej?: ");
            String utcheckningsVal = scan.next();

            if (utcheckningsVal.equalsIgnoreCase(Utcheckning)) {
                System.out.println("Tack för ditt köp :) ");
                System.out.println("Ditt totala pris blir " + totalPrice + " Kr");
                System.out.println("Tryck Enter för att gå tillbaka till menyn");
                scan.nextLine();
            }
        }
                /* else {
                        System.out.println("Fortsätta handla i menyn. ");
                } */
        }

    }


