package programmer.zaman.now.data;

public class Category {

    // MATERI GETTER DAN SETTER
    private String id; // Encapsulation

    private boolean expensive; // Encapsulation

    // GETTER DAN SETER
    /*
    * NOTE !
    * - Di IDE ada cara cepat generate getter dan setter
    * - Pilih Code -> Generate -> Getter and Setter -> Select semua private field nya
    * */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        // Salah satu fungsi getter dan setter adalah bisa ditambahkan validasi
        if (id != null){
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
