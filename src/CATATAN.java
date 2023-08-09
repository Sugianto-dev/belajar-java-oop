public class CATATAN {
    /*
    * Notes!
    * - Semua class di java sebenarnya extends Object tapi disembunyikan
    * - Object merupakan superclass
    * - Cara penulisan  : 1. Class              : Pascal Case (cnt. UserLogin)
    *                     2. Method             : Camel Case (cnt. setPrice)
    *                     3. Field / Variable   : Snake Case (cnt. my_url)
    * - Bisa dilihat dari navigate->class cari object
    * - Ketika membuat sebuah constructor dengan parameter di parent maka di child nya wajib dipanggil didalam constructor nya, kecuali tanpa
    *   parameter (default constructor)
    * - Ketika membuat 2 constructor di parent, wajib panggil salah satu di child
    * - Saat object di cast atau diubah tipe datanya, method yang di akses tetap method overidding tapi beda dengan variable hidding yang
    *   diakses tetap variable parent nya
    * - Tidak perlu membuat variable yang sama antara parent dan child (Variable hiding)
    * - Biasakan jika membuat sebuah kontrak menggunakan interface jangan abstract
    * - void (tidak mengembalikan data apapun)
    *
    *
    * - MATERI YANG DIBAHAS DI OOP -
    * OOP                       = > Object Oriented Programming adalah sudut pandang bahasa pemrograman yang berkonsep “objek”
    *                             > Ada banyak sudut pandang bahasa pemrograman, namun OOP adalah yang sangat populer saat ini.
    *                             > Ada beberapa istilah yang perlu dimengerti dalam OOP, yaitu: Object dan Class
    *
    *                             > Object :
    *                               > Object adalah data yang berisi field / properties / attributes dan method / function / behavior
    *                               > Semua data bukan primitif di Java adalah object, dari mulai Integer, Boolean, Character, String dan yang
    *                                 lainnya
    *
    *                             > Class :
    *                               > Class adalah blueprint, prototype atau cetakan untuk membuat Object
    *                               > Class berisikan deklarasi semua properties dan functions yang dimiliki oleh Object
    *                               > Setiap Object selalu dibuat dari Class
    *                               > Dan sebuah Class bisa membuat Object tanpa batas
    *
    * Class                     = > Untuk membuat class, kita bisa menggunakan kata kunci class
    *                             > Penamaan class biasa menggunakan format CamelCase
    *                             > Nama Class = Nama file java
    *
    *                             > Person.java
    *
    * Object                    = > Object adalah hasil instansiasi dari sebuah class
    *                             > Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama Class dan kurung ()
    *
    *                             > jika belum dideklarasikan maka nilainya null
    *
    *                             > Person.java, PersonApp.java
    *
    * Field                     = > Fields / Properties / Attributes adalah data yang bisa kita sisipkan di dalam Object
    *                             > Namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan data apa aja yang dimiliki
    *                               object tersebut di dalam deklarasi class-nya
    *                             > Membuat field sama seperti membuat variable, namun ditempatkan di block class
    *
    *                             > Manipulasi Field :
    *                               > Fields yang ada di object, bisa kita manipulasi. Tergantung final atau bukan.
    *                               > Jika final, berarti kita tidak bisa mengubah data field nya, namun jika tidak, kita bisa mengubah
    *                                 field nya
    *                               > Untuk memanipulasi data field, sama seperti cara pada variable
    *                               > Untuk mengakses field, kita butuh kata kunci . (titik) setelah nama object dan diikuti nama fields nya
    *
    *                             > Variable yang terdapat di class contoh String name;
    *
    *                             > Person.java, PersonApp.java
    *
    * Method                    = > Selain menambahkan field, kita juga bisa menambahkan method ke object
    *                             > Cara dengan mendeklarasikan method tersebut di dalam block class
    *                             > Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading
    *                               di method yang ada di dalam block class
    *                             > Untuk mengakses method tersebut, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama method nya.
    *                               Sama seperti mengakses field
    *
    *                             > Function jika di javascript
    *
    *                             > Person.java, PersonApp.java
    *
    * Constructor               = > Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung ()
    *                             > Di dalam class Java, kita bisa membuat constructor, constructor adalah method  yang akan dipanggil saat
    *                               pertama kali Object dibuat.
    *                             > Mirip seperti di method, kita bisa memberi parameter pada constructor
    *                             > Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value
    *
    *                             > Method dengan nama yang sama dengan nama classnya / Method yang akan dipanggil saat pertama kali objek
    *                               dibuat
    *
    *                             > Person.java, PersonApp,java
    *
    * Constructor Overloading   = > Sama seperti di method, di constructor pun kita bisa melakukan overloading
    *                             > Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda, atau
    *                               jumlah parameter harus berbeda
    *
    *                             > Membuat banyak constructor pada 1 class dengan jumlah parameter yang berbeda
    *
    *                             > Memanggil Constructor Lain :
    *                               > Constructor bisa memanggil constructor lain
    *                               > Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan
    *                               > Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namun
    *                                 dengan kata kunci this
    *
    *                             > Person.java, PersonApp.java
    *
    * Variable Shadowing        = > Variable shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang sama di scope yang
    *                               menutupi variable dengan nama yang sama di scope diatasnya
    *                             > Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class
    *                             > Saat terjadi variable shadowing, maka secara otomatis variable di scope diatasnya tidak bisa diakses
    *
    *                             > Ketika nama parameter sama dengan nama field
    *
    *                             > Person.java, PersonApp.java
    *
    * This Keyword              = > Saat kita membuat kode di dalam block constructor atau method di dalam class, kita bisa menggunakan kata
    *                               kunci this untuk mengakses object saat ini
    *                             > Misal kadang kita butuh mengakses sebuah field yang namanya sama dengan parameter method, hal ini tidak
    *                               bisa dilakukan jika langsung menyebut nama field, kita bisa mengakses nama field tersebut dengan kata
    *                               kunci this
    *                             > This juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan
    *                               untuk mengakses method
    *                             > This bisa digunakan untuk mengatasi masalah variable shadowing
    *
    *                             > Mengakses nama variable dari field ketika nama parameter sama atau variable shadowing
    *
    *                             > Person.java, PersonApp.java
    *
    * Inheritance               = > Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
    *                             > Dalam artian, kita bisa membuat class Parent dan class Child
    *                             > Class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child
    *                             > Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent, secara otomatis akan
    *                               dimiliki oleh class Child
    *                             > Untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extends lalu diikuti dengan
    *                               nama class parent nya.
    *
    *                             > Apa yang ada di parent bisa diakses di child (... extends ...)
    *
    *                             > Manager.java, VicePresident.java, ManagerApp.java
    *
    * Method Overriding         = > Method overriding adalah kemampuan mendeklarasikan ulang method di child class, yang sudah ada di parent
    *                               class
    *                             > Saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class
    *                               child, method yang di class parent tidak bisa diakses lagi
    *
    *                             > Membuat method yang sama dengan method yang ada di parent untuk menghasilkan output yang berbeda
    *
    *                             > Manager.java, VicePresident.java, ManagerApp.java
    *
    * Super keyword             = > Kadang kita ingin mengakses method yang terdapat di class parent yang sudah terlanjur kita override di
    *                               class child
    *                             > Untuk mengakses method milik class parent, kita bisa menggunakan kata kunci super
    *                             > Sederhananya, super digunakan untuk mengakses class parent
    *                             > Tidak hanya method, field milik parent class pun bisa kita akses menggunakan kata kunci super
    *
    *                             > Memanggil method atau field di parent
    *
    *                             > Shape.java, Rectangle.java, ShapeApp.java
    *
    * Super Constructor         = > Tidak hanya untuk mengakses method atau field yang ada di parent class, kata kunci super juga bisa
    *                               digunakan untuk mengakses constructor
    *                             > Namun syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya di dalam class child
    *                               constructor
    *                             > Jika sebuah class parent tidak memiliki constructor yang tidak ada parameter-nya (tidak memiliki default
    *                               constructor), maka class child wajib mengakses constructor class parent tersebut.
    *
    *                             > Memanggil constructor dari parent (hanya bisa dipanggil dari constructor lagi)
    *                             > Notes!
    *                               > Jika terdapat constructor dengan parameter di parent, maka wajib memanggil constructor parent dari
    *                                 constructor child nya (dengan super([param])) (jika lebih dari satu cukup salah satu constructor saja)
    *                               > Kecuali constructor default atau tanpa parameter
    *
    *                             > Manager.java, VicePresident.java, ManagerApp.java
    *
    * Object Class              = > Di Java, setiap class yang kita buat secara otomatis adalah turunan dari class Object
    *                             > Walaupun tidak secara langsung kita eksplisit menyebutkan extends Object, tapi secara otomatis Java akan
    *                               membuat class kita extends Object
    *                             > Bisa dikatakan class Object adalah superclass untuk semua class yang ada di Java
    *
    *                             > Sebenarnya semua class yang kita buat adalah extends Object tapi disembunyikan
    *                               (Navigate -> Class -> Object)
    *
    *                             > Object.java, ManagerApp.java
    *
    * Polymorpism               = > Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
    *                             > Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
    *                             > Polymorphism erat hubungannya dengan Inheritance
    *
    *                             > Perubahan bentuk dari satu bentuk tipe object ke object lainnya
    *
    *                             > Employee.java, Manager.java, VicePresident.java, PolymorphismApp.java
    *
    * Type Check & Casts        = > Sebelumnya kita sudah tau cara melakukan konversi tipe data (casts) di tipe data primitif
    *                             > Casts juga bisa digunakan untuk tipe data bukan primitif
    *                             > Namun agar aman, sebelum melakukan casts, pastikan kita melakukan type check (pengecekan tipe data),
    *                               dengan menggunakan kata kunci instanceof
    *                             > Hasil operator instanceof adalah boolean, true jika tipe data sesuai, false jika tidak sesuai
    *
    *                             > Melakukan pengecekan tipe data dan konversi tipe data (... instanceof ...)
    *
    *                             > PolymorphismApp.java
    *
    * Variable Hiding           = > Variable hiding merupakan masalah yang terjadi ketika kita membuat nama field sama di class child dengan
    *                               nama field di class parent
    *                             > Tidak ada yang namanya field overriding, ketika kita buat ulang nama field di class class, itu berarti
    *                               variable hiding
    *                             > Untuk mengatasi variable hiding, caranya kita bisa menggunakan super keyword
    *                             > Yang membedakan variable hiding dan method overriding adalah ketika sebuah object di casts
    *                             > Saat object di casts, method akan tetap mengakses method overriding, namun variable akan mengakses
    *                               variable yang ada di class nya
    *
    *                             > Ketika mendeklarasikan 2 variable yang sama di parent dan child nya, maka variable yang diakses parent
    *                               tetap dari parent nya, sedangkan method yang diakses adalah method overridingnya (method yang di child)
    *
    *                             > Parent.java, Child.java, ParentApp.java
    *
    * Package                   = > Saat kita membuat aplikasi, bisa dipastikan kita akan banyak sekali membuat class
    *                             > Jika class terlalu banyak, kadang akan menyulitkan kita untuk mencari atau mengklasifikasikan
    *                               jenis-jenis class
    *                             > Java memiliki fitur package, yaitu fitur mirip folder / direktori, dimana kita bisa menyimpan class-class
    *                               kita di dalam package
    *                             > Sama seperti folder / direktori, package juga bisa nested, kita bisa menggunakan tanda titik (.) untuk
    *                               membuat nested package
    *                             > Ketika kita menyimpan class di dalam package, maka diatas file Java nya, kita wajib menyebutkan nama
    *                               package nya
    *
    *                             > Seperti folder, bisa diakses dengan tanda titik (.)
    *                             > Contoh : programmer.zaman.now
    *                                      programmer.zaman.now.data
    *                                      programmer.zaman.now.application
    *                             > Maka otomatis didalamnya terdapat folder data dan application
    *
    *                             > programmer.zaman.now.data, programmer.zaman.now.application, Product.java
    *
    * Access Modifier           = > Access modifier adalah kemampuan membuat class, field, method dan constructor dapat diakses dari
    *                               mana saja
    *                             > Sebelumnya teman-teman sudah melihat 2 access modifier, yaitu public dan default (no-modifier)
    *                             > Sekarang kita akan bahas access modifier lainnya
    *
    *                             =====================================================================
    *                             | Modifier          | Class     | Package   | Subclass  | World     |
    *                             =====================================================================
    *                             | 1. public         | Y         | Y         | Y         | Y         |
    *                             | 2. protected      | Y         | Y         | Y         | N         | (Jarang)
    *                             | 3. no modifier    | Y         | Y         | N         | N         | (Jarang)
    *                             | 4. private        | Y         | N         | N         | N         |
    *                             =====================================================================
    *
    *                             > Public Class
    *                               > Saat kita membuat public class, kita hanya bisa membuat 1 public class di 1 file java
    *                               > Selain itu, nama public class harus sama dengan nama file
    *
    *                             > Notes!
    *                               > 1 public class = 1 file java
    *                                 Jadi usahakan buat 1 class di 1 file java jangan 1 file banyak class
    *
    *                             > Product.java, ProductApp.java, Application.java
    *
    * Import                    = > Import adalah kemampuan untuk menggunakan class yang berada di package yang berbeda
    *                             > Syarat class yang bisa digunakan jika package nya berbeda adalah class yang harus public
    *
    *                             > Class yang bisa di import hanya class public
    *                             > Notes !
    *                               > class yang ada di package java.lang sudah auto import (String, Integer, Long, Boolean, dll)
    *
    *                             > Import Semua Package :
    *                               > Jika kita ingin mengimport semua class di dalam sebuah package, kita bisa menggunakan tanda *, misal
    *                               > import eko.belajar.oop.data.*
    *
    *                             > Default Import :
    *                               > Secara default, semua class yang ada di package java.lang sudah auto import, jadi kita tidak perlu
    *                                 melakukan import secara manual
    *                               > Contoh class String, Integer, Long, Boolean, dan lain-lain terdapat di package java.lang. Oleh karena
    *                                 itu, kita tidak perlu meng-import nya secara manual
    *
    *                             > Product.java, Application.java, Data.java
    *
    * Abstract Class            = > Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract class.
    *                             > Abstract class artinya, class tersebut tidak bisa dibuat sebagai object secara langsung, hanya bisa
    *                               diturunkan
    *                             > Untuk membuat sebuah class menjadi abstract, kita bisa menggunakan kata kunci abstract sebelum kata
    *                               kunci class
    *                             > Dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk class child
    *
    *                             > Tidak dapat membuat object langsung hanya bisa diturunkan
    *                             > Mirip seperti kontrak untuk setiap keturunannya
    *
    *                             > Location.java, City.java, LocationApp.java
    *
    * Abstract Method           = > Saat kita membuat class yang abstract, kita bisa membuat abstract method juga di dalam class abstract
    *                               tersebut
    *                             > Saat kita membuat sebuah abstract method, kita tidak boleh membuat block method untuk method tersebut
    *                             > Artinya, abstract method wajib di override di class child
    *                             > Abstract method tidak boleh memiliki access modifier private
    *
    *                             > Memaksa semua turunan nya membuat abstract method ini, kecuali child nya abstract juga
    *
    *                             > Animal.java, Cat.java, AnimalApp.java
    *
    * Getter dan Setter         = > Encapsulation
    *                               > Encapsulation artinya memastikan data sensitif sebuah object tersembunyi dari akses luar
    *                               > Hal ini bertujuan agar kita bisa menjaga agar data sebuah object tetap baik dan valid
    *                               > Untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier private,
    *                                 sehingga tidak bisa diakses atau diubah dari luar
    *                               > Agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut
    *
    *                             > Getter dan Setter
    *                               > Di Java, proses encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan
    *                                 Getter dan Setter method.
    *                               > Getter adalah function yang dibuat untuk mengambil data field
    *                               > Setter ada function untuk mengubah data field
    *
    *                             Proses Encapsulation pada java
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
    *                             > Category.java, CategoryApp.java
    *
    * Interface                 = > Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class child nya.
    *                             > Namun sebenarnya yang lebih tepat untuk kontrak adalah Interface
    *                             > Jangan salah sangka bahwa Interface disini bukanlah User Interface
    *                             > Interface mirip seperti abstract class, yang membedakan adalah di Interface, semua method otomatis
    *                               abstract, tidak memiliki block
    *                             > Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa
    *                               diubah)
    *                             > Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements
    *
    *                             - Yang lebih tepat untuk kontrak terhadap class child nya bukan abstract tapi interface
    *                             - Tidak ada hubungan dengan GUI
    *                             - Perbedaan dengan Abstract :
    *                               > Semua method otomatis (public) abstract, tidak memiliki block
    *                               > Tidak boleh memiliki field, hanya boleh constant
    *                               > Tidak menggunakan extends melainkan implements
    *
    *                             > Car.java, Avanza.java, CarApp.java
    *
    * Interface Inheritance     = > Sebelumnya kita sudah tahu kalo di Java, child class hanya bisa punya 1 class parent
    *                             > Namun berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface
    *                             > Bahkan interface pun bisa implement interface lain, bisa lebih dari 1. Namun jika interface ingin
    *                               mewarisi interface lain, kita menggunakan kata kunci extends, bukan implements
    *
    *                             - Sebuah child class bisa implements lebih dari 1 interface
    *                             - Interface pun bisa extends interface lain lebih dari 1 (interface to interface menggunakan extends bukan
    *                               implements)
    *
    *                             > Car.java, HasBrand.java, isMaintenance.java, Avanza.java
    *
    * Default Method            = > Sebelumnya kita tahu bahwa di interface, kita tidak bisa membuat method konkrit yang memiliki block
    *                               method
    *                             > Namun sejak versi Java 8, ada fitur default method di interface.
    *                             > Fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang
    *                               implement interface tersebut
    *                             > Ketika kita menambah satu method di interface, secara otomatis semua class yang implement akan rusak
    *                               karena harus meng-override method tersebut
    *                             > Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface.
    *
    *                             - Untuk menambahkan konkrit method pada interface
    *                             - Membuat method pada interface tanpa wajib di override di class konkrit turunannya
    *                             - Hanya bisa di java versi 8 keatas
    *
    *                             > Car.java, HasBrand.java, isMaintenance.java, Avanza.java, Bus.java
    *
    * ToString Method           = > toString() adalah method yang terdapat di class Object
    *                             > Method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String
    *                             > Secara default, toString() ini akan menghasilkan :
    *                               > namaclass + @ + hashCode
    *                             > Namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca
    *
    *                             > Untuk mengubah representasi string, cukup meng-Override method .toString nya aja
    *
    *                             > Product.java, ProductApp.java
    *
    * Equals Method             = > Hal yang agak membingungkan di Java adalah, cara membandingkan object
    *                             > Di bahasa pemrograman lain, untuk mengecek apakah sebuah object sama, biasanya menggunakan operator ==,
    *                               di Java, operator == hanya untuk mengecek data primitif
    *                             > Untuk non primitif pengecekan nya menggunakan method equals
    *                             > Dan secara default, method equals itu akan membandingkan dua buah object secara kesamaan posisi object
    *                               di memory, artinya jika kita membuat 2 object yang isi fields nya sama, tetap dianggap beda oleh method
    *                               equals
    *                             > Oleh karena itu, ada baiknya kita meng-override method equals milik class Object tersebut
    *
    *                             > Di bahasa pemrograman lain untuk mengecek apakah sebuah object sama, dengan menggunakan (==)
    *                             > Di java operator (==) hanya untuk mengecek data primitif
    *                             > Untuk non-primitif menggunakan equals
    *                             > Lebih baik meng-Override method equals
    *                             > Cara generate (AUTO):
    *                             > Code -> Generate... -> equals() and hashCode() -> Pilih IntelliJ Default -> Pilih semua variable/field include
    *                               equals() & hashCode() -> biarkan jika ada variable yang boleh null -> create
    *
    *                             > Product.java, ProductApp.java, EqualsApp.java
    *
    * HashCode Method           = > Method hashCode adalah method representasi integer object kita, mirip toString yang merupakan
    *                               representasi String, hashCode adalah representasi integer
    *                             > HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, Set, dan lain-lain,
    *                               karena cukup menggunakan hashCode method untuk mendapatkan identitas unique object kita
    *                             > Secara default hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa
    *                               mengoverride nya jika kita ingin
    *
    *                             > Kontrak HashCode Method :
    *                               > Tidak mudah meng-override method hashCode, karena ada kontraknya :
    *                                 > Sebanyak apapun hashCode dipanggil, untuk object yang sama, harus menghasilkan data integer
    *                                   yang sama
    *                                 > Jika ada 2 object yang sama jika dibandingkan menggunakan method equals, maka nilai hashCode nya
    *                                   juga harus sama
    *                                 > Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan jumlah
    *                                   integer sekitar 2 milyar
    *
    *                             > Method representasi integer object kita
    *                             > Disarankan untuk meng-override hashCode
    *                             > Tidak mudah meng-override method hashCode, karena ada kontraknya :
    *                               > 1. sebanyak apapun hashCode dipanggil, untuk object yang sama, harus menghasilkan data integer yang sama
    *                               > 2. jika ada 2 object yang sama jika dibandingkan menggunakan method equals, maka nilai hashCode nya juga
    *                                    harus sama
    *                               > 3. Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan jumlah
    *                                    integer sekitar 2 milyar
    *
    *                             > Product.java, ProductApp.java
    *
    * Final Class               = > Sebelumnya kita pernah menggunakan kata kunci final di Java
    *                             > Jika digunakan di variable, maka variable tersebut tidak bisa berubah lagi datanya
    *                             > Final pun bisa digunakan di class, dimana jika kita menggunakan kata kunci final sebelum class, maka
    *                               kita menandakan bahwa class tersebut tidak bisa diwariskan lagi
    *                             > Secara otomatis semua class child nya akan error
    *
    *                             > Artinya class tidak dapat diwariskan lagi
    *
    *                             > SocialMedia.java
    *
    * Final Method              = > Kata kunci final juga bisa digunakan di Method
    *                             > Jika sebuah method kita tambahkan kata kunci final, maka artinya method tersebut tidak bisa di
    *                               override lagi di class child nya
    *                             > Ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi
    *                               oleh class child nya
    *
    *                             > Artinya method tersebut tidak bisa di override di class child nya
    *                             > Sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi oleh class
    *                               child nya
    *
    *                             > SocialMedia.java
    *
    * Inner Class               = > Di Java, kita bisa membuat class di dalam class, atau disebut dengan Inner Class
    *                             > Salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class yang
    *                               saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain
    *                             > Misal kita perlu membuat class Employee, dimana membutuhkan class Company, maka kita bisa membuat class
    *                               Employee sebagai inner class Company
    *                             > Cara membuat inner class, cukup membuatnya di dalam blok class outer class nya
    *
    *                             > Class didalam class
    *                             > Keuntungan :
    *                               > Kemampuan untuk mengakses outer class nya
    *                               > Inner class bisa membaca semua private member yang ada di outer class nya
    *                               > Untuk mengakses object outer class nya, kita bisa menggunakan nama class outer nya diikuti dengan
    *                                 kata kunci this, misalnya Company.this
    *                               > Dan untuk mengakses super class outer class nya, kita bisa menggunakan nama class outernya diikuti
    *                                 dengan kata kunci super, misal Company.super
    *
    *                             > Company.java, CompanyApp.java
    *
    * Anonymous Class           = > Anonymous class atau class tanpa nama.
    *                             > Adalah kemampuan mendeklarasikan class, sekaligus meng-instansiasi object-nya secara langsung
    *                             > Anonymous class sebenarnya termasuk inner class, dimana outer class nya adalah tempat dimana kita membuat
    *                               anonymous class tersebut
    *                             > Anonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface atau
    *                               abstract class sederhana, tanpa harus membuat implementasi class nya
    *
    *                             > Class tanpa nama
    *                             > Termasuk inner class, dimana outer class nya adalah tempat dimana kita membuat anonymous class tersebut
    *                             > Sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface atau abstract class
    *                               sederhana, tanpa harus membuat implementasi classnya
    *
    *                             > HelloWorld.java, HelloWorldApp.java
    *
    * Static Keyword            = > Sebelumnya kita sudah sering melihat kata kunci static, namun belum pernah kita bahas
    *                             > Dengan menggunakan kata kunci static, kita bisa membuat field, method atau class bisa diakses langsung
    *                               tanpa melalui object nya
    *                             > Perlu diingat, static hanya bisa mengakses static lainnya
    *
    *                             > Static Dapat Digunakan di :
    *                               > Field, atau disebut class variable, artinya field tersebut bisa diakses langsung tanpa membuat object
    *                                 terlebih dahulu
    *                               > Method, atau disebut class method, artinya method tersebut bisa diakses langsung tanpa membuat object
    *                                 terlebih dahulu
    *                               > Block, static block akan otomatis dieksekusi ketika sebuah class di load
    *                               > Inner Class, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat object
    *                                 outer class  terlebih dahulu. Static pada inner class menyebabkan kita tidak bisa mengakses lagi
    *                                 object outer class nya
    *
    *                             > dengan static keyword, kita bisa membuat field, method atau class bisa diakses langsung tanpa melalui
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
    *
    *                             > Constant.java, MathUtil.java, Country.java, data.Application.java, StaticApp.java
    *
    * Record Class              = > Fitur ini masih versi preview dan belum stabil di versi Java 14, namun kita sudah bisa mencobanya
    *                             > Tapi perlu diingat, bahwa karena fitur ini masih experimental, artinya tidak ada jaminan di versi Java
    *                               mendatang, fitur ini akan tetap ada, bisa saja dihilangkan
    *
    *                             > Kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya berisi getter, equals, hashCode,
    *                               dan toString method
    *                             > Record class digunakan untuk mempermudah pembuatan jenis class tersebut
    *                             > Saat kita membuat record class, secara otomatis Java akan membuatkan getter, equals, hashCode dan toString
    *                               method secara otomatis, dan
    *                               juga constructor secara otomatis
    *                             > Saat membuat record class, secara otomatis kita akan meng-extends class java.lang.Record, yang artinya kita
    *                               tidak bisa extends class lain. Namun kita tetap bisa meng-implement interface
    *
    *                             > Record Class Constructor :
    *                               > Secara default, constructor di record class akan dibuat secara otomatis, sesuai dengan definisi record
    *                                 class parameter
    *                               > Namun jika kita ingin melakukan sesuatu di constructor tersebut, kita bisa membuat compact constructor,
    *                                 yaitu constructor tanpa tanda ()
    *                               > Selain itu, kita juga bisa melakukan constructor overloading, namun ada syaratnya, yaitu constructor
    *                                 overloading nya harus tetap memanggil constructor utama yang secara otomatis dibuatkan di record class
    *
    *                             > Di java 15 masih eksperimental
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
    *
    *                             > LoginRequest.java, RecordApp.java
    *
    * Enum Class                = > Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas
    *                             > Misal, gender, ada male dan female, atau tipe customer, ada standard, premium atau vip, dan lain-lain
    *                             > Dalam kasus seperti ini, kita bisa menggunakan enum class, yaitu class yang berisikan nilai terbatas yang
    *                               sudah ditentukan
    *                             > Saat membuat enum class, secara otomatis dia akan meng-extends class java.lang.Enum, oleh karena itu class
    *                               enum tidak bisa extends class lain, namun masih tetap bisa implements interface.
    *
    *                             > Enum Members :
    *                               > Sama seperti class biasanya, di class enum pun kita bisa menambahkan members (field, method dan constructor)
    *                               > Khusus constructor, kita tidak bisa membuat public constructor, karena memang tujuan enum bukan untuk di
    *                                 instansiasi secara bebas
    *
    *                             > Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas
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
    *
    *                             > Level.java, Customer.java, EnumApp.java
    *
    * Exception                 = > Saat kita membuat aplikasi, kita tidak akan terhindar dengan yang namanya error
    *                             > Di Java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam bentuk class
    *                               exception
    *                             > Kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh Java
    *                             > Jika kita ingin membuat exception, maka kita harus membuat class yang extends class Throwable atau
    *                               turunan-turunannya
    *
    *                             > Membuat Exception :
    *                               > Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka
    *                                 method tersebut harus ditandai dengan kata kunci throws diikuti dengan class exception nya.
    *                               > Jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambah
    *                                 lebih dari satu class exception
    *                               > Di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw,
    *                                 diikuti dengan object exception nya
    *
    *                             > Try Catch
    *                               > Saat kita memanggil sebuah function yang bisa menyebabkan exception, maka kita wajib menggunakan try-catch
    *                                 expression di Java
    *                               > Ini gunanya agar kita bisa menangkap exception yang terjadi, karena jika tidak ditangkap, lalu terjadi
    *                                 exception, maka secara otomatis program kita akan berhenti
    *                               > Cara menggunakan try-catch expression di java sangat mudah, di block try, kita tinggal panggil method yang
    *                                 bisa menyebabkan exception, dan di block catch, kita bisa melakukan sesuatu jiga terjadi exception
    *
    *                             > Finally Keyword :
    *                               > Dalam try-catch, kita bisa menambahkan block finally
    *                               > Block finally ini adalah block dimana akan selalu dieksekusi baik terjadi exception ataupun
    *                                 tidak
    *                               > Ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal
    *                                 di block try kita ingin membaca file, di block catch kita akan tangkap jika terjadi error, dan
    *                                 di block finally error ataupun sukses membaca file, kita wajib menutup koneksi ke file tersebut,
    *                                 biar tidak menggantung di memory
    *
    *                             > ValidationException.java, LoginRequest.java, ValidationUtil.java, ValidationApp.java
    *
    * Runtime Exception         = > Secara garis besar, di Java, exception dibagi menjadi 3 jenis :
    *                               > Checked Exception, yaitu exception yang wajib di try catch, seperti yang sudah kita bahas
    *                                 sebelumnya
    *                               > Runtime Exception, dan
    *                               > Error (yang akan kita bahas di materi selanjutnya)
    *
    *                             > Runtime Exception :
    *                               > Runtime exception  adalah jenis exception yang tidak wajib di tangkap menggunakan try catch
    *                               > Kompiler Java tidak akan protes walaupun kita tidak menggunakan try catch ketika kita memanggil
    *                                 method yang bisa menyebabkan runtime exception
    *                               > Untuk membuat class runtime exception, kita wajib mengextends class RuntimeException
    *                               > Ada banyak di Java yang merupakan runtime exception, seperti NullPointerException,
    *                                 IllegalArgumentException, dan lain-lain
    *
    *                             > Perlu Diperhatikan :
    *                               > Walaupun runtime exception tidak wajib di try-catch, tapi ada baiknya kita tetap melakukan
    *                                 try-catch
    *                               > Karena jika terjadi runtime exception, yang ditakutkan adalah program kita berhenti
    *
    *                             > BlankException.java, ValidationUtil.java, ValidationApp.java
    *
    * Error                     = > Error adalah jenis exception yang terakhir
    *                             > Error adalah sebuah class di Java, yang tidak direkomendasikan untuk di try-catch
    *                             > Biasanya error terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk di
    *                               try catch
    *                             > Artinya, direkomendasikan untuk mematikan aplikasi
    *                             > Contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi ke database, direkomendasikan untuk
    *                               membuat exception jenis Error, dan menghentikan aplikasi
    *
    *                             > DatabaseError.java, DatabaseApp.java
    *
    * StackTraceElement Class   = > Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan Array dari
    *                               StackTraceElement object
    *                             > StackTraceElement berisikan informasi tentang, class, file bahkan baris lokasi terjadinya error
    *                             > Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi
    *                             > Cara yang paling mudah, kita bisa memanggil method printStackTrace() class Throwable, untuk
    *                               memprint ke console detail error StackTraceElement nya
    *
    *                             > StackTraceApp.java
    *
    * Try With Resource         = > Di Java 7, terdapat fitur baru yang bernama try with resource
    *                             > Try with resource adalah sebuah mekanisme agar kita lebih mudah menggunakan resource
    *                               (yang wajib di close) dalam block try
    *                             > Jika kita ingin menggunakan fitur ini, kita wajib menggunakan interface AutoCloseable
    *
    *                             > LANGKAH :
    *                               > Buat File baru, README.md (di belajar-java-oop)
    *
    *                             > README.md, ReadApp.java
    *
    * Annotation                = > Annotation adalah menambahkan metadata ke kode program yang kita buat
    *                             > Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat kita ingin membuat
    *                               library / framework
    *                             > Annotation sendiri bisa diakses menggunakan Reflection, yang akan kita bahas nanti
    *                             > Untuk membuat annotation, kita bisa menggunakan kata kunci @interface
    *                             > Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value
    *
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
