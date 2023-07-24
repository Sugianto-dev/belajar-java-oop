package programmer.zaman.now.data;

// MATERI INNER CLASS
public class Company { // Outer Class
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee { // Inner Class
        private String name;

        public String getCompany() { // Cara untuk mengakses outer class nya
            return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
