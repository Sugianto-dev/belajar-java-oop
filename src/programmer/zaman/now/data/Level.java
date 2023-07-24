package programmer.zaman.now.data;

// MATERI ENUM CLASS
/*
* Notes!
* > Kebiasaan enum class huruf besar
* > Bisa juga 1 baris
* > jika dibawahnya tidak ada code seperti method, dll, tidak perlu (;)
* > di enum class juga masih bisa buat method
* */

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Car", tags = {"application", "java"}) // MATERI ANNOTATION
public enum Level {
    /*
    * Notes!
    * > Wajib menambahkan constructor jika ada constructor
    * */
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level"); // karena ada code lain dibawahnya maka perlu (;)

    private String description;

    // Membuat constructor
    Level(String description) { // tidak boleh di set public
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
