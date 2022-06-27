public class ktp {
    String nikktp;
    String namaktp;
    String tempatlahirktp;
    String tangallahirktp;
    String alamatktp;

    public ktp(String nik, String nama, String tempatlahir, String tanggallahir, String alamat){
        this.nikktp = nik;
        this.namaktp = nama;
        this.tempatlahirktp = tempatlahir;
        this.tangallahirktp = tanggallahir;
        this.alamatktp = alamat;
    }

    public void ktpPrint () {
        System.out.println("Data ktp anda adalah :");
        System.out.println(this.nikktp);
        System.out.println(this.namaktp);
        System.out.println(this.tempatlahirktp);
        System.out.println(this.tangallahirktp);
        System.out.println(this.alamatktp);
    }

    
}
