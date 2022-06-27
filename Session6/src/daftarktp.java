public class daftarktp {

    // Modelnya menggunakan KTP
    public static void main(String[] args) {
        System.out.println("Aplikasi Form Pendaftaran Ktp");
        System.out.println("=============================");

        ktp kevin = new ktp("3324", "kevin", "brebes", "10", "brebeskota");
        kevin.ktpPrint();
    }
    
}
