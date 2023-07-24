package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

// MATERI INNER CLASS
public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company(); // Object 1
        company.setName("Programmer Zaman Now");

        Company.Employee employee = company.new Employee(); // Cara buat object employee
        employee.setName("Eko");

        System.out.println(employee.getName()); // Eko
        System.out.println(employee.getCompany()); // Programmer Zaman Now

        Company company2 = new Company(); // Object 2
        company2.setName("Belum Ada");

        Company.Employee employee2 = company2.new Employee(); // Object 2
        employee2.setName("Budi");

        System.out.println(employee2.getName()); // Budi
        System.out.println(employee2.getCompany()); // Belum Ada

    }
}
