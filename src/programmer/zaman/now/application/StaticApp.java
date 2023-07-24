package programmer.zaman.now.application;

import programmer.zaman.now.data.Application;
import programmer.zaman.now.data.Constant;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

// STATIC IMPORT
/*
* Notes!
* > Bisa memanggil nama field, method, inner class, block langsung tanpa memanggil class nya terlebih dulu
* > Contoh : Constant.APPLICATION -> menjadi -> APPLICATION
*            Application.PROCESSORS -> menjadi -> PROCESSORS
* */
//import static programmer.zaman.now.data.Application.PROCESSORS;
//import static programmer.zaman.now.data.Constant.*;
//import programmer.zaman.now.data.Country;
//import programmer.zaman.now.util.MathUtil;

// MATERI STATIC KEYWORD
public class StaticApp {
    public static void main(String[] args) {

        // Cara memanggil static field
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        // Cara memanggil static method
        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        // Cara memanggil static inner class
        /*
        * Notes!
        * > City tidak bisa mengakses object Country
        * */
        Country.City city = new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        // Cara memanggil static block
        System.out.println(Application.PROCESSORS);

    }
}
