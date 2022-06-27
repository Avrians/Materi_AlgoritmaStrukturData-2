import Model.Perhitungan;

public class JalankanPerhitungan {

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);
        s.PrintJudul();
        System.out.println("Tanpa Parameter");
        s.HitungTambah();
        s.HitungKali();

        System.out.println("\nDengan Parameter");
        s.HitungTambah(5, 6);
        s.HitungKali(5, 6);

    }                                                                                  // @Avriansyah 
    
}
