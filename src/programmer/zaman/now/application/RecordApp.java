package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;

// MATERI RECORD CLASS
public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("eko", "rahasia");

        System.out.println(loginRequest.username()); // method getter (tidak lagi getUsername())
        System.out.println(loginRequest.password()); // method getter (tidak lagi getPassword())
        System.out.println(loginRequest); // toString otomatis di generate record class

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("eko"));
        System.out.println(new LoginRequest("eko", "rahasia"));

    }
}
