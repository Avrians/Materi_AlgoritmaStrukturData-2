package Model;

import interfaces.Contohinterface;

public class Perhitungan implements Contohinterface {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a, int _b, int _hasil){
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
        printJudulClass("Print judul dalam Class Perhitungan");
    }

    private void printJudulClass(String jdl) {
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("Judul Dalam Interface");
    }

    @Override
    public void HitungTambah() {
        // TODO Auto-generated method stub
        this.hasil = this.a + this.b;
        System.out.println(this.hasil = this.a + this.b);
    }

    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
        this.hasil = this.a * this.b;
        System.out.println(this.hasil = this.a * this.b);
    }
    
}
