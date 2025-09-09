import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean running = true;

        //Olika objekt för klasserna.
        Scanner scan = new Scanner(System.in);


        MatProdukter mp = new MatProdukter(15,"milk",24 );
        MatProdukter mp2 = new MatProdukter(30,"egg",100000 );
        MatProdukter mp3 = new MatProdukter(45,"Smör",500 );
        MatProdukter mp4 = new MatProdukter(25,"Bröd",50 );
        try {
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
                        Handla.handla();
                        break;

                    case 3:
                        Handla.varukorg();
                        scan.nextLine();
                        scan.nextLine();
                        break;

                    case 4:
                        running = false;
                        System.out.println("Programmet avslutas...");
                        break;

                    case 5:
                        mp.MatProdukterStock();
                        mp2.MatProdukterStock();
                        mp3.MatProdukterStock();
                        mp4.MatProdukterStock();
                        break;

                    default:
                        System.out.println("Använd dig av alternativ 1-4!");
                        break;
                }
            }
        }
                catch (Exception felinput) {
                System.out.println("Du måste skriva in med siffror inte bokstäver!");
            }
        }
    }