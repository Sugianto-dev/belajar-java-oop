package programmer.zaman.now.data;

public class Cat extends Animal{ // MATERI ABSTRACT METHOD

    // WAJIB MEMBUAT METHOD RUN DARI PARENT ABSTRACT CLASSNYA
    public void run() { // Wajib override dari abstract class nya
        System.out.println("Cat " + name + " is run");
    }

}
