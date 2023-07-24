package programmer.zaman.now.data;

// MATERI RECORD CLASS
/*
* Notes!
* > tidak bisa extends hanya bisa implements interface
* > dikhususkan buat menyimpan data
* > data = imutable = tidak bisa berubah
* > sekali data di set, data tidak bisa diubah
* > default parameter record class adalah final
* */
public record LoginRequest(String username, String password) { // Constructor nya langsung dimasukan kedalam parameter class
    /*
    * Notes!
    * > Jadi tidak perlu membuat constructor seperti biasa
    * */
//    public LoginRequest() {} // Tidak perlu

    /*
    * Notes!
    * > Constructor tanpa () dibawah akan dipanggil ketika constructor otomatis pada parameter record class berhasil dipanggil
    * */
    public LoginRequest{ // Constructor Tanpa () (conmpact constructor)
        System.out.println("Membuat object LoginRequest");
    }

    // Cara membuat constructor dengan parameter berbeda
    /*
    * Notes!
    * > Syaratnya harus tetap memanggil constructor utama yang secara otomatis dibuatkan di parameter record class
    * */
    public LoginRequest(String username) {
        this(username, ""); // harus memanggil constructor utamanya
    }

    public LoginRequest() {
        this("", ""); // harus memanggil constructor utamanya
    }

    // Cara menambahkan method di record class
//    public void sayHello() {}


}
