import jdk.dynalink.beans.StaticClass;

public class MatProdukter {
    int price;
    String productName;
    int stock;

    //Konstruktor

    public MatProdukter(int price, String productName, int stock) {
        this.price = price;
        this.productName = productName;
        this.stock = stock;
    }
    public void MatProdukterStock() {
        System.out.println(+price+productName+stock);
    }
}
