package programmer.zaman.now.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// MATERI TRY WITH RESOURCE
public class ReadApp {
    public static void main(String[] args) {

        // CARA 1 - CLOSE MANUAL

//        BufferedReader reader = null;

//        try {
//            reader = new BufferedReader(
//                    new FileReader("README.md")
//            );
//
//            while (true) {
//                String line = reader.readLine();
//                if (line == null) {
//                    break;
//                }
//                System.out.println(line);
//            }
//        }catch (Throwable throwable){
//            System.out.println("Error membaca file " + throwable.getMessage());
//        }finally {
//            if (reader != null) {
////                reader.close(); // Bisa menyebabkan error IOException, maka perlu try-catch
//                try {
//                    reader.close(); // Close Manual
//                    System.out.println("Sukses menutup");
//                }catch (IOException exception) {
//                    System.out.println("Error menutup resource " + exception.getMessage());
//                }
//            }
//        }


        // CARA 2 - MENGGUNAKAN TRY WITH RESOURCE

        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) { // Try With Resource

            // Proses membaca file
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        }catch (Throwable throwable){
            System.out.println("Error membaca file " + throwable.getMessage());
        }

    }
}
