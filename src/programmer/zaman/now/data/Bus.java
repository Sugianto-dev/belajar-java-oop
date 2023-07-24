package programmer.zaman.now.data;

public class Bus implements Car{
//    @Override
    public void drive() {
        System.out.println("Bus drive");
    }

//    @Override
    public int getTier() {
        return 8;
    }

//    @Override
    public String getBrand() {
        return "HINO";
    }

//    @Override
    public boolean isMaintenance() {
        return false;
    }

    // MATERI DEFAULT METHOD
    /*
    * Note!
    * - Bisa menambahkan method di interface tanpa wajib di deklarasi pada class child nya
    * */
//    @Override
    public boolean isBig() {
        return true;
    }
}
