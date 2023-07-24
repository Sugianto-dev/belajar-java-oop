package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {

        // MATERI EQUALS
        String first = "Eko";
        first = first + " " + "Khannedy";

        System.out.println(first); // Object 1

        String second = "Eko Khannedy";
        System.out.println(second); // Object 2

        System.out.println(first == second); // False (Karena Objeknya beda)
        System.out.println(first.equals(second));

        String third = "Eko Khannedy";

        System.out.println(second == third); // Anehnya ini True, padahal objeknya beda
        /*
        * Note!
        * > Walaupun second dan third objeknya beda, tetapi java meng-optimize memory
        * > Jadi ketika kita buat String dengan value yang sama, maka java tidak akan membuat ulang data String nya di memory
        * > Java akan me-refer ke objek yang sudah ada
        * > Intinya equals() membandingkan apakah objeknya sama di memory atau beda
        *
        * > Jika membuat class Alangkah baiknya anda meng-override method equals()
        * > Karena nantinya untuk membandingkan tidak akan memakai (==)
        * */

        System.out.println(second.equals(third));

        /*
        * Kesimpulan!
        * > Jika kita menggunakan equals() maka isi kontennya yang akan dibandingkan, apakah sama atau tidak
        * */

    }
}
