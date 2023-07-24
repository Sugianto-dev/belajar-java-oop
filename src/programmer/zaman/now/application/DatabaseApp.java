package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

// MATERI ERROR
public class DatabaseApp {
    public static void main(String[] args) {
//        connectDatabase("eko", "eko"); // Sukses
        connectDatabase("eko", null); // Error
        System.out.println("Sukses");

        // Bisa juga dibuat try-catch tapi sangat tidak direkomendasikan
        /*
        * Notes!
        * > Untuk exception Error ini kalau bisa digunakan untuk error yang sangat fatal sekali, jangan cuma error validasi
        * > Contoh error koneksi ke database
        * */
//        try {
//            connectDatabase("eko", null);
//            System.out.println("Sukses");
//        } catch (DatabaseError error) {
//            System.out.println("Error " + error.getMessage());
//        }
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
