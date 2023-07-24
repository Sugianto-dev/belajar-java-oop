package programmer.zaman.now.application;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        // MATERI GETTER DAN SETTER
        var category = new Category();
        category.setId("ID");
        category.setId(null);
        // category.id = null; // Tidak bisa dilakukan karena field id private & telah di encapsulation

        System.out.println(category.getId()); // Maka yang tampil hanya ID, karena jika null tidak ditampilkan

    }
}
