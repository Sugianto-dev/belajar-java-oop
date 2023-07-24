package programmer.zaman.now.util;

// MATERI STATIC KEYWORD
public class MathUtil {

    // STATIC METHOD
    /*
    * Notes!
    * > saat mau akses method sum() ini tidak perlu membuat object MathUtil
    * */
    public static int sum(int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        return total;
    }

}
