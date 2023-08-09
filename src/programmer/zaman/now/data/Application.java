package programmer.zaman.now.data;

// MATERI STATIC KEYWORD
public class Application {

    // STATIC BLOCK
    public static final int PROCESSORS;

    /*
    * Notes!
    * > Static Block = akan diekseskusi sekali sebelum class nya di load
    * > Block static hanya bisa mengakses static field / static method
    * */
    static {
        System.out.println("Mengakses Class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }

}
