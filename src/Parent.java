// MATERI VARIABLE HIDING

public class Parent {
    String name;
    void doIt(){
        System.out.println("Do it in parent");
    }
}

class Child extends Parent{
    String name; // nge-Variable Hiding field di Parent
    void doIt(){ // Akan nge-Override method di Parent
        System.out.println("Do it in child");
        System.out.println("Parent name is " + super.name); // untuk mengakses name dari parent nya
    }
}
