package programmer.zaman.now.data;

// MATERI STATIC KEYWORD
public class Application {

    // STATIC BLOCK
    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses Class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }

}
