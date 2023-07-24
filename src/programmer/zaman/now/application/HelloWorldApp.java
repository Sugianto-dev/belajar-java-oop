package programmer.zaman.now.application;

import programmer.zaman.now.data.HelloWorld;

// MATERI ANONYMOUS CLASS
public class HelloWorldApp {
    public static void main(String[] args) {

        // Biasanya kita harus membuat SampleHelloWorld
//        HelloWorld helloWorld = new SampleHelloWorld();

        // Tapi dengan anonymous class itu tidak perlu
        HelloWorld english = new HelloWorld() { // Anonymous Class
//            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

//            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };
        /*
        * Kekurangan anonymous class :
        * > Tidak bisa di reuse
        * */

        HelloWorld indonesia = new HelloWorld() { // Anonymous Class
            //            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            //            @Override
            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Eko");

        indonesia.sayHello();
        indonesia.sayHello("Eko");

    }
}
