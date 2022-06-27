public class KTP2 {
    public String no;
    public String namalengkap;
    public String alamat;
    public String dob;
    public String pob;
    public String pekerjaan;
    public String status;

    public KTP2() {

    }

    public KTP2(String n, String nl, String al, String tgl, String tmpt, String kerja, String st) {
        this.no = n;
        this.namalengkap = nl;
        this.alamat = al;
        this.dob = tgl;
        this.pob = tmpt;
        this.pekerjaan = kerja;
        this.status = st;
    }

    public void cetakStatus(String mystatus) {
        switch(mystatus) {
            case "married":
                System.out.println("Beneran married???");
                break;
            case "single":
                System.out.println("Kapan married nya??");
                break;
            default:
                break;
        }
    }

}
