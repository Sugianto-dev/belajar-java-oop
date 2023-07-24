package programmer.zaman.now.data; // Package

import java.util.Objects;

public class Product { // Access Modifier nya public
    // MATERI PACKAGE

    protected String name; // Access Modifier nya protected
    protected int price; // Access Modifier nya protected

//    PERCOBAAN Access Modifier
//    private String name;
//    private int price;
    public String name2; // public agar bisa diakses dari luar package
    public int price2; // public agar bisa diakses dari luar package

    public Product(String name, int price){ // Kenapa public, agar bisa diakses diluar package
        this.name = name;
        this.price = price;
    }

    // MATERI TO STRING
    // meng-override toString
    public String toString() { // Override method toString (agar hasil representasi nya mudah dibaca)
        return "Product name:" + name + ", price:" + price;
    }

    // MATERI EQUALS
    // Meng-override equals (AUTO GENERATE IDE)
    /*
    * Notes!
    * > Cara generate :
    * > Code -> Generate... -> equals() and hashCode() -> Pilih IntelliJ Default -> Pilih semua variable/field include equals() & hashCode() -> biarkan jika ada variable yang boleh null -> create
    * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }

    // MATERI HASHCODE
    // Meng-override equals (AUTO GENERATE IDE)
    /*
     * Notes!
     * > Cara generate :
     * > Code -> Generate... -> equals() and hashCode() -> Pilih IntelliJ Default -> Pilih semua variable/field include equals() & hashCode() -> biarkan jika ada variable yang boleh null -> create
     * */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    // MATERI EQUALS
    // meng-override equals (MANUAL)
    /*
    * Notes!
    * > Jangan override manual, karena lama dan panjang
    * */
//    public boolean equals(Object o) {
//        if (o == this) {
//            return true;
//        }
//
//        if (!(o instanceof Product)) {
//            return false;
//        }
//
//        Product product = (Product) o;
//
//        if (this.price != product.price) {
//            return false;
//        }
//
//        if (this.name != null) {
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }

}
