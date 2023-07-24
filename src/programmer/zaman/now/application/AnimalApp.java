package programmer.zaman.now.application;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.Animal;
import programmer.zaman.now.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"}) // MATERI ANNOTATION
public class AnimalApp {
    public static void main(String[] args) {

        // MATERI ABSTRACT CLASS + ABSTRACT METHOD
        Animal animal = new Cat(); //Polymorphism (Karena abstract class tidak dapat langsung dibuat object)
        animal.name = "Puss";
        animal.run();

    }
}
