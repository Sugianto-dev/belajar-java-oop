package programmer.zaman.now.util;

import programmer.zaman.now.annotation.NotBlank;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.BlankException;
import programmer.zaman.now.error.ValidationException;

import java.lang.reflect.Field;

// MATERI EXCEPTION
public class ValidationUtil {

    /*
    * Notes!
    * > Wajib throws exception nya
    * */
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException { // Jika lebih dari 1 bisa tambahkan (,) (contoh : ValidationException, NullPointerException)
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    // MATERI RUNTIME EXCEPTION
    /*
    * Notes!
    * > Runtime Exception tidak wajib throws seperti exception diatas
    * > NullPointerException tidak perlu throws, karna extends nya sudah Runtime Exception
    * */
    public static void validateRuntime(LoginRequest loginRequest) { // Tidak wajib throws
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    // MATERI REFLECTION
    /*
    * Notes!
    * > Contoh kasus saat ini :
    *   > Meng-otomatisasi validation yang awalnya menggunakan if-else (seperti method diatas), jadi menggunakan reflection
    *   > Syaratnya menambahkan informasi dengan annotation didalam field-field yang akan di validasi
    *
    * > Terlihat panjang, tapi efeknya tidak perlu melakukan validasi secara manual
    * */
    public static void validationReflection(Object object) { // Memakai Object (artinya class apapun bisa divalidasi)
        Class aClass = object.getClass(); // untuk mendapatkan class nya
        Field[] fields = aClass.getDeclaredFields(); // untuk mendapatkan field nya, kalo getFields() cuma yang public fields

        for(Field field : fields){
            field.setAccessible(true); // agar memaksa field yang private supaya bisa diakses

            if (field.getAnnotation(NotBlank.class) != null) {
                // validated
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
//                        throw new ValidationException("Field " + field.getName() + " is blank "); // wajib throws
                        throw new BlankException("Field " + field.getName() + " is blank "); // biar gak wajib throws
                    }
                }catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }

        }
    }

}
