public class PersonApp {
    public static void main(String[] args) {

        // MATERI 2 OBJECT

        var person1 = new Person("Eko", "Subang"); // Object
        // person1.name = "Eko"; // Manipulasi Field
        // person1.address = "Subang"; // Manipulasi Field
        // person1.country = "Amerika"; // ERROR // Manipulasi Field

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        // Memanggil method di class person
        person1.sayHello("Budi");

        Person person2 = new Person("Budi"); // Object

        Person person3;
        person3 = new Person(); // Object
        person3.name = "Joko";
        person3.sayHello("Budi");

    }
}
