// MATERI INHERITANCE

public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Eko");
//        manager.name = "Eko";
        manager.sayHello("Budi");

        var vp = new VicePresident("Joko");
//        vp.name = "Joko";
        vp.sayHello("Budi"); // Method yang dipanggil adalah method overriding yang ada di VicePresident.java

        // MATERI OBJECT CLASS
        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());

    }
}
