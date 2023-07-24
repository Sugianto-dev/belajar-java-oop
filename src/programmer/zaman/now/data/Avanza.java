package programmer.zaman.now.data;

public class Avanza implements Car, IsMaintenance{ // MATERI INTERFACE INHERITANCE (Cara implements 2 interface)

    // MATERI INTERFACE
    // Cara implements class interface
    // Wajib method pada class interface untuk di implementasikan

//    @Override // Abaikan terlebih dahulu nanti akan dijelaskan
    public void drive() {
        System.out.println("Avanza drive");
    }

//    @Override
    public int getTier() {
        return 4;
    }

    // MATERI INTERFACE INHERITANCE
//    @Override
    public String getBrand() {
        return "Toyota";
    }

//    @Override
    public boolean isMaintenance() {
        return false;
    }
}
