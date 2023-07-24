package programmer.zaman.now.data;

// MATERI FINAL CLASS
class SocialMedia {
    String name;
}

//final class Facebook extends SocialMedia { // class di set Final, class tidak bisa diturunkan
//
//}

//class FakeFacebook extends Facebook { // Error, Tidak bisa mewarisi dari class final
//
//}

// MATERI FINAL METHOD
class Facebook extends SocialMedia {
    final void login(String username, String password) { // method di set final, agar tidak bisa di override oleh class turunannya
        // isi method
    }
}

class FakeFacebook extends Facebook {
//    void login(String username, String password) { // Error method tidak bisa di override, dikarenakan final
//        // isi method
//    }
}