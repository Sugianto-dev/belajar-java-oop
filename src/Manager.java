// MATERI 8 INHERITANCE
// MATERI 9 METHOD OVERRIDING

/*
* Notes!
* - Bisa buat beda class di satu file java
* - Bisa juga buat di beda file java (Biasanya digunakan)
*
* Overriding adalah ketika membuat method yang sama antara parent dan child
* */

class Manager extends Employee {
    String company;

    /*
    * Note!
    * Kalau anda buat constructor di parent dengan parameter
    * maka di child wajib memanggil minimal 1 constructor parent
    * kecuali constructor tanpa parameter di parent
    */

    // Manager(){} // Default Constructor

    Manager(String name){
        super(name); // memanggil constructor dari parent Employee
    }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    }
}
