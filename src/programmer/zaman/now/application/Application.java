package programmer.zaman.now.application;
// MATERI IMPORT
// Cara 1
//import programmer.zaman.now.data.Data;
//import programmer.zaman.now.data.Product;

// Cara 2
import programmer.zaman.now.data.*;

// Note!
/*
* java.lang (String, int, bool, dll) sudah auto import
* */

public class Application {
    public static void main(String[] args) {

        // MATERI ACCESS MODIFIER
        Product product = new Product("Mac Book Pro", 30000000);
        System.out.println(product.name2);
        System.out.println(product.price2);

        Data data = new Data();

    }
}
