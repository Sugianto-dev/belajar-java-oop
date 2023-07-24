package programmer.zaman.now.application;

import programmer.zaman.now.data.Avanza;
import programmer.zaman.now.data.Car;

public class CarApp {
    public static void main(String[] args) {

        // MATERI INTERFACE
        Car car = new Avanza(); // Polymorphisme (Sama seperti abstract class tidak bisa langsung dibuat object)
        System.out.println(car.getTier());
        car.drive();

    }
}
