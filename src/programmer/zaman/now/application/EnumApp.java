package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

// MATERI ENUM CLASS
public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Eko");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel()); // aslinya customer.getLevel().toString(), toString nya otomatis dibuatkan
                                                 // sesuai nama levelnya
        System.out.println(customer.getLevel().getDescription());

        // KONVERSI ENUM KE STRING
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
//        Level level = Level.valueOf("SALAH"); // ERROR karna SALAH tidak ada di enum class
        System.out.println(level);

        System.out.println("Print Level");
        for (var value : Level.values()) {
            System.out.println(value);
        }

    }
}
