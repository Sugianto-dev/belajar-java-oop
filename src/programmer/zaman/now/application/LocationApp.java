package programmer.zaman.now.application;

import programmer.zaman.now.data.City;
import programmer.zaman.now.data.Location;

public class LocationApp {
    public static void main(String[] args) {

        // MATERI ABSTRACT CLASS
        // var location = new Location(); // ERROR

        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);

    }
}
