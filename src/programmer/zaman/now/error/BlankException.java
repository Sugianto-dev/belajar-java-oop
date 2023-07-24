package programmer.zaman.now.error;

// MATERI RUNTIME EXCEPTION

@Deprecated // MATERI ANNOTATION, artinya jika class ini tidak direkomendasikan untuk dipakai, maka di pembuatan objek di class lainnya akan terdapat tulisan BlankException dicoret tengah
public class BlankException extends RuntimeException{ // Wajib extends RuntimeException

    public BlankException(String message) {
        super(message);
    }

    // MATERI ANNOTATION
    /*
    * Notes!
    * > Ketika mencoba untuk meng-override getMessage() dari class Throwable, maka otomatis muncul @Override diatasnya
    * > @Override itu hanya sebagai tanda saja, bahwa method getMessage() ini nge-override yang diatasnya
    * > @Override dihapus juga tidak ada masalah
    * */
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
