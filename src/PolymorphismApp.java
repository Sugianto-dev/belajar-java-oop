// MATERI POLYMORPHISM
// MATERI TYPE CHECK AND CASTS

public class PolymorphismApp { // Teknik Polymorphisme
    public static void main(String[] args) {

        /*
        * Polymorphism adalah perubahan bentuk dari satu bentuk tipe object ke object lainnya
        *  */

        Employee employee = new Employee("Eko");
        employee.sayHello("Budi"); // sayHello yang di akses dari Employee.java

        employee = new Manager("Eko"); // Polymorphism
        employee.sayHello("Budi"); // sayHello yang di akses dari Manager.java (Walaupun tipe data nya Employee)

        employee = new VicePresident("Eko"); // Polymorphism
        employee.sayHello("Budi"); // sayHello yang di akses dari VicePresident.java (Walaupun tipe data nya Employee)

        // Polymorphism langsung melalui parameter method dibawah
        sayHello(new Employee("Eko"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Budi"));
    }

    static void sayHello(Employee employee){ // Asalkan tipe data parent nya Employee

        // MATERI TYPE CHECK AND CASTS
        // Pengecekan dan konversi tipe data
        /*
        * Notes!
        * > instanceof -> untuk mengecek tipe data (true/false)
        * */
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee; // Konversi tipe data menjadi VicePresident
            System.out.println("Hello VP " + vicePresident.name);
        } else if(employee instanceof Manager){
            Manager manager = (Manager) employee; // Konversi tipe data menjadi Manager
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }

//        System.out.println("Hello " + employee.name);
    }
}
