package programmer.zaman.now.error;

// MATERI ERROR
public class DatabaseError extends Error { // Extends Error

    public DatabaseError(String message) {
        super(message); // Memanggil super constructor Error
    }

}
