package programmer.zaman.now.application;

// MATERI STACKTRACEELEMENT CLASS
public class StackTraceApp {
    public static void main(String[] args) {

        /*
        * Notes!
        * > Fungsi :
        *   > Menelusuri lokasi error
        * > Hasilnya adalah :
        *   > Dikasih tau errornya apa
        *   > Dikasih tau lokasi error nya
        *     > Packages mana?
        *     > Class mana?
        *     > Method mana?
        *     > File apa?
        *     > Baris berapa?
        * */
//        try {
//            String[] names = {
//                    "Eko", "Kurniawan", "Khannedy"
//            };
//
//            System.out.println(names[100]);
//        } catch (Throwable throwable) { // Throwable (Parent dari semua exception) biar error ketangkep semua
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace(); // Mengambil detail error
//
//            throwable.printStackTrace(); // Menampilkan detail error
//        }

        // Multiple StackTraceElement
        /*
        * Notes!
        * > Error Bertingkat
        * */
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Eko", "Kurniawan", "Khannedy"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) { // Throwable (Parent dari semua exception) biar error ketangkep semua
            throw new RuntimeException(throwable);
        }
    }
}
