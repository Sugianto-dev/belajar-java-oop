class Person { // Class, Public dihapus dulu dan akan dibahas dimateri lain

    // MATERI 1 CLASS
    // MATERI 3 FIELD
    // MATERI 4 METHOD
    // MATERI 5 CONSTRUCTOR
    // MATERI 6 VARIABLE SHADOWING
    // MATERi 7 THIS KEYWORD

    /*
    * Notes!
    * main class ini ada di PersonApp.java
    * void tidak mengembalikan data apapun
    *
    * Construktor adalah method yang dipanggil pertama kali saat objek dibuat
    *
    * Ketika constructor terdapat parameter maka ketika membuat object wajib pakai parameter juga
    * */

    String name; // Field
    String address; // Field
    final String country = "Indonesia"; // Field, value final gabisa diubah

    // Constructor & Constructor Overloading
    /*
    * Notes!
    * Overloading(Method / Constructor) adalah ketika dibuat dengan jumlah parameter yang berbeda
    *
    * THIS KEYWORD
    * this mengatasi variable shadowing
    * this artinya dari objek saat ini
    * */
    Person(String name, String address) {
        this.name = name; // this mengatasi variable shadowing
        this.address = address; // this mengatasi variable shadowing
    }

    Person(String paramName) { // Method Overloading
        // name = paramName;
        this(paramName, null); // memanggil constructor lain
    }

    Person(){ // Method Overloading
        this(null); // Sebenernya gaperlu manggil constructor lain untuk yang tanpa parameter
    }

    // Method
    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is " + this.name); // this mengatasi variable shadowing
    }
}
