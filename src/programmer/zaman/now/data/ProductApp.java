package programmer.zaman.now.data;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("Mac Book Pro", 30000000);
        System.out.println(product.name);
        System.out.println(product.price);

        // MATERI TO STRING
        System.out.println(product);

        // MATERI EQUALS
        Product product2 = new Product("Mac Book Pro", 30000000);

        System.out.println(product.equals(product2));
        /*
        * Notes!
        * > Setelah meng-override hasil diatas = TRUE
        * > Sebelum meng-override hasil diatas = FALSE
        * */

        // MATERI HASHCODE
        System.out.println(product.hashCode() == product2.hashCode()); // Hasilnya TRUE

    }
}
