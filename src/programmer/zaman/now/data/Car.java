package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Car", tags = {"application", "java"}) // MATERI ANNOTATION
public interface Car extends HasBrand, IsMaintenance{ // MATERI INTERFACE INHERITANCE (Ketika extends interface lain maka di class konkrit turunan wajib deklarasi/override method pada semua interface)

    // MATERI INTERFACE
    void drive(); // Otomatis public abstract void drive()

    int getTier();

    // MATERI DEFAULT METHOD
    /*
    * Note!
    * - Pada default method, class turunan-nya tidak wajib meng-override method default
    * */
    default boolean isBig() {
        return false;
    }

}
