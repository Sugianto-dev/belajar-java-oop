package programmer.zaman.now.annotation;

// MATERI REFLECTION

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME) // agar bisa dibaca oleh reflection, selain RUNTIME tidak bisa dibaca
public @interface NotBlank {
    // Tidak perlu menambahkan apa-apa
}
