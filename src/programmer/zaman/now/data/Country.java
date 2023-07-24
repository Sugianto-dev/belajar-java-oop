package programmer.zaman.now.data;

// MATERI STATIC KEYWORD
public class Country { // Tidak bisa menambahkan static di outer class

    // STATIC INNER CLASS
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class City { // static pada inner class

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
