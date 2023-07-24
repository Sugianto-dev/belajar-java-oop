class VicePresident extends Manager { // Inheritance - child dari class manager
    VicePresident(String name){
        super(name); // Proses memanggil constructor parent dikarenakan terdapat parameter
    }

    /*
    * Notes!
    * > Tidak perlu memanggil ulang constructor parent jika default constructor di parent (tidak ada parameter)
    * */

    void sayHello(String name){ // Method Overriding
        System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }
}
