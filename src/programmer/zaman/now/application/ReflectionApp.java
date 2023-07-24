package programmer.zaman.now.application;

import programmer.zaman.now.data.CreateUserRequest;
import programmer.zaman.now.util.ValidationUtil;

// MATERI REFLECTION
public class ReflectionApp {
    public static void main(String[] args) {

        /*
        * Notes!
        * > Enaknya pakai reflection adalah :
        *   > tidak perlu repot membuat validasi manual dengan if-else
        *   > bisa buat validasi framework, lebih ke framework karena reflection general
        * */
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("eko");
        request.setPassword("eko");
        request.setName("eko");

        ValidationUtil.validationReflection(request); // ERROR, jadi gaperlu buat validasi if-else

    }
}
