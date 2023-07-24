package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

// MATERI EXCEPTION
/*
* Notes!
* > Saat kita memanggil sebuah function yang bisa menyebabkan exception, maka kita wajib menggunakan try-catch expression di Java
* > Ini gunanya agar kita bisa menangkap exception yang terjadi, karena jika tidak ditangkap, lalu terjadi exception, maka secara
*   otomatis program kita akan berhenti
* > Cara menggunakan try-catch expression di java sangat mudah, di block try, kita tinggal panggil method yang bisa menyebabkan
*   exception, dan di block catch, kita bisa melakukan sesuatu jiga terjadi exception
* */
public class ValidationApp {
    public static void main(String[] args) {

//        LoginRequest loginRequest = new LoginRequest(null, null);
//        LoginRequest loginRequest = new LoginRequest("eko", "rahasia");
//        LoginRequest loginRequest = new LoginRequest(null, "rahasia"); // Cek NullPointerException
        LoginRequest loginRequest = new LoginRequest(null, "rahasia"); // Cek ValidationException

        // Cara penanganan error exception dengan try catch
        /*
        * Notes!
        * > Jika terdapat 2 throws exception di ValidationUtil
        * > Maka cara penanganannya adalah dengan menambahkan catch ke 2 (Multiple Try Catch (1))
        * */
//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data valid");
//        } catch (ValidationException exception) {
//            System.out.println("Data tidak valid : " + exception.getMessage());
//        } catch (NullPointerException exception) { // Multiple Try Catch (1)
//            System.out.println("Data null : " + exception.getMessage());
//        }

        // Multiple Try Catch (2)
        /*
        * Notes!
        * > Bisa langsung merge di 1 catch
        * > dengan menggunakan tanda (|) sebagai pemisah jenis throws nya
        * > Bisa lebih dari 1, tidak ada batas, gunakan (|) sebagai pemisah
        * */
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally { // Finally keyword, mau itu error atau tidak, block ini akan tetap di eksekusi
            System.out.println("Selalu di eksekusi");
        }


        // MATERI RUNTIME EXCEPTION
        /*
        * Notes!
        * > Tidak wajib menambahkan try-catch
        * > Tapi perlu diperhatikan, walaupun tidak wajib try-catch, tapi jika ada error aplikasi akan mati
        *
        * Fungsi Runtime Exception
        * > Agar code terlihat clean tanpa banyak try-catch
        * > dengan runtime exception, bisa buat error handler di satu tempat, ketika terjadi error cukup error handler nya disatu tempat
        *   tidak banyak try-catch (contoh penggunaan di MVC)
        *
        * > Perlu Diperhatikan :
        *   > Walaupun runtime exception tidak wajib di try-catch, tapi ada baiknya kita tetap melakukan
        *     try-catch
        *   > Karena jika terjadi runtime exception, yang ditakutkan adalah program kita berhenti
        * */
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");

    }
}
