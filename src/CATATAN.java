public class CATATAN {
    /*
    * Notes!
    * - Semua class di java sebenarnya extends Object tapi disembunyikan
    * - Object merupakan superclass
    * - Cara penulisan  : 1. Class              : Pascal Case (cnt. UserLogin)
    *                     2. Method             : Camel Case (cnt. setPrice)
    *                     3. Field / Variable   : Snake Case (cnt. my_url)
    * - Bisa dilihat dari navigate->class cari object
    * - Ketika membuat sebuah constructor dengan parameter di parent maka di child nya wajib dipanggil didalam constructor nya, kecuali tanpa parameter (default constructor)
    * - Ketika membuat 2 constructor di parent, wajib panggil salah satu di child
    * - Saat object di cast atau diubah tipe datanya, method yang di akses tetap method overidding tapi beda dengan variable hidding yang diakses tetap variable parent nya
    * - Tidak perlu membuat variable yang sama antara parent dan child (Variable hiding)
    * - Biasakan jika membuat sebuah kontrak menggunakan interface jangan abstract
    * - void (tidak mengembalikan data apapun)
    *
    *
    * - MATERI YANG DIBAHAS DI OOP -
    * Class
    * Object
    * Field                     = Variable yang terdapat di class contoh String name;
    * Method                    = Function jika di javascript
    * Constructor               = Method dengan nama yang sama dengan nama classnya / Method yang akan dipanggil saat pertama kali objek dibuat
    * Constructor Overloading   = Membuat banyak constructor pada 1 class dengan jumlah parameter yang berbeda
    * Variable Shadowing        = Ketika nama parameter sama dengan nama field
    * This Keyword              = Mengakses nama variable dari field ketika nama parameter sama atau variable shadowing
    * Inheritance               = Apa yang ada di parent bisa diakses di child
    * Method Overriding         = Membuat method yang sama dengan method yang ada di parent untuk menghasilkan output yang berbeda
    * Super keyword             = Memanggil method atau field di parent
    * Super Constructor         = Memanggil constructor dari parent
    * Object Class              = Sebenarnya semua class yang kita buat adalah extends Object tapi disembunyikan (Navigate -> Class -> Object)
    * Polymorpism               = Perubahan bentuk dari satu bentuk tipe object ke object lainnya
    * Type Check & Casts        = Melakukan pengecekan tipe data dan konversi tipe data
    * Variable Hiding           = Ketika mendeklarasikan 2 variable yang sama di parent dan child nya, maka variable yang diakses parent tetap dari parent nya, sedangkan method yang diakses adalah method overridingnya (method yang di child)
    * Package                   = Seperti folder, bisa diakses dengan tanda titik (.)
    *                             Contoh : programmer.zaman.now
    *                                      programmer.zaman.now.data
    *                                      programmer.zaman.now.application
    *                             Maka otomatis didalamnya terdapat folder data dan application
    * Access Modifier           = =====================================================================
    *                             | Modifier          | Class     | Package   | Subclass  | World     |
    *                             =====================================================================
    *                             | 1. public         | Y         | Y         | Y         | Y         |
    *                             | 2. protected      | Y         | Y         | Y         | N         | (Jarang)
    *                             | 3. no modifier    | Y         | Y         | N         | N         | (Jarang)
    *                             | 4. private        | Y         | N         | N         | N         |
    *                             =====================================================================
    *                             Notes!
    *                             > 1 public class = 1 file java
    *                               Jadi usahakan buat 1 class di 1 file java jangan 1 file banyak class
    * Import                    = Class yang bisa di import hanya class public
    *                             > Notes !
    *                             > class yang ada di package java.lang sudah auto import (String, Integer, Long, Boolean, dll)
    * Abstract Class            = - Tidak dapat membuat object langsung hanya bisa diturunkan
    *                             - Mirip seperti kontrak untuk setiap keturunannya
    * Abstract Method           = Memaksa semua turunan nya membuat abstract method ini, kecuali child nya abstract juga
    * Getter dan Setter         = Proses Encapsulation pada java
    *                             - Encapsulation Adalah memastikan data sensitif sebuah object tersembunyi dari akses luar
    *                             - biasanya kita membuat semua field menggunakan private agar tidak bisa diakses atau diubah dari luar
    *                             - dan untuk bisa diubah, kita akan menyediakan method untuk mengubah dan mengambil field tersebut
    *
    *                             Dan di java tersedia Method/Function Getter dan Setter
    *                             > Getter  = function untuk mengambil data field
    *                             > Setter  = function untuk mengubah data field
    *
    *                             ===================================================================
    *                             | Tipe Data       | Getter Method     | Setter Method             |
    *                             ===================================================================
    *                             | boolean         | isXxx()           | setXxx(boolean value)     |
    *                             | primitif        | getXxx()          | setXxx(primitif value)    |
    *                             | Object          | getXxx()          | setXxx(Object value)      |
    *                             ===================================================================
    *
    *                             Cara Generate Getter Setter : Code -> Generate -> Getter and Setter -> Select field private
    *
    * Interface                 = - Yang lebih tepat untuk kontrak terhadap class child nya bukan abstract tapi interface
    *                             - Tidak ada hubungan dengan GUI
    *                             - Perbedaan dengan Abstract :
    *                               > Semua method otomatis (public) abstract, tidak memiliki block
    *                               > Tidak boleh memiliki field, hanya boleh constant
    *                               > Tidak menggunakan extends melainkan implements
    *
    * Interface Inheritance     = - Sebuah child class bisa implements lebih dari 1 interface
    *                             - Interface pun bisa extends interface lain lebih dari 1 (interface to interface menggunakan extends bukan implements)
    *
    * Default Method            = - Untuk menambahkan konkrit method pada interface
    *                             - Membuat method pada interface tanpa wajib di override di class konkrit turunannya
    *                             - Hanya bisa di java versi 8 keatas
    *
    * ToString Method           = Untuk mengubah representasi string, cukup meng-Override method .toString nya aja
    *
    * Equals Method             = > Di bahasa pemrograman lain untuk mengecek apakah sebuah object sama, dengan menggunakan (==)
    *                             > Di java operator (==) hanya untuk mengecek data primitif
    *                             > Untuk non-primitif menggunakan equals
    *                             > Lebih baik meng-Override method equals
    *                             > Cara generate (AUTO):
    *                             > Code -> Generate... -> equals() and hashCode() -> Pilih IntelliJ Default -> Pilih semua variable/field include equals() & hashCode() -> biarkan jika ada variable yang boleh null -> create
    *
    * HashCode Method           = > Method representasi integer object kita
    *                             > Disarankan untuk meng-override hashCode
    *                             > Tidak mudah meng-override method hashCode, karena ada kontraknya :
    *                               > 1. sebanyak apapun hashCode dipanggil, untuk object yang sama, harus menghasilkan data integer yang sama
    *                               > 2. jika ada 2 object yang sama jika dibandingkan menggunakan method equals, maka nilai hashCode nya juga harus sama
    *                               > 3. Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan jumlah integer sekitar 2 milyar
    *
    * Final Class               = > Artinya class tidak dapat diwariskan lagi
    *
    * Final Method              = > Artinya method tersebut tidak bisa di override di class child nya
    *                             > Sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi oleh class child nya
    *
    * Inner Class               = > Class didalam class
    *                             > Keuntungan :
    *                               > Kemampuan untuk mengakses outer class nya
    *                               > Inner class bisa membaca semua private member yang ada di outer class nya
    *                               > Untuk mengakses object outer class nya, kita bisa menggunakan nama class outer nya diikuti dengan
    *                                 kata kunci this, misalnya Company.this
    *                               > Dan untuk mengakses super class outer class nya, kita bisa menggunakan nama class outernya diikuti
    *                                 dengan kata kunci super, misal Company.super
    *                             > Company.java, CompanyApp.java
    *
    * Anonymous Class           = > Class tanpa nama
    *                             > Termasuk inner class, dimana outer class nya adalah tempat dimana kita membuat anonymous class tersebut
    *                             > Sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface atau abstract class
    *                               sederhana, tanpa harus membuat implementasi classnya
    *                             > HelloWorld.java, HelloWorldApp.java
    *
    * Static Keyword            = > dengan static keyword, kita bisa membuat field, method atau class bisa diakses langsung tanpa melalui
    *                               object nya
    *                             > Perlu diingat, static hanya bisa diakses static lainnya
    *                             > Static dapat digunakan di :
    *                               > Field, atau disebut class variable, artinya field tersebut bisa diakses langsung tanpa membuat
    *                                 object terlebih dahulu
    *                               > Method, atau disebut class method, artinya method tersebut bisa diakses langsung tanpa membuat
    *                                 object terlebih dahulu
    *                               > Block, static block akan otomatis dieksekusi ketika sebuah class di load
    *                               > Inner Class, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat
    *                                 object outer class  terlebih dahulu. Static pada inner class menyebabkan kita tidak bisa
    *                                 mengakses lagi object outer class nya
    *                             > Biasanya untuk class yang isinya method helper
    *                             > Constant.java, MathUtil.java, Country.java, data.Application.java, StaticApp.java
    *
    * Record Class              = > Di java 15 masih eksperimental
    *                             > Kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya berisi getter,
    *                               equals, hashCode, dan toString method
    *                             > Record class digunakan untuk mempermudah pembuatan jenis class tersebut
    *                             > Saat kita membuat record class, secara otomatis Java akan membuatkan getter, equals, hashCode dan
    *                               toString method secara otomatis, dan juga constructor secara otomatis
    *                             > Saat membuat record class, secara otomatis kita akan meng-extends class java.lang.Record, yang
    *                               artinya kita tidak bisa extends class lain. Namun kita tetap bisa meng-implement interface
    *                             > Record class tidak akan membuatkan method setter nya
    *                             > Artinya record class = imotable = tidak bisa dirubah
    *                             > Jadi setelah membuat objek value nya tidak dapat diubah lagi
    *                             > LoginRequest.java, RecordApp.java
    *
    * Enum Class                = > Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas
    *                             > Misal, gender, ada male dan female, atau tipe customer, ada standard, premium atau vip, dan
    *                               lain-lain
    *                             > Dalam kasus seperti ini, kita bisa menggunakan enum class, yaitu class yang berisikan nilai
    *                               terbatas yang sudah ditentukan
    *                             > Saat membuat enum class, secara otomatis dia akan meng-extends class java.lang.Enum, oleh karena
    *                               itu class enum tidak bisa extends class lain, namun masih tetap bisa implements interface.
    *                             > Enum Members :
    *                               > Sama seperti class biasanya, di class enum pun kita bisa menambahkan members (field, method
    *                                 dan constructor)
    *                               > Khusus constructor, kita tidak bisa membuat public constructor, karena memang tujuan enum bukan
    *                                 untuk di instansiasi secara bebas
    *                             > Level.java, Customer.java, EnumApp.java
    *
    * Exception                 = > Di Java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam
    *                               bentuk class exception
    *                             > Kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh Java
    *                             > Jika kita ingin membuat exception, maka kita harus membuat class yang extends class Throwable
    *                               atau turunan-turunannya
    *                             > Membuat Exception :
    *                               > Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka
    *                                 method tersebut harus ditandai dengan kata kunci throws diikuti dengan class exception nya.
    *                               > Jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambah
    *                                 lebih dari satu class exception
    *                               > Di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw,
    *                                 diikuti dengan object exception nya
    *                             > Finally Keyword :
    *                               > Dalam try-catch, kita bisa menambahkan block finally
    *                               > Block finally ini adalah block dimana akan selalu dieksekusi baik terjadi exception ataupun
    *                                 tidak
    *                               > Ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal
    *                                 di block try kita ingin membaca file, di block catch kita akan tangkap jika terjadi error, dan
    *                                 di block finally error ataupun sukses membaca file, kita wajib menutup koneksi ke file tersebut,
    *                                 biar tidak menggantung di memory
    *                             > ValidationException.java, ValidationUtil.java, ValidationApp.java
    *
    * Runtime Exception         = > Secara garis besar, di Java, exception dibagi menjadi 3 jenis :
    *                               > Checked Exception, yaitu exception yang wajib di try catch, seperti yang sudah kita bahas
    *                                 sebelumnya
    *                               > Runtime Exception, dan
    *                               > Error (yang akan kita bahas di materi selanjutnya)
    *                             > Runtime Exception :
    *                               > Runtime exception  adalah jenis exception yang tidak wajib di tangkap menggunakan try catch
    *                               > Kompiler Java tidak akan protes walaupun kita tidak menggunakan try catch ketika kita memanggil
    *                                 method yang bisa menyebabkan runtime exception
    *                               > Untuk membuat class runtime exception, kita wajib mengextends class RuntimeException
    *                               > Ada banyak di Java yang merupakan runtime exception, seperti NullPointerException,
    *                                 IllegalArgumentException, dan lain-lain
    *                             > Perlu Diperhatikan :
    *                               > Walaupun runtime exception tidak wajib di try-catch, tapi ada baiknya kita tetap melakukan
    *                                 try-catch
    *                               > Karena jika terjadi runtime exception, yang ditakutkan adalah program kita berhenti
    *                             > BlankException.java, ValidationUtil.java, ValidationApp.java
    *
    * Error                     = > Error adalah jenis exception yang terakhir
    *                             > Error adalah sebuah class di Java, yang tidak direkomendasikan untuk di try-catch
    *                             > Biasanya error terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk di
    *                               try catch
    *                             > Artinya, direkomendasikan untuk mematikan aplikasi
    *                             > Contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi ke database, direkomendasikan untuk
    *                               membuat exception jenis Error, dan menghentikan aplikasi
    *                             > DatabaseError.java, DatabaseApp.java
    *
    * StackTraceElement Class   = > Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan Array dari
    *                               StackTraceElement object
    *                             > StackTraceElement berisikan informasi tentang, class, file bahkan baris lokasi terjadinya error
    *                             > Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi
    *                             > Cara yang paling mudah, kita bisa memanggil method printStackTrace() class Throwable, untuk
    *                               memprint ke console detail error StackTraceElement nya
    *                             > StackTraceApp.java
    *
    * Try With Resource         = > Di Java 7, terdapat fitur baru yang bernama try with resource
    *                             > Try with resource adalah sebuah mekanisme agar kita lebih mudah menggunakan resource
    *                               (yang wajib di close) dalam block try
    *                             > Jika kita ingin menggunakan fitur ini, kita wajib menggunakan interface AutoCloseable
    *                             > LANGKAH :
    *                               > Buat File baru, README.md (di belajar-java-oop)
    *                             > README.md, ReadApp.java
    *
    * Annotation                = > Annotation adalah menambahkan metadata ke kode program yang kita buat
    *                             > Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat kita ingin membuat
    *                               library / framework
    *                             > Annotation sendiri bisa diakses menggunakan Reflection, yang akan kita bahas nanti
    *                             > Untuk membuat annotation, kita bisa menggunakan kata kunci @interface
    *                             > Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value
    *                             > ATRIBUT ANNOTATION :
    *                               -------------------------------------------------------------------------------------------------
    *                               | Attribute             | Keterangan                                                            |
    *                               -------------------------------------------------------------------------------------------------
    *                               | @Target               | Memberitahu annotation bisa digunakan dimana? Class, method, field,   |
    *                               |                       | dan lain-lain                                                         |
    *                               | ----------------------|------------------------------------------------------------------------
    *                               | @Retention            | Memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah |
    *                               |                       | bisa dibaca oleh reflection                                           |
    *                               -------------------------------------------------------------------------------------------------
    *
    *                             > Predefined Annotation :
    *                               > Java juga sudah memiliki annotation bawaan, seperti :
    *                                 > @Override, untuk menandai bahwa method yang meng-override method parent class nya
    *                                 > @Deprecated, untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan
    *                                 > @FunctionalInterface, untuk menandai bahwa class tersebut bisa dibuat sebagai lambda expression
    *                                 > dan lain-lain
    *
    *                             > Fancy.java(Annotation), AnimalApp.java, Car.java(Interface Class), Level.java(Enum Class)
    *                               , BlankException.java
    *
    * Reflection                = > Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan
    *                             > Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework, sehingga
    *                               bisa meng-otomatisasi pekerjaan
    *                             > Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan method getClass() atau
    *                               NamaClass.class
    *
    *                             > Perlu Diperhatikan :
    *                               > Reflection adalah materi yang sangat panjang
    *                               > Oleh karena itu materi Java Reflection akan dibuatkan course terpisah
    *
    *                             > NotBlank.java(Annotation), ValidationUtil.java, CreateUserRequest.java, ReflectionApp.java
    * */
}
