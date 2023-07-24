package programmer.zaman.now.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// MATERI ANNOTATION

// Contoh Memakai value (tidak wajib)
//@Target(value = {ElementType.TYPE})
//@Retention(value = RetentionPolicy.RUNTIME)

// Contoh tidak memakai value
/*
* Notes!
* > Annotation, fungsi :
*   > Untuk menambahkan informasi aja
*
* > ElementType.TYPE :
*   > Bisa digunakan di Class, Interface, Enum
* > ElementType.METHOD :
*   > ...
* > ...
* */
@Target({ElementType.TYPE}) // valuenya array, ElementType tidak hanya TYPE, ada banyak
@Retention(RetentionPolicy.RUNTIME) // valuenya bukan array, RetentionPolicy tidak hanya RUNTIME, ada banyak
public @interface Fancy {

    /*
    * Notes!
    * > Jika tidak pakai default value, wajib memasukan atribut name saat annotation dipakai
    * */
    String name(); // Contoh tidak pakai default value
//    String name() default ""; // Contoh pakai default value

    String[] tags() default {};

}
