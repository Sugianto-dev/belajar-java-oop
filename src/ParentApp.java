// MATERI VARIABLE HIDING

public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Eko";
        child.doIt(); // yang keluar doIt di child
        System.out.println(child.name); // yang keluar name dari child

        Parent parent = (Parent) child; // Konversi ke Parent
        // Parent parent = child; // Sebenernya gaperlu di lakuin konversi secara eksplisit seperti diatas, bisa juga ditulis hanya seperti ini
        parent.doIt(); // doIt yang diakses malah dari child // karena kalo method tetap yang diakses adalah method overriding nya
        System.out.println(parent.name); // name yang diakses dari parent // sedangkan variable diakses tetap dari parent nya (Variable hiding)

        /*
        * Notes!
        * > Karena di java tidak ada yang namanya Variable atau Field Overriding
        * > Yang ada hanya Variable Hiding
        * > Tidak disarankan membuat nama variable atau field yang sama antara parent dan turunannya
        * */
    }
}
